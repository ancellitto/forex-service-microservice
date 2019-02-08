
/**
 * A rest Controller that recieves the requests to get the exchange rates
 * @author ancel litto
 */
package com.ancel.microservice.forex.forexservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexController {
	@Autowired
	private Environment environment;
	@Autowired
	private ExchangeValueRepository repository;

	/**
	 * requests are routed through this method
	 * 
	 * @param from
	 *            the Currency Code of the Source
	 * @param to
	 *            the Currency Code of the Destination
	 * @return
	 */
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}
}

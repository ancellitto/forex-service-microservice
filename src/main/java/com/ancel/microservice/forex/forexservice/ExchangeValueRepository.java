
/**
 * Repository which will retrive the dummy data that has been added using the data.sql file
 * @author ancel litto
 */
package com.ancel.microservice.forex.forexservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}

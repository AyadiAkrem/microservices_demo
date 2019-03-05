package be.capyx.erp.ms.fleet.fleetmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FleetManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetManagerApplication.class, args);
	}

}

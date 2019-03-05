package be.capyx.erp.ms.master.erpmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ErpMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpMasterApplication.class, args);
	}

}

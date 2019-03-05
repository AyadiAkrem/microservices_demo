package be.capyx.erp.ms.master.erpmaster.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {


    // The Load Balenced is add to make the RestTemplate looking for the url related to the ms name set on the URL (fleet-manager) in this case.
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

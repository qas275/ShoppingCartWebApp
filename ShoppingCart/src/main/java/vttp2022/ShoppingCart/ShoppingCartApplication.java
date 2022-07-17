package vttp2022.ShoppingCart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class ShoppingCartApplication {
    private Logger logger  = LoggerFactory.getLogger(ShoppingCartApplication.class);
	
	@Bean
	public CommonsRequestLoggingFilter requestLoggerFilter(){ //runs upon connection to client to display logs requested below
		CommonsRequestLoggingFilter requestLoggingFilter = new CommonsRequestLoggingFilter();
		requestLoggingFilter.setIncludeClientInfo(true);
		requestLoggingFilter.setIncludeHeaders(true);
		requestLoggingFilter.setIncludeQueryString(true);
		requestLoggingFilter.setIncludePayload(true);
		return requestLoggingFilter;
	}
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ShoppingCartApplication.class);
		
		app.run(args);
	}

}

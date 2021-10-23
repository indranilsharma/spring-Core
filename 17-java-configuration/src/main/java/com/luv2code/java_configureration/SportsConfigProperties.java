package com.luv2code.java_configureration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//it will take field level injection from properties file 
@PropertySource("classpath:sports.properties") 

public class SportsConfigProperties {

	
	@Bean
    public static PropertySourcesPlaceholderConfigurer
                    propertySourcesPlaceHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
	
	@Bean
	public IFortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// define bean and inject dependency 
	@Bean
	public ICoach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}

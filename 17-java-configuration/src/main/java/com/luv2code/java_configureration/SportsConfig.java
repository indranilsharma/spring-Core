package com.luv2code.java_configureration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@ComponentScan("com.luv2code.java_configureration") 
//@ComponentScan commented because we manually define our bean at @bean  

//it will take field level injection from properties file 
//@PropertySource("classpath:sports.properties") 

public class SportsConfig {

	
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
//		method name default class name of starting lower case
		return new SwimCoach(sadFortuneService());
	}
}

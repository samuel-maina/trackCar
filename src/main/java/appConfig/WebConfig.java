package appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import LocationObject.dataPoint;
@Configuration
@EnableWebMvc
@ComponentScan("Controllers,RestServicesControllers,DataPersistence,LocationObject,service")
public class WebConfig implements WebMvcConfigurer{
	@Bean
	//m
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver= new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}
		@Bean
		public dataPoint datapoint() {
			dataPoint dp=new dataPoint();
		return dp;
		
	}


}

package io.spring.festa;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/*
 * usada se nossa aplicação for executada em um servidor externo, como um Apache Tomcat em produção, por exemplo.
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GestaoFestaApplication.class);
	}

}

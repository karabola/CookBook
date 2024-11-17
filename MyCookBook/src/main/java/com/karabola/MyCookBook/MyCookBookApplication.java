package com.karabola.MyCookBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyCookBookApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyCookBookApplication.class, args);
//		PastaDishes pastaDishes = context.getBean(PastaDishes.class);
	}

}

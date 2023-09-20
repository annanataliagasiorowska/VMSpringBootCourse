package com.wmcourse.warehouseapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WarehouseAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(WarehouseAppApplication.class, args);
		String[] beanNames = context.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			Object bean = context.getBean(beanName);

			// Check if the bean was created and configured by you
			if (bean.getClass().getPackage().getName().startsWith("com.wmcourse.warehouseapp")) {
				System.out.println("Bean Name: " + beanName);
			}
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}
}

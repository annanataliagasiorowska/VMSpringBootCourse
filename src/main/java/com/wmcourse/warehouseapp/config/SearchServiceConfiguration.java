package com.wmcourse.warehouseapp.config;

import com.wmcourse.warehouseapp.article.FirstSearchTextGenerator;
import com.wmcourse.warehouseapp.article.SecondSearchTextGenerator;
import com.wmcourse.warehouseapp.article.ThirdSearchTextGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SearchServiceConfiguration {

    @Bean
    public FirstSearchTextGenerator firstSearchTextGenerator() {
        return new FirstSearchTextGenerator();
    }

    @Bean
    public SecondSearchTextGenerator secondSearchTextGenerator() {
        return new SecondSearchTextGenerator();
    }

    @Bean
    public ThirdSearchTextGenerator thirdSearchTextGenerator() {
        return new ThirdSearchTextGenerator();
    }
}

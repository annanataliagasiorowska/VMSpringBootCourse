package com.wmcourse.warehouseapp.config;

import com.wmcourse.warehouseapp.article.ArticlePriceManagementService;
import com.wmcourse.warehouseapp.article.ArticlePropertiesManagementService;
import com.wmcourse.warehouseapp.article.ArticleSearchEngineService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SubServiceConfiguration {

    @Bean
    public ArticlePriceManagementService articlePriceManagementService() {

        return new ArticlePriceManagementService();
    }

    @Bean
    public ArticlePropertiesManagementService articlePropertiesManagementService() {
        return new ArticlePropertiesManagementService();
    }

    @Bean
    public ArticleSearchEngineService articleSearchEngineService() {

        return new ArticleSearchEngineService();
    }






}

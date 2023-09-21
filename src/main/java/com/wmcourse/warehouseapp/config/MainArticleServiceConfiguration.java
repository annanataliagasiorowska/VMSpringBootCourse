package com.wmcourse.warehouseapp.config;

import com.wmcourse.warehouseapp.article.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainArticleServiceConfiguration {

    private final ArticlePriceManagementService articlePriceManagementService;
    private final ArticlePropertiesManagementService articlePropertiesManagementService;
    private final ArticleSearchEngineService articleSearchEngineService;

    @Autowired
    public MainArticleServiceConfiguration(ArticlePriceManagementService priceManagementService,
                                           ArticlePropertiesManagementService propertiesManagementService,
                                           ArticleSearchEngineService searchEngineService) {
        this.articlePriceManagementService = priceManagementService;
        this.articlePropertiesManagementService = propertiesManagementService;
        this.articleSearchEngineService = searchEngineService;
    }


    @Bean
    public ArticleService articleService() {
        return new ArticleService(articlePriceManagementService,
                articlePropertiesManagementService,
                articleSearchEngineService);
    }

    @Bean
    public ArticleRepository articleRepository() {
        return new ArticleRepository();
    }

    @Bean
    public ArticleController articleController() {
        return new ArticleController();
    }



}

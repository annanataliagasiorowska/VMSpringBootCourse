package com.wmcourse.warehouseapp.config;

import com.wmcourse.warehouseapp.article.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SubServiceConfiguration {

    private final List<SearchTextGenerator> searchTextGeneratorList;

    @Autowired
    public SubServiceConfiguration(List<SearchTextGenerator> searchTextGeneratorList) {
        this.searchTextGeneratorList = searchTextGeneratorList;
    }

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
        return new ArticleSearchEngineService(searchTextGeneratorList);
    }



}

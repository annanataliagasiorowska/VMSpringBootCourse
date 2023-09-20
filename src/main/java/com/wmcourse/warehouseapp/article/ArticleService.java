package com.wmcourse.warehouseapp.article;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArticleService {

    private final ArticlePriceManagementService articlePriceManagementService;
    private final ArticlePropertiesManagementService articlePropertiesManagementService;
    private final ArticleSearchEngineService articleSearchEngineService;

    public ArticleService(ArticlePriceManagementService priceManagementService,
                          ArticlePropertiesManagementService propertiesManagementService,
                          ArticleSearchEngineService searchEngineService) {
        this.articlePriceManagementService = priceManagementService;
        this.articlePropertiesManagementService = propertiesManagementService;
        this.articleSearchEngineService = searchEngineService;
    }
}

package com.wmcourse.warehouseapp.article;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ArticleSearchEngineService {

    private final List<SearchTextGenerator> searchTextGeneratorList;

    public ArticleSearchEngineService(List<SearchTextGenerator> searchTextGeneratorList) {
        this.searchTextGeneratorList = searchTextGeneratorList;
    }

    public void search() {
        for (SearchTextGenerator textGenerator : searchTextGeneratorList) {
            textGenerator.generateSearchText();
        }
    }


}

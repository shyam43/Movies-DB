package com.joaquimley.core.data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by srikrishna on 04/05/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultsWrapper {

    @JsonProperty("page")
    public int page;
    @JsonProperty("results")
    public List<CharacterMarvel> results;
    @JsonProperty("total_results")
    public int total_results;
    @JsonProperty("total_pages")
    public int total_pages;

    public ResultsWrapper() {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<CharacterMarvel> getResults() {
        return results;
    }

    public void setResults(List<CharacterMarvel> results) {
        this.results = results;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }
}

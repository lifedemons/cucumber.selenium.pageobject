package com.cucumber.selenium.pageobject.example.steps;

import com.cucumber.selenium.pageobject.example.pages.SearchPage;
import cucumber.api.java8.En;

public class SearchScenario implements En {

    private SearchPage searchPage;

    public SearchScenario(SearchPage searchPage) {
        this.searchPage = searchPage;

        defineSteps();
    }

    private void defineSteps() {
        Given("^the page is open \"([^\"]*)\"$", (String page) -> searchPage.open(page));

        When("^I search for \"([^\"]*)\"$", (String search) -> searchPage.doSearch(search));

        Then("^a browser title should contains \"([^\"]*)\"$", (String text) -> searchPage.checkTitleContains(text));
    }

}

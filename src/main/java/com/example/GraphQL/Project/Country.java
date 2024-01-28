package com.example.GraphQL.Project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

  @JsonProperty("country")
  private String countryName;

  @JsonProperty("cases")
  private int cases;

  @JsonProperty("todayCases")
  private int todayCases;

  @JsonProperty("deaths")
  private int deaths;

  @JsonProperty("todayDeaths")
  private int todayDeaths;

  @JsonProperty("recovered")
  private int recovered;

  @JsonProperty("todayRecovered")
  private int todayRecovered;

  public String getCountry() {
    return countryName;
  }

  public int getCases() {
    return cases;
  }

  public int getTodayCases() {
    return todayCases;
  }

  public int getDeaths() {
    return deaths;
  }

  public int getTodayDeaths() {
    return todayDeaths;
  }

  public int getRecovered() {
    return recovered;
  }

  public int getTodayRecovered() {
    return todayRecovered;
  }

  public void setCountry(String country) {
    this.countryName = country;
  }

  public void setCases(int cases) {
    this.cases = cases;
  }

  public void setTodayCases(int todayCases) {
    this.todayCases = todayCases;
  }

  public void setDeaths(int deaths) {
    this.deaths = deaths;
  }

  public void setTodayDeaths(int todayDeaths) {
    this.todayDeaths = todayDeaths;
  }

  public void setRecovered(int recovered) {
    this.recovered = recovered;
  }

  public void setTodayRecovered(int todayRecovered) {
    this.todayRecovered = todayRecovered;
  }
}

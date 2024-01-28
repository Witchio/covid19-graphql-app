package com.example.GraphQL.service;

import com.example.GraphQL.Project.Country;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class JsonFileReaderService {

  private List<Country> data;

  public JsonFileReaderService() throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    InputStream is = getClass().getResourceAsStream("/data/covid-data.json");
    TypeReference<List<Country>> typeReference = new TypeReference<>() {};
    data = mapper.readValue(is, typeReference);
  }

  public Country getCountry(String name) {
    for (Country country : data) {
      if (country.getCountry().equalsIgnoreCase(name)) {
        return country;
      }
    }

    return null;
  }

  public List<String> getCountriesList() {
    List<String> countries = new ArrayList<>();
    for (Country country : data) {
      countries.add(country.getCountry());
    }

    return countries;
  }

  public Country getCountryWithMaxCases() {
    Country maxCasesCountry = null;
    int maxCases = Integer.MIN_VALUE;

    for (Country country : data) {
      if (country.getCases() > maxCases) {
        maxCases = country.getCases();
        maxCasesCountry = country;
      }
    }

    return maxCasesCountry;
  }

  public Country getCountryWithMinCases() {
    Country minCasesCountry = null;
    int minCases = Integer.MAX_VALUE;

    for (Country country : data) {
      if (country.getCases() < minCases) {
        minCases = country.getCases();
        minCasesCountry = country;
      }
    }

    return minCasesCountry;
  }
}

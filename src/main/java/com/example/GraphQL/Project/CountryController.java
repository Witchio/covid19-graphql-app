package com.example.GraphQL.Project;

import com.example.GraphQL.service.JsonFileReaderService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CountryController {

  private JsonFileReaderService jsonFileReaderService;

  public CountryController() {
    try {
      jsonFileReaderService = new JsonFileReaderService();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @QueryMapping
  public Country country(@Argument String name) {
    return jsonFileReaderService.getCountry(name);
  }

  @QueryMapping
  public List<Country> countries(@Argument List<String> names) {
    List<Country> countries = new ArrayList<>();
    for (String name : names) {
      Country country = jsonFileReaderService.getCountry(name);
      countries.add(country);
    }
    return countries;
  }

  @QueryMapping
  public List<String> countriesList() {
    return jsonFileReaderService.getCountriesList();
  }

  @QueryMapping
  public Country maxCases() {
    return jsonFileReaderService.getCountryWithMaxCases();
  }

  @QueryMapping
  public Country minCases() {
    return jsonFileReaderService.getCountryWithMinCases();
  }
}

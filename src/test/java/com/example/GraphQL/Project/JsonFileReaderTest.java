package com.example.GraphQL.Project;

import com.example.GraphQL.service.JsonFileReaderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonFileReaderTest {

    JsonFileReaderService jsonFileReaderService;
    @BeforeEach
    public void setUp() throws IOException {
        jsonFileReaderService = new JsonFileReaderService();
    }

    @Test
    void testGetCountry() {
        Country country = jsonFileReaderService.getCountry("France");
        assertEquals ("France", country.getCountryName());
    }
}

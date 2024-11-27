package com.example.liter;

import com.example.liter.model.apiResponse;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class connect {

    public static apiResponse buscarTaxas(String apiKey) {
        URI endereco = URI.create("https://gutendex.com/books/?search=" + apiKey);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        HttpResponse<String> response;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        apiResponse apiResponse = new Gson().fromJson(response.body(), apiResponse.class);
        return new apiResponse(apiResponse.results());
    }
}

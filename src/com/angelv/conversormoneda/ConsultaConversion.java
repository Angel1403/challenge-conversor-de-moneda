package com.angelv.conversormoneda;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {
    public Moneda realizaConversion (String moneda_base, String moneda_destino, double cantidad) {
        String api_key = System.getenv("API_KEY");
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + api_key + "/pair/" + moneda_base + "/" + moneda_destino + "/" + cantidad + "/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                return new Gson().fromJson(response.body(), Moneda.class);
            } else {
                throw new RuntimeException("Error al realizar la solicitud a la API: " + response.statusCode());
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al procesar la respuesta de la API", e);
        }
    }
}

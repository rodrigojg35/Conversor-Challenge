package com.jurado.conversorchallenge.servicios;

import com.google.gson.Gson;
import com.jurado.conversorchallenge.modelos.RespuestaExito;
import com.jurado.conversorchallenge.modelos.RespuestaError;
import com.jurado.conversorchallenge.modelos.Tasas;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class Conversor {

    private static final String API_KEY = "5d0fc1ec24b3afc746cb82df";
    private static final String URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";
    private static final Tasas tasas;

    static {
        try {

            // Cliente HTTP
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .build();

            // Solicitud
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(URL))
                    .build();

            // Respuesta
            HttpResponse<String> response = httpClient.send(
                    request,
                    HttpResponse.BodyHandlers.ofString());

            // Procesar respuesta según el resultado
            String responseBody = response.body();
            Gson gson = new Gson();

            // Mapear respuesta exitosa
            if (responseBody.contains("\"result\":\"success\"")) {
                RespuestaExito respuesta = gson.fromJson(responseBody, RespuestaExito.class);
                tasas = respuesta.tasas();
            }else{
                // Mapear (y manejar) posible error
                RespuestaError error = gson.fromJson(responseBody, RespuestaError.class);
                throw new RuntimeException("Error en la respuesta del servidor: " + error);
            }



        } catch (Exception e) {

            throw new RuntimeException("Error en el servidor del cliente HTTP: " + e.getMessage());
        }

    }

    public static double changeDollarToArgentinianPeso(double dollarValue) {
        return dollarValue * tasas.ARS();
    }

    public static double changeArgentinianPesoToDollar(double pesoValue) {
        return pesoValue / tasas.ARS();
    }

    public static double changeDollarToBrazilianReal(double dollarValue) {
        return dollarValue * tasas.BRL();
    }

    public static double changeBrazilianRealToDollar(double realValue) {
        return realValue / tasas.BRL();
    }

    public static double changeDollarToColombianPeso(double dollarValue) {
        return dollarValue * tasas.COP();
    }

    public static double changeColombianPesoToDollar(double pesoValue) {
        return pesoValue / tasas.COP();
    }

}

package com.jurado.conversorchallenge.modelos;

import com.google.gson.annotations.SerializedName;

public record RespuestaExito(
        String result,
        @SerializedName("base_code") String baseCode,
        @SerializedName("conversion_rates") Tasas tasas
) {

}

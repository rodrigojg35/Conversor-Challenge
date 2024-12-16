package com.jurado.conversorchallenge.modelos;

import com.google.gson.annotations.SerializedName;

public record RespuestaError(
        String result,
        @SerializedName("error-type") String errorType)
{
}

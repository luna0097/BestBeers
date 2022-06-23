package com.example.bestbeers.data.retrofit

import com.example.bestbeers.domain.model.api.BeerApiResponse
import retrofit2.Response
import retrofit2.http.GET

interface BeerApiService {
    @GET
    fun getBeers(): Response<BeerApiResponse>
}
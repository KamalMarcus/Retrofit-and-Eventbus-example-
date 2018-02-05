package com.example.kamalmarcus.retrofitandeventbusexample.Network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Kamal Marcus on 2/5/2018.
 * kamalmarcus94@gmail.com
 * +201015793659
 */

public interface ApiInterface {
    @GET("top_rated")
    Call<MovieResponse> getMovies(@Query("api_key")String api_key);

    @GET("{id}")
    Call<MovieResponse>getMovieDetails(@Path("id")int id,@Query("api_key")String api_key);
}

package com.example.kamalmarcus.retrofitandeventbusexample.Network;

import android.util.Log;

import com.example.kamalmarcus.retrofitandeventbusexample.Constants;
import com.example.kamalmarcus.retrofitandeventbusexample.Model.MovieModel;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Kamal Marcus on 2/5/2018.
 * kamalmarcus94@gmail.com
 * +201015793659
 */

public class MoviesWebService {

    public static final String TAG =MoviesWebService.class.getName() ;

    public static void getMovies(){
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<MovieResponse> call = apiService.getMovies(Constants.API_KEY);
        call.enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse>call, Response<MovieResponse> response) {
                List<MovieModel> movieModels = response.body().getMovies();
                Log.d(TAG, "Number of movieModels received: " + movieModels.size());
                EventBus.getDefault().post(new GetMoviesList(movieModels));
            }

            @Override
            public void onFailure(Call<MovieResponse>call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }


}

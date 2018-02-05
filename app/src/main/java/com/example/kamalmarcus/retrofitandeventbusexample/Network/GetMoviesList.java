package com.example.kamalmarcus.retrofitandeventbusexample.Network;

import com.example.kamalmarcus.retrofitandeventbusexample.Model.MovieModel;

import java.util.List;

/**
 * Created by Kamal Marcus on 2/5/2018.
 * kamalmarcus94@gmail.com
 * +201015793659
 */

public class GetMoviesList {
    private List<MovieModel> moviesList;

    public GetMoviesList(List<MovieModel> moviesList) {
        this.setMoviesList(moviesList);
    }

    public List<MovieModel> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(List<MovieModel> moviesList) {
        this.moviesList = moviesList;
    }
}

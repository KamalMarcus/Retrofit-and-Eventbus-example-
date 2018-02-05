package com.example.kamalmarcus.retrofitandeventbusexample.Network;

import com.example.kamalmarcus.retrofitandeventbusexample.Model.MovieModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Kamal Marcus on 2/5/2018.
 * kamalmarcus94@gmail.com
 * +201015793659
 */

public class MovieResponse {
    @Expose
    @SerializedName("results")
    private List<MovieModel> results;
    @Expose
    @SerializedName("total_pages")
    private int total_pages;
    @Expose
    @SerializedName("total_results")
    private int total_results;
    @Expose
    @SerializedName("page")
    private int page;

    public List<MovieModel> getMovies() {
        return results;
    }

    public void setMovies(List<MovieModel> results) {
        this.results = results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

}

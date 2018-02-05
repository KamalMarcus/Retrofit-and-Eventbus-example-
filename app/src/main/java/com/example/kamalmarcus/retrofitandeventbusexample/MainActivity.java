package com.example.kamalmarcus.retrofitandeventbusexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kamalmarcus.retrofitandeventbusexample.Model.MovieModel;
import com.example.kamalmarcus.retrofitandeventbusexample.Network.GetMoviesList;
import com.example.kamalmarcus.retrofitandeventbusexample.Network.MoviesWebService;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MoviesWebService.getMovies();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMoviesListRetrieved(GetMoviesList getMoviesList){
        List<MovieModel> moviesList = getMoviesList.getMoviesList();
        for(MovieModel movieModel:moviesList){
            System.out.println(movieModel.getTitle());
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}

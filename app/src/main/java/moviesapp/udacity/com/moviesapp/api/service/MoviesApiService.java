package moviesapp.udacity.com.moviesapp.api.service;

import io.reactivex.Single;
import moviesapp.udacity.com.moviesapp.api.model.response.FetchMoviesResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MoviesApiService {

    @GET("popular")
    Single<Response<FetchMoviesResponse>> fetchPopularMovies(@Query("api_key") String apiKey);

    @GET("top_rated")
    Single<Response<FetchMoviesResponse>> fetchTopRatedMovies(@Query("api_key") String apiKey);

}

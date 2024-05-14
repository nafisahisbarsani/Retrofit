package com.example.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TeamService {
    //endpoint
    @GET("search_all_teams.php?l=English%20Premier%20League")//endppoint
    Call<TeamResponse> getTeams();

}

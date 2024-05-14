package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TeamResponse {
    private List<Team> teams;

    public List<Team> getTeams() {
        return teams;
    }
}
// yang menampilakan hasil team, menggunakan rv
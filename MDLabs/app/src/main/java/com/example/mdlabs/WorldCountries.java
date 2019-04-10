package com.example.mdlabs;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class WorldCountries {


    @SerializedName("worldpopulation")

    private List<Countries> worldpopulation = null;

    public List<Countries> getWorldpopulation() {
        return worldpopulation;
    }
}

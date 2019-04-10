package com.example.mdlabs;

import com.google.gson.annotations.SerializedName;

public class Countries {

    @SerializedName("rank")
    private int rank;

    @SerializedName("country")
    private String country;

    @SerializedName("population")
    private String population;

    @SerializedName("flag")
    private String flag;

    public int getRank() {
        return rank;
    }


    public String getFlag() {
        return flag;
    }


    public String getCountry() {
        return country;
    }


    public String getPopulation() {
        return population;
    }


}



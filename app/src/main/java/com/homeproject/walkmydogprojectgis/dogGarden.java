package com.homeproject.walkmydogprojectgis;

public class dogGarden {
    private String id;
    private double geoPointX;
    private double geoPointY;
    private String displayName;
    private DogGardenRank rank;
    private String cityName;


    public dogGarden(String id, double geoPointX, double geoPointY, String displayName, DogGardenRank rank, String cityName) {
        this.id = id;
        this.geoPointX = geoPointX;
        this.geoPointY = geoPointY;
        this.displayName = displayName;
        this.rank = rank;
        this.cityName = cityName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGeoPointX() {
        return geoPointX;
    }

    public void setGeoPointX(double geoPointX) {
        this.geoPointX = geoPointX;
    }

    public double getGeoPointY() {
        return geoPointY;
    }

    public void setGeoPointY(double geoPointY) {
        this.geoPointY = geoPointY;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public DogGardenRank getRank() {
        return rank;
    }

    public void setRank(DogGardenRank rank) {
        this.rank = rank;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}

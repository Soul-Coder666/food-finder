package com.teamalphavoid.restaurantseat.Models;

public class MainModel {
    int image;
    String name, seat, description;

    public MainModel(int image, String name, String seat, String description) {
        this.image = image;
        this.name = name;
        this.seat = seat;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

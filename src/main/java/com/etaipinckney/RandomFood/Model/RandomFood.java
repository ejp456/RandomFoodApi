package com.etaipinckney.RandomFood.Model;

import com.etaipinckney.RandomFood.Yelp.Location;

/**
 * Created by etaipinckney on 5/16/15.
 */
public class RandomFood {
  String name;
  Location loc;
  double rating;
  String genre;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Location getLoc() {
    return loc;
  }

  public void setLoc(Location loc) {
    this.loc = loc;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}

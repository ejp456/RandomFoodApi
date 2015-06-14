package com.etaipinckney.RandomFood.Yelp;

import java.util.List;

/**
 * Created by etaipinckney on 5/16/15.
 */
public class Location
{
  public List<String> address;
  public String city ;
  public String country_code ;
  public String cross_streets ;
  public List<String> display_address ;
  public List<String> neighborhoods ;
  public String postal_code ;
  public String state_code ;

  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry_code() {
    return country_code;
  }

  public void setCountry_code(String country_code) {
    this.country_code = country_code;
  }

  public String getCross_streets() {
    return cross_streets;
  }

  public void setCross_streets(String cross_streets) {
    this.cross_streets = cross_streets;
  }

  public List<String> getDisplay_address() {
    return display_address;
  }

  public void setDisplay_address(List<String> display_address) {
    this.display_address = display_address;
  }

  public List<String> getNeighborhoods() {
    return neighborhoods;
  }

  public void setNeighborhoods(List<String> neighborhoods) {
    this.neighborhoods = neighborhoods;
  }

  public String getPostal_code() {
    return postal_code;
  }

  public void setPostal_code(String postal_code) {
    this.postal_code = postal_code;
  }

  public String getState_code() {
    return state_code;
  }

  public void setState_code(String state_code) {
    this.state_code = state_code;
  }
}

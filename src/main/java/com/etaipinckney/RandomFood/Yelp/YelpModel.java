package com.etaipinckney.RandomFood.Yelp;


import java.util.HashMap;
import java.util.List;

/**
 * Created by etaipinckney on 5/16/15.
 */
public class YelpModel
{
  public List<Business> businesses ;
  public Region region ;
  public int total ;

  public List<Business> getBusinesses() {
    return businesses;
  }

  public void setBusinesses(List<Business> businesses) {
    this.businesses = businesses;
  }

  public Region getRegion() {
    return region;
  }

  public void setRegion(Region region) {
    this.region = region;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }
}



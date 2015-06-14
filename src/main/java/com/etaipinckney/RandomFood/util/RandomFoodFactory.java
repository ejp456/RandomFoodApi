package com.etaipinckney.RandomFood.util;

import com.etaipinckney.RandomFood.Model.RandomFood;
import com.etaipinckney.RandomFood.Yelp.Business;
import com.etaipinckney.RandomFood.Yelp.YelpModel;

import java.util.Random;

/**
 * Created by etaipinckney on 5/16/15.
 */
public class RandomFoodFactory {
  public static RandomFood createRandomFood(YelpModel yelpModel) {
    RandomFood food = new RandomFood();
    Random random = new Random();
    int index = random.nextInt(yelpModel.getBusinesses().size()-1);
    if(yelpModel != null) {
      Business business = yelpModel.getBusinesses().get(index);
      food.setName(business.getName());
      food.setLoc(business.getLocation());
    }

    return food;
  }
}

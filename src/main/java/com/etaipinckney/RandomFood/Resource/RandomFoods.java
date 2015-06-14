package com.etaipinckney.RandomFood.Resource;
import com.etaipinckney.RandomFood.Client.YelpServiceClient;
import com.etaipinckney.RandomFood.Client.impl.YelpServiceClientImpl;
import com.etaipinckney.RandomFood.Model.RandomFood;
import com.etaipinckney.RandomFood.Yelp.YelpModel;
import com.etaipinckney.RandomFood.Yelp.YelpParameters;
import com.etaipinckney.RandomFood.util.RandomFoodFactory;
import com.google.gson.Gson;
import spark.Request;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
/**
 * Created by etaipinckney on 5/16/15.
 */
public class RandomFoods {

  private static final String CONSUMER_KEY =	System.getProperty("CONSUMER_KEY_YELP");
  private static final String CONSUMER_SECRET =	System.getProperty("CONSUMER_SECRET_YELP");
  private static final String TOKEN = System.getProperty("TOKEN_YELP");
  private static final String TOKEN_SECRET = System.getProperty("TOKEN_SECRET_YELP");

  public static void main(String[] args) {
    get("/food", (request, response) -> {
      Map<String, Object> params = createQueryMap(request);
      return createResponse(params);
    });
  }

  private static String createResponse(Map<String, Object> parameters) {
    Gson gson = new Gson();
    YelpServiceClient client = new YelpServiceClientImpl(CONSUMER_KEY, CONSUMER_SECRET, TOKEN, TOKEN_SECRET);
    YelpModel yelpModel = client.getSearchResults(parameters);
    return gson.toJson(RandomFoodFactory.createRandomFood(yelpModel), RandomFood.class);
  }

  private static Map<String, Object> createQueryMap(Request request) {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("term", request.queryParams("term"));
    map.put("location", request.queryParams("location"));
    return map;
  }
}

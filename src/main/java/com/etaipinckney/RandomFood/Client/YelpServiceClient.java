package com.etaipinckney.RandomFood.Client;

import com.etaipinckney.RandomFood.Yelp.YelpModel;
import com.etaipinckney.RandomFood.Yelp.YelpParameters;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by etaipinckney on 5/16/15.
 */
public interface YelpServiceClient {
  YelpModel getSearchResults(Map<String, Object> params);
}

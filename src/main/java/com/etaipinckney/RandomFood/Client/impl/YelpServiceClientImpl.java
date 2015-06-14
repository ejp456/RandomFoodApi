package com.etaipinckney.RandomFood.Client.impl;

import com.etaipinckney.RandomFood.Client.YelpServiceClient;
import com.etaipinckney.RandomFood.Yelp.TwoStepOAuth;
import com.etaipinckney.RandomFood.Yelp.YelpModel;
import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.gson.Gson;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

import java.io.IOException;
import java.util.Map;

/**
 * Created by etaipinckney on 5/16/15.
 */
public class YelpServiceClientImpl implements YelpServiceClient {
  private static final String BASE_URL = "http://api.yelp.com/v2/search";
  static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
  static final JsonFactory JSON_FACTORY = new GsonFactory();
  private OAuthService service;
  private Token accessToken;

  public YelpServiceClientImpl(String consumerKey, String consumerSecret, String token, String tokenSecret) {
    this.service =
        new ServiceBuilder().provider(TwoStepOAuth.class).apiKey(consumerKey)
            .apiSecret(consumerSecret).build();
    this.accessToken = new Token(token, tokenSecret);
  }

  @Override
  public YelpModel getSearchResults(Map<String, Object> params) {
    Gson gson = new Gson();
    return gson.fromJson(sendRequest(createOauthRequest(params)), YelpModel.class);
  }

  public String sendRequest(OAuthRequest request) {
    System.out.println("Querying " + request.getCompleteUrl() + " ...");
    this.service.signRequest(this.accessToken, request);
    Response response = request.send();
    System.out.println(response.getBody());
    return response.getBody();
  }

  private OAuthRequest createOauthRequest(Map<String, Object> params) {
    OAuthRequest request = new OAuthRequest(Verb.GET, BASE_URL);
    for(Map.Entry<String, Object> e : params.entrySet()) {
      if(e.getValue() instanceof String) {
        request.addQuerystringParameter(e.getKey(), (String) e.getValue());
      }
    }
    return request;
  }

}

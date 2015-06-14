package com.etaipinckney.RandomFood.Yelp;


import java.util.List;

/**
 * Created by etaipinckney on 5/16/15.
 */
public class Business
{
  public List<List<String>> categories ;
  public String display_phone ;
  public String id ;
  public boolean is_claimed ;
  public boolean is_closed ;
  public String image_url ;
  public Location location ;
  public String mobile_url ;
  public String name ;
  public String phone ;
  public String rating_img_url ;
  public String rating_img_url_large ;
  public String rating_img_url_small ;
  public int review_count ;
  public String snippet_image_url ;
  public String snippet_text ;
  public String url ;
  public String menu_provider ;
  public int menu_date_updated ;

  public List<List<String>> getCategories() {
    return categories;
  }

  public void setCategories(List<List<String>> categories) {
    this.categories = categories;
  }

  public String getDisplay_phone() {
    return display_phone;
  }

  public void setDisplay_phone(String display_phone) {
    this.display_phone = display_phone;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public boolean isIs_claimed() {
    return is_claimed;
  }

  public void setIs_claimed(boolean is_claimed) {
    this.is_claimed = is_claimed;
  }

  public boolean isIs_closed() {
    return is_closed;
  }

  public void setIs_closed(boolean is_closed) {
    this.is_closed = is_closed;
  }

  public String getImage_url() {
    return image_url;
  }

  public void setImage_url(String image_url) {
    this.image_url = image_url;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public String getMobile_url() {
    return mobile_url;
  }

  public void setMobile_url(String mobile_url) {
    this.mobile_url = mobile_url;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getRating_img_url() {
    return rating_img_url;
  }

  public void setRating_img_url(String rating_img_url) {
    this.rating_img_url = rating_img_url;
  }

  public String getRating_img_url_large() {
    return rating_img_url_large;
  }

  public void setRating_img_url_large(String rating_img_url_large) {
    this.rating_img_url_large = rating_img_url_large;
  }

  public String getRating_img_url_small() {
    return rating_img_url_small;
  }

  public void setRating_img_url_small(String rating_img_url_small) {
    this.rating_img_url_small = rating_img_url_small;
  }

  public int getReview_count() {
    return review_count;
  }

  public void setReview_count(int review_count) {
    this.review_count = review_count;
  }

  public String getSnippet_image_url() {
    return snippet_image_url;
  }

  public void setSnippet_image_url(String snippet_image_url) {
    this.snippet_image_url = snippet_image_url;
  }

  public String getSnippet_text() {
    return snippet_text;
  }

  public void setSnippet_text(String snippet_text) {
    this.snippet_text = snippet_text;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getMenu_provider() {
    return menu_provider;
  }

  public void setMenu_provider(String menu_provider) {
    this.menu_provider = menu_provider;
  }

  public int getMenu_date_updated() {
    return menu_date_updated;
  }

  public void setMenu_date_updated(int menu_date_updated) {
    this.menu_date_updated = menu_date_updated;
  }
}

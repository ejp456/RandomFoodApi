package com.etaipinckney.RandomFood.Client;

/**
 * Created by etaipinckney on 5/16/15.
 */
public interface BaseClient<T> {
  T get(T t);
  T post(T t);
  T put(T t);
  T delete(T t);
}

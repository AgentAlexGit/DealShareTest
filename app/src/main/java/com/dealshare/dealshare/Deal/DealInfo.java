package com.dealshare.dealshare.Deal;

/**
 * Created by Alex on 1/2/2018.
 */

/**
 * @Brief Stores info for the deals
 */
public class DealInfo {
     String Name;
     String Description;
     int Shares;
     int AmountOfLikes;

     public DealInfo(String name, String description, int shares, int amountOfLikes) {
          Name = name;
          Description = description;
          Shares = shares;
          AmountOfLikes = amountOfLikes;
     }
}

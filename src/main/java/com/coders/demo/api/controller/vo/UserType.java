package com.coders.demo.api.controller.vo;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "user type")
public enum UserType {

  Guest(0), //  guest

  User(1), //  user

  Admin(2) //  admin
  ;
  UserType(int num) {
  }

  public static UserType parse(int num) {
    for (UserType type: UserType.values()) {
      if (type.ordinal() == num) {
        return type;
      }
    }
    return null;
  }
}

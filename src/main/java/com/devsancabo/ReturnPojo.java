package com.devsancabo;

public class ReturnPojo {

  private String message;
  public ReturnPojo(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object other){
    if(!(other instanceof ReturnPojo)) return false;
    ReturnPojo otherPojo = (ReturnPojo) other;
    if(this.message == null && otherPojo.message==null) return true;
    if(this.message == null || otherPojo.message==null) return false;
    return this.message.equals(otherPojo.message);
  }

}

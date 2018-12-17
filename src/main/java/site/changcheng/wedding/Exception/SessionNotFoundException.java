/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.Exception;

public class SessionNotFoundException extends Exception{

  protected String message;

  public SessionNotFoundException() {
    setMessage("Session is not found!");
  }

  public SessionNotFoundException(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}

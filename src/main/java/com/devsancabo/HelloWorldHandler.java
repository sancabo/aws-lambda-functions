package com.devsancabo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorldHandler implements RequestHandler<InputPojo,ReturnPojo> {

  @Override
  public ReturnPojo handleRequest(InputPojo inputPojo, Context context) {
    context.getLogger().log("Received request: " + inputPojo);
    final String message = new StringBuilder().append(context.getFunctionName())
            .append(": Hello world, " )
            .append(inputPojo.getFirstName())
            .append(" ")
            .append(inputPojo.getLastName())
            .append("!")
            .toString();
    return new ReturnPojo(message);
  }
}


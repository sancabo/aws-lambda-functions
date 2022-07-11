package com.devsancabo;

import com.amazonaws.services.lambda.runtime.Context;
import org.junit.Assert;
import org.junit.Test;


public class HelloWorldHandlerTest {

  @Test
  public void test(){
    HelloWorldHandler helloWorldHandler = new HelloWorldHandler();
    InputPojo input = new InputPojo("Santiago","Cabo",35);
    Context context = new TestContext();
    ReturnPojo expectedResponse = new ReturnPojo("helloWorldLambda: Hello world, Santiago Cabo!");
    Assert.assertEquals(expectedResponse, helloWorldHandler.handleRequest(input, context));
  }
}


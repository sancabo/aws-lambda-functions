package com.devsancabo;

import com.amazonaws.services.lambda.runtime.ClientContext;
import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class TestContext implements Context{

    public TestContext() {}
    public String getAwsRequestId(){
        return new String("495b12a8-xmpl-4eca-8168-160484189f99");
    }
    public String getLogGroupName(){
        return new String("/aws/lambda/helloWorldLambda");
    }
    public String getLogStreamName(){
        return new String("2022/07/11/[$LATEST]704f8dxmpla04097b9134246b8438f1a");
    }
    public String getFunctionName(){
        return new String("helloWorldLambda");
    }
    public String getFunctionVersion(){
        return new String("$LATEST");
    }
    public String getInvokedFunctionArn(){
        return new String("arn:aws:lambda:sa-east-1:767008369333:function:helloWorldLambda");
    }
    public CognitoIdentity getIdentity(){
        return null;
    }
    public ClientContext getClientContext(){
        return null;
    }
    public int getRemainingTimeInMillis(){
        return 3100000;
    }
    public int getMemoryLimitInMB(){
        return 1024;
    }
    public LambdaLogger getLogger(){
        return new TestLogger();
    }

}
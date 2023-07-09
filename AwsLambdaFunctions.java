package com.mcnz.aws.lambda;

public class AwsLambdaFunctions {
	
	public String alterPayload(String payload) {
		System.out.println("We are in the Java AWS Lambda function!");
		return payload.toLowerCase().replace('e', '3').replace('l', '1');
	}

}

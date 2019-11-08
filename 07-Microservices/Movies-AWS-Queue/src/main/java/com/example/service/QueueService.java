package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageRequest;

@Service
public class QueueService {

	private AWSCredentials cred;
	private AmazonSQS sqs;
	
	private String accessKey=System.getenv("AWS_ACCESS_KEY");
	
	private String secretKey=System.getenv("AWS_SECRET_KEY");
	
	private String url=System.getenv("QUEUE_URL");
	
	public QueueService() {
		buildQueue();
	}
	
	public void buildQueue() {
		cred = new BasicAWSCredentials(accessKey, secretKey);
		sqs = AmazonSQSClientBuilder.standard()
				.withCredentials(new AWSStaticCredentialsProvider(cred))
				.withRegion(Regions.US_EAST_1)
				.build();
	}
	
	public String sendMessage(String message) {
		SendMessageRequest request = new SendMessageRequest()
				.withQueueUrl(url)
				.withMessageBody(message);
		sqs.sendMessage(request);
		return message;
	}
	
	public String getMessage() {
		return sqs.receiveMessage(url).getMessages().get(0).getBody();
	}
	
	
	
	
	
}

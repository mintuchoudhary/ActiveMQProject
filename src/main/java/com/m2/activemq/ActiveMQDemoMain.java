package com.m2.activemq;

public class ActiveMQDemoMain {

	public static void main(String[] args) {
		Producer producer = new Producer();
		Consumer consumer = new Consumer();

		Thread producerThread = new Thread(producer);
		producerThread.start();

		Thread consumerThread = new Thread(consumer);
		consumerThread.start();
	}
}

package com.naga.app;

public class ShowServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShowService showService = (features,deviceType) -> {
			
		
			System.out
			.println("the out putof show service is :" + features.toUpperCase() + "is the feature of Apple" + deviceType.toUpperCase());};
		showService.showMeNewServices("flexibility", "os");
	}

}

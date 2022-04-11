package com.labtwo.asgmttwo.paymentservices;

public class PaymentServices {
	 private final int[] transactionsData;

	    public PaymentServices(int[] transactionData){
	        this.transactionsData = transactionData;
	    }

	    public int testTargetAchieved(int targetValue) {

	        int sum = 0;
	        for(int index = 0; index < transactionsData.length; index++ ){
	            sum = sum + transactionsData[index];
	            if(sum >= targetValue){
	                return index + 1;
	            }

	        }
	        return -1;
	    }
	}



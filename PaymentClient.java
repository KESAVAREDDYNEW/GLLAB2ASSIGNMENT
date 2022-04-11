package com.gl.labtwo.asgmttwo.clientpayment;

import com.labtwo.asgmttwo.paymentservices.PaymentServices;
import java.util.Scanner;
public class PaymentClient {
	public static void main(String[] args) {
    System.out.println (" Enter the number  of transactions to perfrom");
    Scanner sc = new Scanner (System.in);
    int sizeofTranscations = sc.nextInt();
    System.out.println (" Enter the Transcation data");
    int[] transcationData =  new int[sizeofTranscations];
    for ( int i=0; i<sizeofTranscations; i++)    {
    	transcationData[i] = sc.nextInt();
    }
    for ( int j=0; j<sizeofTranscations; j++)    {
    	 System.out.print(transcationData[j] + "  ");
    	 
    }
    for (int k =0; k<sizeofTranscations; k++) {
    System.out.println (" Enter the Target Transcation Value");
    int targetValue = sc.nextInt();
     PaymentServices paymentProcessor = new PaymentServices(transcationData);

        int index = paymentProcessor.testTargetAchieved(targetValue);
        if (index != -1 ) {
            System.out.println(" Given Target is achieved after " +index+" iterations");
                   } else {
            System.out.println("Given Target is not achieved after "+ transcationData.length + " iterations");
        }
    }
       sc.close();
    }
}

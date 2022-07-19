package com.SIpackage;

public class SI {
	void SimpleInterest(int principle,int rate,int time)
	{
		int si = (principle * rate * time)/100;
		System.out.println("SI..." + si);
		int FinalAmount = principle + si;
		System.out.println("Amount to be paid at end Loans..." + FinalAmount);
	}

}

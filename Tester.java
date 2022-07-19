package com.schoolrecords.chennai;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolRecords k = new SchoolRecords();
		String SchoolName;
		int SchoolId;
		String SchoolAddress;
		Scanner sc = new Scanner(System.in);
		SchoolId = sc.nextInt();
		SchoolName = sc.next();
		SchoolAddress = sc.next();
		k.ddRecords();
		k.dispRecords(SchoolId,SchoolName,SchoolAddress);
	}

}

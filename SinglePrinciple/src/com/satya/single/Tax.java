package com.satya.single;

public class Tax{
	  public static int incomeTax(Employee emp){
		if (2<emp.getYear()&&emp.getYear()<5) {
			return 5000;
		} else {
			return 10000;
		}
	}
}

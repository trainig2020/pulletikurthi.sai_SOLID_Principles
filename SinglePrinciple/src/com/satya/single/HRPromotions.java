package com.satya.single;

public class HRPromotions{
	  public void isPromotion(Employee emp){
		 if (emp.getYear()==1) {
			 System.out.println("Employee is getting  20000 Hike");
		 }
		 else if(emp.getYear()>=2&&emp.getYear()<5) {
			 int t=Tax.incomeTax(emp);
			 System.out.println(50000-t);
		 }
		 else {
		         int t=Tax.incomeTax(emp);
			  System.out.println(100000-t); 
		 }
		
	    
	  }
	}

package com.satya.single;

public class MainDemo {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setName("sai");
	e.setAddress("Valluru");
	e.setEmployeeId("1");
	e.setYear(5);
	System.out.println("Name:"+e.getName()+" Address:"+e.getAddress()+" EmployeeId:"+e.getEmployeeId()+" Year Of Exp:"+e.getYear());
	HRPromotions h=new HRPromotions();
	System.out.println("Hike Is :");
	h.isPromotion(e);
}
}

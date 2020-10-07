package com.satya.openclose;

public class Main {
  
	public static void main(String[] args) {
		Circle c=new Circle();
	    	c.setRadius(12);
	    	//System.out.println("Radiusis "+c.getRadius());
	    	System.out.println("Area of Circle is "+c.calculateArea());
	    	
	    Rectangle r=new Rectangle();
	    r.setLength(7);
	    r.setWidth(9);
	    System.out.println("Area of Rectangle is "+r.calculateArea());
	}
}

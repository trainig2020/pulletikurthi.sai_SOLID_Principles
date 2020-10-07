package com.satya.interfacesegregation;

public class ExcelUser  implements ExcelGenerator {

	@Override
	public void printingExcel() {
		System.out.println("Ms.Excel sheet is printed");
	}

}

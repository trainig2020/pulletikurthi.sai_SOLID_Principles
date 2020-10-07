package com.satya.interfacesegregation;

public class PdfUser implements PdfGenerator {

	@Override
	public void printingPdf() {
		
		System.out.println(".Pdf is printed");
	}

}

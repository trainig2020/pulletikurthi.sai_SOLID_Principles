package com.satya.dependencyinjection;

public class FrontEndDeveloper implements Developer {

    @Override
    public void develop() {
        writeJavascript();
    }

    public void writeJavascript() {
    	System.out.println("writing java script code");
    }

}

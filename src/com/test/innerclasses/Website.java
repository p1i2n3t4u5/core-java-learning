package com.test.innerclasses;

public class Website {
	/*  This creates an anonymous inner class: */
	
	// ProgrammerInterview pInstance2=new ProgrammerInterview();
	
	   ProgrammerInterview pInstance = new    ProgrammerInterview (){
		   																@Override
		   																	public void read() {
		   																	System.out.println("anonymous ProgrammerInterview");
		   																}
		   																
		   																public void display() {
		   																	System.out.println("anonymous display");
		   																}
	    															};
	    
	    
	    
	    
	    public static void main(String[] args) {
	    	Website website=new Website();
	    	website.pInstance.read();
	    	website.pInstance.write();
	    	//website.pInstance.display();
	    	
		}

}

package com.test.annonymousInner;

class Website {
/*  This creates an anonymous inner class: */
   ProgrammerInterview pInstance = new    ProgrammerInterview () {
        @Override
        public void read() {
               System.out.println("anonymous ProgrammerInterview");
               super.read();
          }
    };
    
    public static void main(String[] args) {
    	Website website =  new Website(); 
    	website.pInstance.read();
	}
}

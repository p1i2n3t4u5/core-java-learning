package map;

public class KeyObject  {
	
	private int amount;
	
	public KeyObject(int amount) {
		this.amount=amount;
	}
	
	public String toString() 
    { 
        return "demo"; 
    } 
      
    // finalize method 
    public void finalize() 
    { 
        System.out.println("finalize method is called"); 
    } 
    
    @Override
    public boolean equals(Object obj) {
    	return this.amount==((KeyObject)obj).amount;
    }

}

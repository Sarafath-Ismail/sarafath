package encapsulation;

public class Bank {
	
	private int Pin;
		
	public void setPin(int Pin) {
		
	this.Pin=Pin;
		
	}	
	public boolean validatePin() {
		if(Pin==1001 || Pin==1234 || Pin==1212) {
			return true;}
			else {
			return false;	
		}
		
	}
}

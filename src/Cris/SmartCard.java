package Cris;
import com.mega.devices.autocarddispenser.MutekAutoCardDispenser;
public final class SmartCard extends MutekAutoCardDispenser{
	
	public SmartCard() {
		super();
		System.out.println("SmartCard Constructor");
	}
	
	public static void main(String args[]) {
		SmartCard SmartCardObj = new SmartCard();
		SmartCardObj.ConnectDevice(0, 0, 0);
	}
	
}//public final class SmartCard end

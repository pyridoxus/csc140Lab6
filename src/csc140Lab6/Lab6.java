package csc140Lab6;

public class Lab6 {

	public static void main(String[] args) {
		RPS_Gesture test1 = new RPS_Gesture();
		RPS_Gesture test2 = new RPS_Gesture();
		Integer i = new Integer(10);
		
		System.out.println("Equal?" + (test1.equals(test2)));
		System.out.println("Should not equal?" + (test1.equals(i)));
		
	}

}

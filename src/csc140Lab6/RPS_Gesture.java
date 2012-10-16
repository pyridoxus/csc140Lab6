package csc140Lab6;

enum GestureType { rock, paper, scissors };

public class RPS_Gesture {

	private GestureType gesture;
	
	public RPS_Gesture() {
		gesture = GestureType.paper;
	}

	public GestureType getGesture() {
		return gesture;
	}

	public void setGesture(GestureType gesture) {
		this.gesture = gesture;
	}
	
	public boolean equals(Object o) {
		boolean result;
		// The following is used for type checking. How do you compare an
		// Integer object to an RPS_Gesture object? I'm simply returning false
		// if there is an attempt to compare to objects of different types.
		if(o.getClass() != this.getClass()) {
			result = false;	// Objects are not from same class, so result false.
		}
		else {
			// Objects are from RPS_Gesture class, so compare the gestures.
			result = (this.gesture == ((RPS_Gesture)o).getGesture()); 
		}
		return result;
		
//		The following line will cause an error if objects of two different
//		types are compared because we cannot type cast correctly.
//		return (this.gesture == ((RPS_Gesture)o).getGesture());
	}

//
//	This main method is used to test the RPS_Gesture class.
//	
	public static void main(String[] args) {
		RPS_Gesture test1 = new RPS_Gesture();	// Gesture set to paper
		RPS_Gesture test2 = new RPS_Gesture();	// Gesture set to paper
		
		// Both objects were set to paper in the constructor, so this is true
		System.out.println("Two of same type. Equal? " + (test1.equals(test2)));
		
		// Cannot cast an Integer object to RPS_Gesture object, but if done
		// correctly, this will return false. How do you compare an Integer
		// object to an RPS_Gesture object? There may be other more descriptive
		// ways to handle this kind of comparison. But, because the "equals"
		// method only returns boolean, I keep it simple with false.
		Integer i = new Integer(10);
		System.out.println("Two of different types. Equal? " +
							(test1.equals(i)));
		
	}

}

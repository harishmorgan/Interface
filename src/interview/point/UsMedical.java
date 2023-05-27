package interview.point;

public interface UsMedical extends WHO {
	
	int min_balance = 500;
	
	public void phystoServices();
	public void oncologyServices();
	public void orthopedicServices();
	public void radioLogyServices();
	
	//we cannot create the object of Interface
	//only method declaration--method prototype--no method body -- we can call it as abstract method 
	//cannot create static prototype method in Interface
	//by variables are static and final by default
	
	//can I have static method with method body -yes it allowed after JDK 1.8  but with method body
	
	public static void Services_911() {
		System.out.println("US-----Services_911");
		
	}
	
	//default method can not have static 
	//It cannot be overridden 
	//but it can be called by parent object in main class
	default void internship() {
		System.out.println("US-----internship Program");
	}
	
	
	
	

}

package interview.point;

public class ApolloHospital extends GlobalPatientData implements UsMedical,UkMedical,IndianMedical {

	@Override
	public void phystoServices() {
		System.out.println("AP----phystoServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("AP----oncologyServices");
		
	}

	@Override
	public void orthopedicServices() {
		System.out.println("AP----orthopedicServices");
		
	}

	@Override
	public void ENTServices() {
		System.out.println("AP----ENTServices");
		
	}

	@Override
	public void anbulanceServices() {
		System.out.println("AP----anbulanceServices");
		
	}

	@Override
	public void emegergencyServices() {
		System.out.println("AP----emegergencyServices");
		
	}

	@Override
	public void neureServices() {
		System.out.println("AP----neureServices");
		
	}

	@Override
	public void peditricServices() {
		System.out.println("AP----peditricServices");
		
	}
	
	//WHO
	
	@Override
	public void terms_and_Conditions() {
		System.out.println("AP----terms_and_Conditions");
		
	}
	
	//non-overridden methods -- only applicable for Apollo hospital
	
	public void OPTServices() {
		System.out.println("AP ---- OPTServices");
	}

	public void medicalInsurance(){
		System.out.println("AP---- medicatinsurance");
	}
	
	public void pathalogyServices(){
		System.out.println("AP ~ pathalogyServices");
	}

	@Override
	public void radioLogyServices() {
		// TODO Auto-generated method stub
		
	}
}


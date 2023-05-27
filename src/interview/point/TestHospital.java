package interview.point;

public class TestHospital {

	public static void main(String[] args) {
		
		//we can refer child object class
		
		ApolloHospital ap = new ApolloHospital(); 
		ap.anbulanceServices();
		ap.emegergencyServices();
		ap.ENTServices();
		ap.medicalInsurance();
		ap.neureServices();
		ap.internship();
		ap.getPatientData();
		
		System.out.println(UsMedical.min_balance);
		
		//we can do reference of Interface
		
		//top casting //child class object can be referred by parent interface reference variable
		
		UsMedical um = new  ApolloHospital();
		um.phystoServices();
		um.oncologyServices();
		um.orthopedicServices();
		System.out.println(UsMedical.min_balance);
		UsMedical.Services_911();
		um.internship();
		
		UkMedical uk = new  ApolloHospital();
		uk.anbulanceServices();
		uk.ENTServices();

	}

}

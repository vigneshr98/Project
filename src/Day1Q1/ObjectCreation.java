package Day1Q1;

public class ObjectCreation {
	
	private void empId() {                                      //camel notation methodname ctrl+space
		System.out.println("617");                             //sysout ctrl+space
	}

	private void empName() {                                  //camel notation methodname ctrl+space
		System.out.println("ramKumar");                       //sysout ctrl+space
	}

	private void empDob() {                                                         //camel notation methodname ctrl+space
		System.out.println("13/08/2020");                                           //sysout ctrl+space
	}

	private void empPhone() {
	System.out.println("6360252413");
	}

	private void empMail() {
	System.out.println("bbbasde@gmail.com");
	}

	private void empAddress() {
	System.out.println("14,mullaiNagar 7th sreet karur");
	}

public static void main(String[] args) {                            //main+ctrl+space

	                                                               //object creation
	ObjectCreation    a     = new ObjectCreation();
                                                                    //class name objrefname  = new class name  
		a.empId();        
		a.empName();
		a.empDob();
		a.empAddress();
		a.empMail();
		a.empPhone();

	}
}




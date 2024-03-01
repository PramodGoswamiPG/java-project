package appusers;

public class Mainclass1 {
	public static void main(String[] args) {
		System.out.println("creating customer...");
		
		Customer c1=new Customer("priyanka",001,"Banglore",8340295244l,"patna","karnataka","ranchi",834003,"hatia");
		System.out.println(c1.getC_name());
		System.out.println(c1.getA1().getZipcode());
		System.out.println(c1.getC_address());
	}

}

public class java_Demo {

	public static void main(String[] args) {


		
		int [] aa= {3,4,5,4,2,3};
		
		for(int aar: aa) {
			System.out.println(aar);
		}
		
		StringBuffer sb = new StringBuffer("Pankaj Raja");
		
		int reverse = sb.reverse().length();
		System.out.println("Reverse of Lenght is --> "+reverse);
	}

}

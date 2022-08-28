
public class Javabrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Rahul Shetti Academy";
		String[] spilttedstring = s.split("Shetti");
		System.out.println(spilttedstring[0]);
		System.out.println(spilttedstring[1]);
		System.out.println(spilttedstring[1].trim());
		//System.out.println(spilttedstring[2]);
		
		for( int i=s.length()-1;i>=0;i--)
			
		{
			System.out.println(s.charAt(i));
		}
		
		
	}

}

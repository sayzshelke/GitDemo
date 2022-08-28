
public class javabrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		String[] name = {"Sayali", "Sushrut", "Saloni"};
		boolean n = true;
		char b = 'y';
		double c = 2.50;
		
		System.out.println("name");
		System.out.println(b + " for bayko");
		
		int[] arr = new int[5];
		arr[0] = 9;
		arr[1] = 4;
		arr[2] = 0;
		arr[3] = 5;
		arr[4] = 4;
		
		for (int i=0; i< arr.length; i++)
		{
			 if ( arr[i] % 2 ==0 )
			 {
		System.out.println(arr[i]);
	
		}
		
		else
		{
			System.out.println(arr[i] + " is not divisble by 2");
			
		}
			
		}
		
		for(int i =0; i<name.length;i++)

		{

		System.out.println(name[i]);

		}



		for( String s: name)

		{

		System.out.println(s);

		}
	}
}

package JavaPrograms;

public class Object {

	 static int count;
	 
	 public Object()
	 {
		 count++;
	 }
	 
	 public int get_object_count() {
		 return count;
	 }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object a= new Object();
		Object b= new Object();
		Object c= new Object();
		Object d= new Object();
		Object e= new Object();
		
		System.out.println(e.get_object_count());
	}

}

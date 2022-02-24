package pkg1;
/*
 * 
 */
public class JavaBasics {

			//instance variables
			String name;
			short age;
			double salary;
			boolean isAvailable;
			
			//static variables
			public static String[] skills;
			
			// Default values
			byte b; //0
			short s; //0;
			int i; //0
			long l; //0
			float f; //0.0f
			double d; //0.0
			boolean bool; //false
			char c; //u0000
			String str; //null
			int[] arr; //null
			//Employee emp; //null
			
			//method
			//returnType methodName(input args) {}
			Employee emp = new Employee();
			//static method
			public static void main(String[] args) {
				
				
				// TODO Auto-generated method stub
				
				Employee emp = new Employee();
				//System.out.println(str);-->error
				//System.out.println(name);-->error
				
				///create object
				JavaBasics javaBasics = new JavaBasics();
				
				//Accessing static variables
				//System.out.println(skills);
				//System.out.println(JavaBasics.skills);
				System.out.println(javaBasics.skills);
				
				//Access Non static/instance variables : name age salary isAvailable
				//can be accessed using object reference 
				//System.out.println(JavaBasics.name); --> error
				System.out.println(javaBasics.name);
				System.out.println(javaBasics.age);
				System.out.println(javaBasics.add("Tulasi"));// 10,1000,
				
			}
			/*int m1() {
				//logic
			}*/
			String add(String name) {
				//Local Variable
				String str = "Hello";
				return str+" "+name;//Hello Sai
			}

}

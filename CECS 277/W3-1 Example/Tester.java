/** 
 * 
 * @author Nishaan Amin  
 *
 */
public class Tester 
{
	/** 
	 * Main method to run the code  
	 * @param args
	 */
	public static void main(String[] args) 
	{
		person person1 = new person(); 
		person person2 = new person("John", 25); 
		
		Student student1 = new Student();  
		Student student2 = new Student(3.75); 
		
		person1.setName("Bob"); 
		person1.setAge(21); 
		System.out.print(person1.getName() + " "); 
		System.out.println(person1.getAge()); 
		
		student1.setName("John");
		student1.setAge(31);
		student1.setGPA(4.0); 
		System.out.print(student1.getName() + " "); 
		System.out.print(student1.getAge() + " "); 
		System.out.println(student1.getGPA()); 
		
		System.out.println(person2);
		
		System.out.println(student2); 
	}
}

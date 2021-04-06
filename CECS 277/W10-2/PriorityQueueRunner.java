import java.util.PriorityQueue;

/** 
 * 
 * @author Nishaan Amin   
 *
 */
public class PriorityQueueRunner 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Person> pq = new PriorityQueue<Person>();
		
		Person person1 = new Person("Sam", "Smith"); 
		Person person2 = new Person("Charlie", "Black"); 
		Person person3 = new Person("Betty", "Brown"); 
		Person person4 = new Person("Jessica", "Stewart"); 
		Person person5 = new Person("John", "Friday"); 
		Person person6 = new Person("Frank", "Foley"); 
		
		pq.add(person1); 
		pq.add(person2); 
		pq.add(person3); 
		pq.add(person4); 
		pq.add(person5); 
		pq.add(person6); 
		
		System.out.println(pq.toString()); 
		System.out.println(); 
		
    	while(!pq.isEmpty())
        {
    		Person p = pq.poll();
            System.out.println(p);    // Objects are Printed in ABC Order  
        }
	}
}

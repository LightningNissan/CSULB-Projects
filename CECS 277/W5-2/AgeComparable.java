public class AgeComparable implements Comparable 
{
	@Override
	public int compareTo(Object s1) 
	{
		Student s2 = (Student) s1; 
		if(((Student)s1).getAge() < s2.getAge())
		{ 
			return 1; 
		}
		else if(((Student)s1).getAge() > s2.getAge())
		{ 
			return - 1; 
		} 
		else 
		{ 
			return 0; 
		}
	} 
} 

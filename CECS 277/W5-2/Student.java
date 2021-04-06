public class Student 
{ 
	private int sid, age; 
	private String name; 
	
	public Student() 
	{
		name = ""; 
		age = 0;
		sid = 0;  
	}
	
	public Student(String n, int a, int id)
	{ 
		name = n; 
		age = a;
		sid = id; 
	} 
	
	public void setName(String n)
	{ 
		name = n; 
	}
	
	public void setAge(int a)
	{ 
		age = a; 
	}
	
	public void setSID(int id)
	{ 
		sid = id; 
	}
	
	public String getName() 
	{ 
		return name; 
	}
	
	public int getAge() 
	{ 
		return age; 
	}
	
	public int getSID() 
	{ 
		return sid; 
	}
}

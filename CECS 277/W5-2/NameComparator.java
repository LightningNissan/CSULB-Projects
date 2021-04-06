import java.util.Comparator; 

public class NameComparator extends Student implements Comparator<Student> 
{
	public int compare(Student name1, Student name2) 
	{ 
		return name2.getName() - name2.getName();
	}
}


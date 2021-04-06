import java.util.TreeSet;

/** 
 * 
 * @author Nishaan Amin  
 *
 */
public class TreeSetRunner  
{
	public static void main(String[] args) 
	{ 
		TreeSet<String> ts = new TreeSet<String>();
		
        ts.add("iii");
        ts.add("hhh");
        ts.add("ggg");
        ts.add("fff");
        ts.add("eee");
        ts.add("ddd");
        ts.add("ccc");
        ts.add("bbb");
        ts.add("aaa");
        ts.add("iii");
        ts.add("hhh");
        ts.add("ggg");
        ts.add("fff");
        ts.add("eee");
        ts.add("ddd");
        ts.add("ccc");
        ts.add("bbb");
        ts.add("aaa");

        System.out.println("Tree Set Elements");
        
        // For Each Loop 
        for(String runner : ts)
        {
            System.out.println(runner);
        }
        
        // 9 total strings are printed  
        // No duplicate strings are printed
        // 1 string each are printed 
        // Not printed in the same order 
        // Printed in reverse order  
	}
}

//PROGR

package basic_programs;
import java.util.*;
public class Employee {
	int id;
	String department;
	
	Employee(int i,String s)
	{
		id=this.i;
		department=this.s;
		
	}


	public static void main(String[] args) {
		

	ArrayList<Employee> list=new ArrayList<Employee>();
	
	Employee tom=new Employee(1,"sales");
	Employee jerry=new Employee(2,"developer");
	list.add(tom);
list.add(jerry);
	}

}

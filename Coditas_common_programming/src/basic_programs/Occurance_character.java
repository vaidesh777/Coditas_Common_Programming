//PROGRAM TO FIND OCCURANCE OF CHARACTER IN STRING

package basic_programs;

public class Occurance_character {

	public static void main(String[] args) {
		
		int Vcount=0,Icount=0,Acount=0;
		String str="vaibhavii";
		char str1[]=str.toCharArray();
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i]=='v')
				Vcount++;
			
			else if(str1[i]=='i')
				Icount++;
			else if(str1[i]=='a')
				Acount++;
			
		}
System.out.println("V count is="+Vcount);
System.out.println("I count is="+Icount);
System.out.println("A count is="+Acount);
		
	}

}

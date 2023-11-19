import java.util.Scanner;
public class Person 
{
  int  id;
  String name;
  void input()
  {
	  Scanner s= new Scanner(System.in);
	  System.out.println("enter id");
	  id= s.nextInt();
	  System.out.println("enter name");
	  name= s.next();
	  
  }
  void display()
  {
	  System.out.println(id +"  "+ name );
  }
	public static void main(String[] args) {

		//here we are creating 3 class references 
		 
		  Person p[]= new Person[1];
		  
		  for(int i=0;i<1;i++)
		  {
		  p[i]= new Person(); //here object is created
		  p[i].input(); 
		  }
		  
		  for(int i=0;i<1;i++)
		    p[i].display();
		  
		  
	}

}

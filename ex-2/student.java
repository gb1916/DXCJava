import java.util.*;
import java.util.scanner;
public class student{

		private string name,addr;
		private int age;
		
		public student()
		{
                Scanner sc=new Scanner(System.in);
		

			name="unknown";
			addr="-";
			age=0;
		}
		setinfo(string n, int ag)
		{
			getline(cin,name);
			
		age=sc.nextInt();

		}
		setinfo(string n, string a, int ag)
		{
			getline(cin,name);
			getline(cin,addr);
			age=sc.nextInt();	
		}
		getinfo(string n, int ag)
		{
			System.out.println("Name:" +name);
			System.out.println("age: " +age);
		}
		getinfo(string n, string a, int ag)
		{
			system.out.println("Name" +name);
			System.out.println("Age:" +age);
			Sytem.out.println("Address:" +addr);
		}
};

public static void main(String[] args){
	int x;
	System.out.println("Enter no of students \n";
	x=sc.nextInt();
	student s[x];
	string name,addr;
	int i,age;
	
	for(i=0;i<x;i++)
	{
		System.out.println("Enter name and address \n");
		s[i].setinfo(name,age);
	}
	
	for(i=0;i<x;i++)
	{
		s[i].getinfo(name,age);
	}
	
	for(i=0;i<x;i++)
	{
		System.out.println("Enter name,address and age \n");
		s[i].setinfo(name,addr,age);
	}
	
	for(i=0;i<x;i++)
	{
		s[i].getinfo(name,addr,age);
	}
	return 0;
}

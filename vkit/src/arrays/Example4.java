package arrays;
class Employee
{
	public int ID;
	public String emp_name;
	Employee(int ID, String emp_name)
	{
		this.ID=ID;
		this.emp_name=emp_name;
		
	}
}
public class Example4 {
public static void main(String[] args) {
	Employee arr[];
	arr=new Employee[3]; 
	arr[0]=new Employee(101,"prajwal");
	arr[1]=new Employee(102,"sahana");
	arr[2]=new Employee(103,"anish");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("Element at"+i+":"+arr[i].ID+" "+arr[i].emp_name);
	}
}
}
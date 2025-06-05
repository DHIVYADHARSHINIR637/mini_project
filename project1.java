package dhivya;
import java.util.*;
interface Orderable
{
	void display();
}
class Pizza implements Orderable
{
	public void display() 
	{
		System.out.println("order placed for pizza");
	}
}
class Burger implements Orderable{
	public void display()
	{
		System.out.println("order placed for burger");
	}
	
}
class Coke implements Orderable
{
	public void display()
	{
		System.out.println("oger placed for coke");
	}
}
public class Prog72 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		ArrayList<Orderable> orderList=new ArrayList<>();
		int choice;
		do {
			System.out.println("Menu:");
			System.out.println("1.pizza");
			System.out.println("2.burger");
			System.out.println("3.coke");
			System.out.println("0.finish order");
			System.out.println("Enter your choice:");
			if(sc.hasNextInt()) {
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				orderList.add(new Pizza());
				break;
			case 2:
				orderList.add(new Burger());
				break;
			case 3:
				orderList.add(new Coke());
				break;
			case 0:
				System.out.println("order summary:");
		    for(Orderable s:orderList)
		    {
			  s.display();
		    }
		    System.out.println("you foogd is begin prepared!");
		    break;
		    default:
		    	System.out.println("Invails choice ,try again!");
			}
			}
			else
			{
				System.out.println("plaese enter a valid number!");
				sc.next();
				choice=-1;
			}
			
		}while(choice!=0);
		
	}

}

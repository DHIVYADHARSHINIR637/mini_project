package dhivya;
import java.util.*;
interface Readable{
	void read();
}
interface Writable{
	void write();
}
interface Storable{
	void store();
}
class File implements Readable,Writable,Storable
{
	public void read() {
		System.out.println("user read the file");
	}
	public void write()
	{
		System.out.println("user write the file");
	}
	public void store()
	{
		System.out.println("user store the file");
	}
}

public class  Prog76 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		File f=new File();
		int choice;
		do {
			System.out.println(" ==== File Operationd Menu ===");
			System.out.println("1.Read Filr");
			System.out.println("2.Write File");
			System.out.println("3.Store Filr");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				f.read();
				break;
			
		    case 2:
			  f.write();
			  break;
	
	        case 3:
		      f.store();
		       break;
	       case 0:
		      System.out.println("Exiting file system..");
		     break;
		     default:
		    	 System.out.println("invalid choice!");
			}
		}while(choice!=0);
	}
}

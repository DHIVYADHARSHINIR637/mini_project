package dhivya;
import java.util.*;
import java.util.*;
interface LightControl{
	void turnONLights();
	void turnOffLights();
	
}
interface MusicControl{
	void playMusic();
	void stopMusic();
}
interface SecurityControl{
	void startCamera();
	void stopCamera();
	
}
class SmartHomeHub implements LightControl,MusicControl,SecurityControl{
	public void turnONLights()
	{
		System.out.println("Lights turned On automaticlly");
	}
	public void turnOffLights()
	{
		System.out.println(" Lights turned off automatically");
	}
	public void playMusic()
	{
		System.out.println(" Music is noew playing");
	}
	public void stopMusic()
	{
		System.out.println("Music been stoped");
	}
	public void startCamera()
	{
		System.out.println("Security Camera start");
	}
	public void stopCamera()
	{
		System.out.println("Security Camera stop ");
	}
}
public class Prog75 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		SmartHomeHub hub=new SmartHomeHub();
		//ArrayList<SmartHomeHub> s=new ArrayList<>();
		int choice;
		do {
			System.out.println("==== Samrt Home Menu  ====");
			System.out.println("1.Turn ON Lights");
			System.out.println("2.Turn OFF Lights");
			System.out.println("3.play Music");
			System.out.println("4.Stop Music");
			System.out.println("5.start Camera");
			System.out.println("6.Stop Camera");
			System.out.println("0.Exit");
			System.out.println("Enter your choice:");
		    choice=sc.nextInt();
		    switch(choice)
		    {
		      case 1:
		
		       hub. turnONLights();
		       break;
		       
		     case 2:
				
			       hub. turnOffLights();
			       break;
		     case 3:
				
			       hub. playMusic();
			       break;
		     case 4:
				
			       hub. stopMusic();
			       break;
		     case 5:
				
			       hub. startCamera();
			       break;
		     case 6:
				
			       hub. stopCamera();
			       break;
		     case 0:
				
			      System.out.println("Exiting Samrt Home Control.Bye!");
			       break;
			  default:
				System.out.println("Invalid choice ,please try again!");
			 }
		}while(choice!=0);
		sc.close();
	}
}

	


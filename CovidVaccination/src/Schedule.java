import java.util.Scanner;
import java.util.Random;

public class Schedule {
public void Schedule()
{
	int num,counter;
	System.out.println("Your Registration Number is:");
	Random rann = new Random();
	
	for(counter=1;counter<=10;counter++)
		{
			num=rann.nextInt(9);
			System.out.print(num + "");
			
		}
	System.out.println();
}

}


	
		


import java.util.Random;
import java.util.Scanner;
public class HospitalS extends Schedule{


public void HospitalSS()
{
	System.out.println("Government of India");
	System.out.println("Ministry Of Health And zfamily Welfare");
	System.out.println("Minimum Age Limit for Booking 18+");
	System.out.println("The Available Hospitals for you to Get Vaccinated");
	System.out.println("Manipal Hospital,RHV Hospital,AIIMS,GR Hospital,MKM Hospital,SKS Hosppital,GRT Hospital,ARS Hospital");
	System.out.println("You Have been Allocated The following Hospital to Get Vaccinated");
	Schedule obj = new Schedule();
	
	Place();
	
	Schedule();
	
}



public static void Place()
{
int NumN,num;
String[] Hospital = new String[] {"Manipal Hospital","RHV Hospital","AIIMS","GR Hospital","MKM Hospital","SKS Hosppital","GRT Hospital","ARS Hospital"};
String[] Time = new String[] {"August 29 2PM","August 27 10AM","August 26 11AM","August 30 1PM","August 25 12PM","August 21 11AM ","August 22 3PM","August 28 10AM","August 26 2PM","August 24 11AM","August 25 12PM"};
Random rd = new Random();
NumN = rd.nextInt(Hospital.length);
System.out.println("The Allocated Hospital is  " + Hospital[NumN]);
 Random rm = new Random();
 num = rm.nextInt(Time.length);
 System.out.println("The Allocated time is " + Time[num]);
 
 }





}


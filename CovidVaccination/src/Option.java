import java.util.Scanner;

public class Option extends CitizenInfo
{
public void main()
{

Scanner s = new Scanner(System.in);
CitizenInfo c1 = new CitizenInfo();
System.out.println("Welcome to the covid 19 Vaccination Portal");
System.out.println("****************************************************************************************************************************************************");
System.out.println("(1)View\n (2)Add Detail\n(3) Delete\n(4).Hospital Availability\n(5)Bmi calculator\n(6).Exit");
System.out.println("Enter Your Choice\n");
ooption = s.nextInt();
try
{
do
{
switch(ooption)
{
case 1:
System.out.println("\n");
System.out.println("****************************************************************************************************************************************************");
c1.CitiInfo();
this.main();

System.out.println("****************************************************************************************************************************************************");
break;

case 2:
System.out.println("\n");

System.out.println("****************************************************************************************************************************************************");
CitizenUpdate s1 = new CitizenUpdate();
c1.CitiInfo();
s1.CitizenAdd();
System.out.println("****************************************************************************************************************************************************");
this.main();
break;
case 3:
System.out.println("\n");
System.out.println("****************************************************************************************************************************************************");
CitizenDelete d1 = new CitizenDelete();
c1.CitiInfo();
d1.CitizenDelete();
System.out.println("****************************************************************************************************************************************************");
this.main();
break;

case 4:
	System.out.println("\n");
	System.out.println("****************************************************************************************************************************************************");
	HospitalS h1 = new HospitalS();
	c1.CitiInfo();
	h1.HospitalSS();
	this.main();
	break;
case 5:
	System.out.println("\n");
	System.out.println("****************************************************************************************************************************************************");
	Bmi et = new Bmi();
	et.main(null);
	this.main();
	break;
case 6:
System.out.println("\n");
System.out.println("\nExit");
break;
default:
	System.out.println("Enter a valid input 1-6");
	this.main();
	
	}
}while(ooption!=6);
}
catch(Exception ooption)
{
	System.out.println("Invalid input");
}
}
}


	










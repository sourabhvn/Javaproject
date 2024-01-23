import java.util.Scanner;

public class CitizenUpdate extends CitizenInfo
{

public void CitizenAdd()
{

CitizenInfo c1 = new CitizenInfo();
Option j = new Option();
Scanner s = new Scanner(System.in);
System.out.print("\nEnter the register you want to Add");
edit=s.nextInt();
System.out.print("\n");
Lot=1;
edits=edit-1;

if(edit<=0)
{

System.out.println("Invalid Input");
j.main();

}

if(edit>8)
{
System.out.println("Invalid Input");
j.main();

}

if(edit>0)
{
do
{
{
System.out.print("Enter Your Age:\n");
slot1 = s.nextInt();
if(slot1< 18)
{
	System.out.println("You Are Not Eligible as You are below 18");
	break;
}
else
{
	System.out.println("You are eligible For Vaccination Process");
}
	
System.out.print("Enter Name:\n");
slot5 = s.next();
System.out.print("Enter Vaccine Dose Number(1or2):\n");
slot6 = s.next();
System.out.print("Enter Gender:\n");
slot7 = s.next();
System.out.print("Enter DOB:\n");
slot8 = s.next();
System.out.print("Enter Address:\n");
slot4 = s.next();
System.out.print("Enter Co-Morbidities:\n");
slot3 = s.next();
System.out.print("Enter Covid Infection History:\n");
slot2 = s.next();


}

if(slot1>0)
{
Age[edits]=slot1;
Name[edits]=slot5;
Dose[edits]=slot6;
Gender[edits]=slot7;
Dob[edits]=slot8;
Address[edits]=slot4;
CoMorbidities[edits]=slot3;
Infection[edits]=slot2;
System.out.println("Citizen Information Has been Added\n");
Lot++;
}
}
while(Lot<1);
}
else
{
System.out.println("Invalid Input Try Again");
}
}
}









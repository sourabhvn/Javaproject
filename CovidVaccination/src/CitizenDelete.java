import java.util.Scanner;

public class CitizenDelete extends CitizenInfo
{
public void CitizenDelete()
{

Option c1 = new Option();
Scanner s = new Scanner(System.in);

	 
 
System.out.println("Enter the register you want to delete:");
eraser = s.nextInt();
eraserheads=eraser-1;

if(eraser>0 && Age[eraserheads]!=0)
{
Name[eraserheads]="Empty";
Age[eraserheads]=1;
Dob[eraserheads]="Empty";
Gender[eraserheads]="Empty";
Address[eraserheads]="Empty";
CoMorbidities[eraserheads]="Empty";
Dose[eraserheads]="Empty";
Infection[eraserheads]="Empty";


System.out.println("Citizen Information Has Been Deleted Successfully\n");
}


else
{
	System.out.println("Try Again/n");
}
}
}


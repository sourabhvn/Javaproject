import java.util.Scanner;
public class CitizenInfo
{

public static String [] Name ={"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
public static String [] Gender = {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
public static String [] CoMorbidities = {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
public static String [] Dob = {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
public static String [] Address= {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
public static String [] Dose = {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
public static String [] Infection = {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
public static int [] Age = {1,1,1,1,1,1,1,1};



public static int i;
public static int set,slot1;
public static int edit,edits,Lot,adds,add;
String slot8,slot2,slot3,slot4,slot5,slot6,slot7;
public static int eraser,eraserheads;
public static int CitizenUpdate,CitizenDelete,CitizenAdd,ooption;


public void display()
{

System.out.println("****************************************************************************************************************************************************");
System.out.println("                                      Welcome To Vaccination Portal                                              ");
System.out.println("****************************************************************************************************************************************************");
Option m1 = new Option();
m1.main();
}
public void CitiInfo()
{
System.out.println("****************************************************************************************************************************************************");
System.out.println("                                      Citizen Information For Vaccination                                 ");
System.out.println("****************************************************************************************************************************************************");
System.out.println("Name \tGender\tCo-Morbidities\tDob\tAddress\tDose Number\tInfection Info\t\t\tAge\t\n");

try
{
for(i=0;i<=7;i++)
{
	
	System.out.println(Name[i]+"\t"+Gender[i]+"\t"+CoMorbidities[i]+"\t\t"+Dob[i]+"\t"+Address[i]+"\t\t"+Dose[i]+"\t\t"+Infection[i]+"\t\t\t"+Age[i]+"\n");
}}

catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("ArrayIndexOutOfBoundsException please correct the error");

}

}}





























































































































































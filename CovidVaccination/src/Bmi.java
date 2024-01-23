import java.util.Scanner;
 class Bmi extends CitizenInfo {
	 
static int Bmicalculator(int a,int b)
{

int iresult;
System.out.println("BMI is the body mass index");
System.out.println("Having a high BMI is very risky as it leads to obessity,BP,Diabities,Heart Problem,etc which becomes a problem incase infected with Covid-19");
System.out.println("BMI < 18.5 underweight");
System.out.println("BMI 18.5-24.9 is normal");
System.out.println("BMI < 18.5 underweight");
System.out.println("BMI > 25 overweight and obesse");

iresult=a/(b*b);

return (iresult);
}

static double Bmicalculator(double a,double b)
{
	
	double fresult;
	System.out.println("BMI is the body mass index");
	System.out.println("Having a high BMI is very risky as it leads to obessity,BP,Diabities,Heart Problem,etc which becomes a problem incase infected with Covid-19");
	System.out.println("BMI < 18.5 underweight");
	System.out.println("BMI 18.5-24.9 is normal");
	System.out.println("BMI < 18.5 underweight");
	System.out.println("BMI > 25 overweight and obesse");
	
	fresult=a/(b*b);
	return (fresult);	
}


public static void main(String args[])
{
	Scanner er = new Scanner(System.in);
	System.out.println("Enter the weight and height");
	int w=er.nextInt();
	int h=er.nextInt();
	System.out.println("Your BMI is"+Bmicalculator(w,h));
	System.out.println("Enter the weight and height");
	double wf=er.nextFloat();
	double hf=er.nextFloat();
	System.out.println("Your BMI is"+Bmicalculator(wf,hf));
	
}
}
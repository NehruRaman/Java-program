import java.util.Scanner;
class SampleIf
{
 int num1;
 int num2;
public void calculation(int num1,int num2)
{
//sum and product equal of two number 
if((num1+num2)==(num1*num2))
{
System.out.println("given a number sum and product number is same"+num1+"="+num2);
}
else
{
System.out.println("given a number sum and product number is not same");
}

//sum and product of the 2 number is divisible 4
if(((num1+num2)%4==0)&&((num1*num2)%4==0))
{
System.out.println("given a number sum and product number is divisibe of 4");
}
else
{
System.out.println("given a number sum and product number is not divisibe by 4");
}

//sum of 2 number is multiple of 2 or product of 2 number is multiple of 3 
if(((num1+num2)%2 == 0)||((num1*num2)%3 == 0))
{
System.out.println("given a number sum and product number is multiple of 2 or 3");
}
else
{
System.out.println("given a number sum and product number is not multiple of 2 or 3");
}

}

public void calculation1(int num1)
{

//odd even number

if(num1%2==0)
{
System.out.println("even number is: "+num1);
}
else
{
System.out.println("odd number is : "+num1);
}

//givn number is not multple of 3 and 7

if((num1%3 !=0)&&(num1%7 !=0))
{
System.out.println("with multiple: "+num1);
}
else
{
System.out.println("without multiple : "+num1);
}


}
public static void main(String args [])
{

SampleIf si = new SampleIf();
Scanner na = new Scanner(System.in);
System.out.println("Enter The num1 value is:");
si.num1 = na.nextInt();
System.out.println("Enter The num2 value is:");
si.num2 = na.nextInt();

si.calculation(si.num1,si.num2);
si.calculation1(si.num1);
}
}


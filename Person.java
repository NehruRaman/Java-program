import java.util.Scanner;
public class Person
{
int age;

public String ageCalculation(int age)
{
if((age>=0)&&(age<3))
{
return "babies";
}
else if((age>=3)&&(age<=16))
{
return "Children";
}
else if((age>=17)&&(age<=30))
{
return "Young Adult";
}
else if((age>=31)&&(age<45))
{
return "Middle Age Adult";
}
else if((age>=45)&&(age<=120))
{
return "Old Adult";
}
else
{
return "please check your age" ;
}

}

public static void main(String args[])
{
Person p = new Person();
Scanner na =new Scanner(System.in);

System.out.println("enter your age");
p.age = na.nextInt();
String age = p.ageCalculation(p.age);
System.out.println(age);
}
}

import java.util.Scanner;
public class Student1
{
int mark;
public String gread(int mark)
{
if((mark>=35)&&(mark<50))
{
return "E Gread";
}
if((mark>=50)&&(mark<60))
{
return " D Gread ";
}
if((mark>=60)&&(mark<70))
{
return "C Gread ";
}
if((mark>=70)&&(mark<80))
{
return "B Gread";
}
if((mark>=80)&&(mark<100))
{
return "A Gread";
}
else
{
return "Please Check Your Input";
}
}
public static void main(String args [])
{
Student1 s = new Student1();
Scanner na = new Scanner(System.in);
System.out.println("Enter the  your Mark");
s.mark = na.nextInt();
String mark = s.gread(s.mark);
System.out.println(mark);
}
}

import java.util.Scanner;
public class Money
{
long bankBalance;
public String currencyStatus(long bankBalance)
{
if((bankBalance>=0)&&(bankBalance<=10000))
{
return "Lower Middle Class";
}
if((bankBalance>=20000)&&(bankBalance<=100000))
{
return " Middle Class";
}
if((bankBalance>=100000)&&(bankBalance<1000000))
{
return "upper Middle Class";
}
if((bankBalance>=1000000)&&(bankBalance<1000000000))
{
return "millionaire";
}
if((bankBalance>=1000000000)&&(bankBalance<1000000000000l))
{
return "billionaire";
}
else
{
return "Please Check Your Input";
}
}
public static void main(String args [])
{
Money m = new Money();
Scanner na = new Scanner(System.in);
System.out.println("Enter the  your Bank Balance");
m.bankBalance = na.nextInt();
String bankBalance = m.currencyStatus(m.bankBalance);
System.out.println(bankBalance);
}
}

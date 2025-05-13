import java.util.Scanner;
public class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int rev=0,temp;
System.out.println("Enter the Number:");
int num=sc.nextInt();
temp=num;
while(num>0)
{
int rem=num%10;
rev=rev*10+rem;
num=num/10;
}
if(temp==rev)
{
System.out.println(temp+" is a Palindrome");
}
else
{
System.out.println(temp+" is not a Palindrome");
}
}
}


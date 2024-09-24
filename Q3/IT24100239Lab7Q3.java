import java.util.Scanner;
public class IT24100239Lab7Q3{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int i;
for(i=1;i<=5;++i)
{
System.out.println("Customer "+i);
System.out.println("Enter total bill amount: ");
float amount=input.nextFloat();
System.out.println("Enter the mode of payment (C for cash, O for other): ");
char mode=input.next().charAt(0);
{
switch(mode){
case 'c':
float diss,tamount;
diss=amount*(5.0f/100);
tamount=amount-diss;
System.out.println("Disscount is : "+diss);
System.out.println("Amount to be paid : "+tamount);
break;
case 'o':
tamount=amount;
System.out.println("No disscount applicable");
System.out.println("Amount to be paid : "+tamount);
break;
default:
System.out.println("Payment method is not valid");
}
}
}
}
}
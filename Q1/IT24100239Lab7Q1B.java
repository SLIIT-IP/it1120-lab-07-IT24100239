import java.util.Scanner;
public class IT24100239Lab7Q1B{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 int count=1;
 while(count<=3){
 System.out.println("Student "+count);
 System.out.print("Enter marks: ");
 int marks1 = input.nextInt();
 System.out.print(" ");
 int marks2 = input.nextInt();
 System.out.print(" ");
 int marks3 = input.nextInt();
 System.out.print(" ");
 int marks4 = input.nextInt();

 double avg=(marks1+marks2+marks3+marks4)/4.0;
 System.out.println("Average is : "+avg);
if(avg>=0 && avg<=49){
System.out.print("overall grade is : Fail");}
if(avg>=50 && avg<=74){
System.out.print("overall grade is : Credit");}
if(avg>=75 && avg<=100){
System.out.print("overall grade is : Distinction");
} 
count++;
}
}
}
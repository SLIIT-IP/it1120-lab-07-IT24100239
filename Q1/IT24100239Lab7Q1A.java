import java.util.Scanner;
public class IT24100239Lab7Q1A{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 int marks1,marks2,marks3,marks4;
 System.out.println("Enter marks for four subjects:");
 System.out.println("Enter subject mark 1: ");
 marks1 = input.nextInt();
 System.out.println("Enter subject mark 2: ");
 marks2 = input.nextInt();
 System.out.println("Enter subject mark 3: ");
 marks3 = input.nextInt();
 System.out.println("Enter subject mark 4: ");
 marks4 = input.nextInt();
 double avg=(marks1+marks2+marks3+marks4)/4;
 System.out.println("Average is : "+avg);
if(avg>=0 && avg<=49){
System.out.print("overall grade is : Fail");}
if(avg>=50 && avg<=74){
System.out.print("overall grade is : Credit");}
if(avg>=75 && avg<=100){
System.out.print("overall grade is : Distinction");
} 

}
}
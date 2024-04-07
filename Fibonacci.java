import java.util.*;
class Fibonacci{
public static void main(String[]args){
int a=0;
int b=1; 
int c;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=sc.nextInt();
System.out.println("The values are:");
for(int i=1;i<=n;i++){
 System.out.println(""+a);
 c=a+b;
 a=b;
 b=c;
   }
 System.out.println("end of the program");
 }
}


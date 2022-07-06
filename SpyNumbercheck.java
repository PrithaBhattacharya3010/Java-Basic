import java.util.Scanner;  
public class SpyNumbercheck 
{  
public static void main(String args[])  
{   
int n, p=1, s=0, lastdigit;    
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number to check: " );  
n=sc.nextInt();  

while(n>0)  
{  
      
lastdigit=n%10;  
  
s=s+lastdigit;  
  
p=p*lastdigit;  
  
n=n/10;  
}  
 
if(s==p)  
  
System.out.println("The given number is a spy number.");  
else  

System.out.println("The given number is not a spy number.");  
}  
}  

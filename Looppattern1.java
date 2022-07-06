import java.util.*;
class Looppattern1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your choice(1/2)");
int ch=sc.nextInt();
switch(ch){
case 1:
       for(int i=1;i<=4;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j+" ");
			}
		System.out.println();
		}
       break;
case 2:
       for(int i=1;i<=4;i++){
		for(int j=4;j>=i;j--){
			System.out.print(j+" ");
			}
             System.out.println();
		}
       break;
}
}
}
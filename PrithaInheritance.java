import java.util.*;

//Concept of Inheritance

public class PrithaInheritance {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Roll Number");
        int a1=sc.nextInt();
        B obj=new B();
        obj.roll=a1;
        obj.show();
        B obj3=new B();
        obj3.age=24;
        obj3.display();
        D obj5=new D(6);
        sc.close();
    }
}
class A{
    int age;
    int roll;
    void show(){
        System.out.println("Roll is:"+this.roll);
    }
    A(){
        System.out.println("Calling the the default constructor ");

    }
    A(int n){
        System.out.println("calling the parameterized constructor which is giving value : "+n);
    }
}
//Class B is the Child of A
class B extends A{
    void display(){
        System.out.println("Age is "+this.age);
        }

}
class C{
    String name;
    float Height;
    C(float n){
        Height=n;
        System.out.println("Height is "+Height);
    }
}
class D extends C{

    D(float n) {
        super(n);
        //TODO Auto-generated constructor stub
        //As we have mentioned parameterized constructor in Class c so we have to declare same in the child class

    }

}


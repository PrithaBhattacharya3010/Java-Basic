public class Prithaoop1 {
    //understanding the concept of Class and Object , Methods and methods overloading
    public static void main(String[] args) {
        System.out.println("Hello");
        Person p2=new Person(9);   //creating a object of class Person
        p2.age=25;                
        p2.name="Pritha";   //initialising the name 
        p2.show();
        p2.display();
        p2.icecream();
        p2.icecream(20);
        Person p1=new Person(8);  //Creating a new object
        p1.age=24;       //initialising the value by dot operator using object
        p1.show();       //calling the method by dot operator
        System.out.println("Age:"+p1.age);

    }
    
}

class Person{
    String name;
    int age;
    void display(){
        System.out.println("Name is:"+this.name+"\n "+name+" is displaying");
    }
    void show(){
        System.out.println("Age is :"+age);      //this operator will return the value of current object
    }
    void icecream(){
        System.out.println("Love Icecream");
    }
    void icecream(int num){ //Method overloading (Compile time polymorphism)
        System.out.println(name+"is eating"+num+" icecreams");
    }
    public Person(int n){
        System.out.println("This is parameterized constructor which is giving value:"+n);
    }
}

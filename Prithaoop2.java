public class Prithaoop2 {
    //Constructor concept and Static Keyword
    //if we do not create any constructor then java automatically calls the default constructor

    public static void main(String[] args) {  //main method creation 
      Car first =new Car(); //constructing a new object of Car class
      first.speed=79;       //initializing the speed by dot operator using object
      first.name="audi";
      first.color="Yellow";
      System.out.println("The Speed of the Car is:"+first.speed);
      Car second=new Car(56,"maruti"); //parameterized constructor
      System.out.println("The Speed of the Car is:"+second.speed+" The name of the car is "+second.name);
      System.out.println("the constructor called "+Car.count+" no. of times");//as we have declared count as static property so without any object we can access it
    }
}
 class Car{
    static int count;   //counting the number of constructor has been called,, we are taking this as statis because this should be a class property
    int speed;
    String color;
    String name;
    public Car(){
        count++;
        System.out.println("creating an object");  //whenever new object is creating then the constructor is called
    }
    public Car(int newSpeed,String newName){ 
          //parameterized constructor definition
        this(); //here this keyword is basically calling the default constructor , this used for calling a constructor from another constructor
        count++;
        name=newName;// another work of this operator is this.name=name; here this denotes that this class's name should hold the name from the constructor;
        speed=newSpeed;
    }


 }
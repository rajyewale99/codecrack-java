import java.util.*;
public class abstraction {
    public static void main(String args[]){
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        Horse1 h1= new Horse1();
        
    }
}
abstract class Animal{
    //abstract class cha object nahi banavu shakat
    //y amadhe 2 type che function astat abstract functuonand nion abstract function
    String color;
    Animal(){
        color="brown";
        System.out.println("Animal constructor called");
    }
    void eat(){ // non abstract function

        System.out.println("eats everything");
    }
    abstract void walk(); // abstarct function
    //abstract function ethe base class madhech define nahi karat
    //yala derivecd class madhe compulsory define karava lagto
    //he parameter ghet nahi
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changecolor(){
        color="darkbrown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor called");
    }
    void changecolor(){
        color="white";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
class Horse1 extends Horse{
    Horse1(){
        System.out.println("Horse1 constructor called");
    }
}

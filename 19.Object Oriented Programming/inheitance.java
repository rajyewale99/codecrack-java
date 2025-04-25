//Java Madhe mutltiple inheritance ansta 
//c++ madhe asta
public class inheitance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
}
//Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void btreath(){
        System.out.println("breaths");
    }
}
//Derived Class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim in water");
    }
}

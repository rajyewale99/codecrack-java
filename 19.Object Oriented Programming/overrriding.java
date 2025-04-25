//override kelya nanater child class chach function executye hota
public class overrriding {
    public static void main(String args[]){
        Deer d = new Deer();
        d.eat();
        // Animal a = new Animal();
        // a.eat();
    }
}
class Animal{
    void eat(){
        System.out.print("eats everything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.print("eats Grass");
    }
}

//static keyword vaprun apn direct classname ne variable access kar shakto
//main madhe classname.variable 
import java.util.*;
public class statickey {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolname="Modern";

        Student s2 = new Student();
        System.out.println(s2.schoolname);

        Student s3 = new Student();
        // s3.schoolname="abc";
        System.out.println(s3.schoolname);
        System.out.println(Student.schoolname);
    }
}
class Student{
    String  name;
    int roll;
    static String schoolname;

    void setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
}

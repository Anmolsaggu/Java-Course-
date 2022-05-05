import javax.crypto.spec.PSource;

class Employeee{
    String name;
    int Salary;
public Employeee(){
    name = "Anmol Saggu";
    Salary = 100000;
}

public Employeee(int salary){
     Salary = salary;
}
}

class Rectangle{

    int length;
    int breadth;
    public Rectangle(){
        length = 4;
        breadth = 5;
    }
    public int RectangleGetData(){
        return length * breadth;
    }

    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    public int GetData(){
        return length;
    }
    public int GetData2(){
        return breadth;
    }
}

class Parent{
    void Habits(){
        System.out.println("Always respect your elders");
    }
    void greet(){
        System.out.println("hello everyone! Good Morning");
    }
}
 class Children extends Parent implements PutTogether{
    void Playing(){
        System.out.println("Children's are Playing");
    }
    void Speak(){
        System.out.println("Children's are speaking and singing");
    }

     @Override
     public void Handsome() {

     }

     @Override
     public void Beautiful() {

     }

     @Override
     public void playing() {

     }

     @Override
     public void hair() {
         PutTogether.super.hair();
//         System.out.println("you hair is awesome");
     }

     @Override
     public void Respect() {

     }
 }
interface GrandChildren{
    void hair();
    void Handsome();
    void Beautiful();
}
interface GrandGrandChildren extends GrandChildren{
    void playing();
    default void hair(){
        System.out.println("your hair is not so good");
    }

}

interface PutTogether extends GrandChildren , GrandGrandChildren{
      void Respect();
}

public class ab_Practice {
    public static void main(String[] args){
//        System.out.println("hello world");
//        Employeee e1 = new Employeee();
//        Employeee e1 = new Employeee(200000);
//        int salary = e1.Salary;
//        System.out.println(e1.Salary);
//        System.out.println(e2.salary);
//        Rectangle rc = new Rectangle();
//        System.out.println(rc.RectangleGetData());
//        Rectangle rc1 = new Rectangle(8,4);
//        System.out.println(rc1.RectangleGetData());

        Children ch = new Children();
        ch.hair();



    }
}

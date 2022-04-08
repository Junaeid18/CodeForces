public class Constructor {
    public static void main(String[] args){
        
        Example proto1 = new Example();
        proto1.print();        
        proto1.NotAlien("Junaeid");
        
    }
    public void print(){
        System.out.println("Without parameter");
    }
    public void print(int a){
        System.out.println("With parameter a : "+a);
    }
    public void print(int a, int b){
        System.out.println("With both a:"+ a+" & b: "+b);
    }
}

class Example extends Human implements FromEarth{
    
    public void print(){
        System.out.println("Abstract Method extended");
    }

    public void NotAlien(String s){
        System.out.println(s+" is not an alien");
    }
}

interface FromEarth{
    public void NotAlien(String s);
}

abstract class Human{
    String name;
    int age;
    public abstract void print();
}



class MyCar{
    String brand;
    int topSpeed;
    public MyCar(){}
    public MyCar(String a){
        this.brand = a;
    }
    public MyCar(int b){
        this.topSpeed = b;
    }
}




/* MyCar a = new MyCar("Audi");
System.out.println(a.brand);
MyCar b = new MyCar(1000);
System.out.println(b.brand+" - "+b.topSpeed);
MyCar c = new MyCar();
System.out.println(c.brand+" - "+c.topSpeed); */

/* Constructor mine = new Constructor();
mine.print();
mine.print(100);
mine.print(10,7); */
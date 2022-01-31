class base{
  private   int x;
    public void printMe(){
        System.out.println("I am a constructor");
    }

    public int getX() {
        System.out.println(" I am in base ");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class CWH_45_inheritance {
    public static void main(String[] args) {
        base b= new base()  ;
        b.setX(23);
        System.out.println(b.getX());
      //  b.printMe();
Derived d = new Derived();
d.setY(35);
System.out.println(d.getY());
d.setX(34);
System.out.println(d.getX());
        System.out.println();

    }
}

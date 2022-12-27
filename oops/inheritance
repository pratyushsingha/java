class base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base &  setting X now");
        this.x = x;
    }

    public void printme(){
        System.out.println("i am a constructor");
    }

}
class derive extends base{
   public int y;

    public void setY(int y) {
        System.out.println("I am in derive &  setting Y now");
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class inheritance {
    public static void main(String[] args){
//        creating an object of base class
base b = new base();
b.setX(4);
System.out.println(b.getX());
//creating an object of derive class
derive d = new derive();
d.setX(233);
System.out.println(d.getX());
d.setY(23);
System.out.println(d.getY());

    }
}

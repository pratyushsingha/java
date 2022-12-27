
import java.util.Scanner;
class MyEmployee {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0){
            throw new IllegalArgumentException("Invalid args");
        }
        this.id = id;
    }
    public void MyEmployee(String Myname, int Myid){
        name = Myname;
        id = Myid;

    }

}
    class constractor1 {
        public static void main(String[] args) {
            MyEmployee me = new MyEmployee();
            Scanner sc = new Scanner(System.in);
            System.out.println("Set Id");
            int id = sc.nextInt();
            me.setId(id);
            System.out.println("Set name");
            String name = sc.next();
            me.setName(name);
            System.out.println(me.getId());
            System.out.println(me.getName());

        }
    }


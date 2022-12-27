class employee {
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}



public class custom_class {

    public static void main(String[] args) {
        System.out.println("This Is Our Custom Class");
//        initializing new object;
        employee pratyush = new employee();
        employee angshu = new employee();
//        setting attributes for pratyush
        pratyush.name = "CodeWithCat";
        pratyush.id = 1;
        pratyush.salary = 20;
//        setting attributes for angshu

        angshu.id = 12;
        angshu.name = "angshu roy";
        angshu.salary = 40;

        System.out.println(pratyush.name);
        System.out.println(pratyush.id);
        pratyush.printDetails();
//        int salary =pratyush.getSalary();
//        System.out.println(salary);

        angshu.printDetails();
        int salary =angshu.getSalary();
        System.out.println(salary);

    }
}

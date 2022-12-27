public class variable_arguments {
//    static int sum(int a, int b){
//        return a + b;
//    }
//    static int sum(int a, int b, int c){
//        return a + b + c;
//    }
    static int sum(int x,int ...arr){
        int result = x;
        for (int a: arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Wowwwww");
        System.out.println("The Sum is:" +  sum(2));
        System.out.println("The Sum of 4,5 and 7 is:" +  sum(4,5,7));
        System.out.println("The Sum is:" +  sum(4,5,7,9,87,87,87666));


    }
}

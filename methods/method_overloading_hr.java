public class method_overloading {
    static void change(int x){
        x = 30;
    }
    static void change2(int[] marks){
        marks[0]=60;
    }
     static void TellJoke(){
        System.out.println("I am a Introvert\n");
    }
    static void hoo(){
        System.out.println("Let's Code");
    }
    static void hoo(int a){
        System.out.println("Let's code " +a+ " bro");
    }
    static void hoo(int a, int b){
        System.out.println("Let's Code " +a+ " bro");
        System.out.println("Let's Code " +b+ " bro");
    }

    static void hoo(int a, int b, int c){
        System.out.println("Let's Code " +a+ " bro");
        System.out.println("Let's Code " +b+ " bro");
        System.out.println("Let's Code " +c+ " bro");

//        return 3;
    }




    public static void main(String[] args) {
        TellJoke();


//        int [] marks ={2,343,453,12,34};
//        **changing the integer
//       int x = 80;
//        change(x);
//        System.out.println(x);  //value of x will remain unchanged
//        **changing the array
//        change2(marks);
//        System.out.println(marks[0]);//value of marks[0] changed

//        **method overloading
        hoo();
        hoo(300);
        hoo(100,200);
        hoo(100,200,1000);
    }
}

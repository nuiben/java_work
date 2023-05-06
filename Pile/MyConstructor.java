public class MyConstructor {
   int x = 5;

   public static void main(String[] args)
   {
    MyConstructor mc1 = new MyConstructor(4);
    MyConstructor mc2 = new MyConstructor();
  }

   MyConstructor() {
       System.out.print("x" + x);
   }
   MyConstructor(int x) {
       this();
       System.out.print("x" + x);
   }
}
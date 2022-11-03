 class Inheritance {
    public static void Cat(){
        System.out.println("can Run");
        System.out.println("can Jump");
    }
}
  class BabyBird extends Inheritance{
     public static void BabyCat(){
             System.out.println("can't Climb");
         }
     }

class TestInheritance{
    public static void main(String[] args) {
        BabyBird b = new BabyBird();
        b.Cat();
        b.BabyCat();

    }
}
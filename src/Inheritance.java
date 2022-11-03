 class Animal {
    public static void Cat(){
        System.out.println("can Run");
        System.out.println("can Jump");
    }
}
  class BabyAnimal extends Animal{
     public static void BabyCat(){
             System.out.println("can't Climb");
         }
     }

class TestInheritance{
    public static void main(String[] args) {
        BabyAnimal b = new BabyAnimal();
        b.Cat();
        b.BabyCat();

    }
}

package MultilevelInheritance;
//2. Second class
 class Dog extends Animal{
     public void bark() {
         System.out.println("barking...");
     }
 }
//3.Third class
class BabyDog extends Dog{
     public void weep(){
         System.out.println("weeping...");
     }
 }
// Forth class
class TestInheritance2{
    public static void main(String[] args) {
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("bhawwwww");
        }
        
    }
    public static class Cat{
         void speak(){
            System.out.println("mewo mewo");
        }

    }
    public static class Lion{
         void speak(){
            System.out.println("GRRRRRR");
        }

    }
    public static class Human{
         void speak(){
            System.out.println("HEYYYYY");
        }

    }
    public static void main(String[] args) {
        Human h = new Human();
        Lion l = new Lion();
        Cat c = new Cat();
        Dog d = new Dog();

        h.speak();
        l.speak();
        c.speak();
        d.speak();
        
    }
    
}

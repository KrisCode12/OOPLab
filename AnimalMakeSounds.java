import java.util.Scanner;
public class RunAnimal{

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Animals c = new Cat();
        Animals b = new Bird();
        Animals d = new Dog();

        System.out.println("Choose an animal. Press B for Bird, C for Cat or D for Dog.");
        String choice = scan.nextLine();

        if(choice.equalsIgnoreCase("B")){
            b.makeTrivia();
            b.makeSound();

        }else if (choice.equalsIgnoreCase("C")) {

            c.makeTrivia();
            c.makeSound();
        }
        else if(choice.equalsIgnoreCase("D")){
            d.makeTrivia();
            d.makeSound();
        }else{
            System.out.println("Wrong input! out of choices!");
        }



    }
}
 abstract class Animals {
    abstract void makeSound();
    abstract void makeTrivia();
}
 class Cat extends Animals {
    @Override
    void makeSound() {
        System.out.println("meow meow");
    }

    @Override
    void makeTrivia() {
        System.out.println("Cats love to sleep and jump up to 6 times of their height. ");
    }
}
 class Bird extends Animals {
    @Override
    void makeSound() {
        System.out.println("tweet tweet");
    }

    @Override
    void makeTrivia() {
        System.out.println("Birds migrate to another country and birds has no teeth.");

    }
}
 class Dog extends Animals{
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }

    @Override
    void makeTrivia() {
        System.out.println("Dogs don't sweat like we do, some are incredible swimmers.");
    }
}


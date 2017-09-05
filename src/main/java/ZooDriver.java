import java.util.Random;

public class ZooDriver {
    public static void main(String[] args) {
        Random rand = new Random();
        Animal[] animals = new Animal[10];
        for (int i = 0; i < animals.length; i++) {
            int r = rand.nextInt(4) + 1;
            switch (r) {
                case 1:
                    animals[i] = new Cat();
                    break;
                case 2:
                    animals[i] = new Dog();
                    break;
                case 3:
                    animals[i] = new Tiger();
                    break;
                case 4:
                    animals[i] = new Elephant();
                    break;
                default:
                    System.out.println("random number out of bounds, creating a cat");
                    animals[i] = new Cat();
            }
        }

        for (Animal a : animals) {
            if (a instanceof Tiger) {
                System.out.println("Warning - calling Tiger!");
            }
            a.speak();
        }
    }
}

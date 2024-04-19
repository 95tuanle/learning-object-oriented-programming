public class Abstraction {
    public static void main(String[] args) {
        PigAbstract pigAbstract = new PigAbstract();
        pigAbstract.animalSound();
        pigAbstract.sleep();
    }
}

abstract class AnimalAbstract {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class PigAbstract extends AnimalAbstract {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

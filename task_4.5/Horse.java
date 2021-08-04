public class Horse extends Animal {
    public Horse(boolean vegetarian, String speak, byte paws) {
        super(vegetarian, speak, paws);
    }

    public void run() {
        System.out.println("Игого, я поскакал(а)");
    }
}

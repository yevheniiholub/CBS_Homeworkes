package Anonymous_classes_and_Enums.Task_2;

public enum Animals {

    elephant(15), monkey(10), tiger(12), lion(18);

    private int animalAge;

    Animals(int animalAge) {
        this.animalAge = animalAge;
    }

    @Override
    public String toString() {
        return this.name() + " age is " + animalAge;
    }
}

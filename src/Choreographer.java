public class Choreographer extends Person {
    private int numberOfBallets;

    public Choreographer(String name, String surname, Gender gender, int numberOfBallets) {
        super(name, surname, gender);
        this.numberOfBallets = numberOfBallets;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
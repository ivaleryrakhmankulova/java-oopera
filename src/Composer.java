public class Composer extends Person {
    private int numberOfCompositions;

    public Composer(String name, String surname, Gender gender, int numberOfCompositions) {
        super(name, surname, gender);
        this.numberOfCompositions = numberOfCompositions;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
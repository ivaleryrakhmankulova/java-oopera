import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле \"" + title + "\".");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surnameToReplace + " не найден в спектакле \"" + title + "\".");
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println("  " + actor);
        }
    }

    public Director getDirector() { return director; }
    public String getTitle() { return title; }

    @Override
    public String toString() {
        return "Режиссёр спектакля \"" + title + "\": " + director;
    }
}
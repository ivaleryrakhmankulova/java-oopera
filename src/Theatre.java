public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Анна", "Павлова", Gender.MALE, 170);
        Actor actor2 = new Actor("Мария", "Сидорова", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Алексей", "Кузнецов", Gender.MALE, 180);

        Director director1 = new Director("Сергей", "Иванов", Gender.MALE, 12);
        Director director2 = new Director("Ольга", "Смирнова", Gender.FEMALE, 8);

        Composer musicAuthor = new Composer("Пётр", "Чайковский", Gender.MALE, 7);
        Choreographer choreographer = new Choreographer("Мариус", "Петипа", Gender.MALE, 60);

        Show drama = new Show("Три сестры", 150, director1);
        Opera opera = new Opera("Евгений Онегин", 180, director2,
                musicAuthor,
                "Действие первое. Поместье Лариных...", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 120, director1,
                musicAuthor,
                "Действие первое. Праздник в замке...", choreographer);

        drama.addActor(actor1);
        drama.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("Актёры спектакля \"" + drama.title + "\":");
        drama.printActors();
        System.out.println("Актёры спектакля \"" + opera.title + "\":");
        opera.printActors();
        System.out.println("Актёры спектакля \"" + ballet.title + "\":");
        ballet.printActors();

        System.out.println("Замена актёра в опере \"" + opera.title + "\":");
        opera.replaceActor(actor1, "Сидорова");
        System.out.println("Актёры спектакля \"" + opera.title + "\":");
        opera.printActors();

        System.out.println("Попытка замены несуществующего актёра в балете \"" + ballet.title + "\":");
        ballet.replaceActor(actor2, "Нагиев");
        ballet.printActors();

        System.out.println();
        System.out.println("Либретто спектакля \"" + opera.title + "\":");
        opera.printLibretto();
        System.out.println("Либретто спектакля \"" + ballet.title + "\":");
        ballet.printLibretto();
    }
}
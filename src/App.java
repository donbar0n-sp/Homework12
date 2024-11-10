public class App {
    public static void main(String[] args) {
    Author dostojewski = new Author("Фёдор", "Достоевский");
    Author tolstoi = new Author("Лев", "Толстой");

    Book theIdiot = new Book("Идиот", dostojewski, 1868);
    Book warAndPeace = new Book ("Война и мир", tolstoi, 1865);
        System.out.println(warAndPeace.getPublishedYear());
        warAndPeace.setPublishedYear(1869);
        System.out.println(warAndPeace.getPublishedYear());
    }
}

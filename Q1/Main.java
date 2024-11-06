public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book("Sonnet 116", 50, "William Shakespeare");

        Movie movie1 = new Movie();
        Movie movie2 = new Movie("Whiplash", 15, "Damien Chazelle");

        book1.setName("East of Eden");
        book1.setPrice(80);
        book1.setAuthor("John Steinbeck");

        movie1.setName("Inception");
        movie1.setPrice(50);
        movie1.setDirector("Christopher Nolan");

        System.out.println("Book 1: " + book1.getName() +
                "\nAuthor: " + book1.getAuthor() +
                "\nPrice: " + book1.getPrice() +
                "\nDiscount Amount: " + book1.getDiscount());

        System.out.println("----------------------------------------------");

        System.out.println("Book 2: " + book2.getName() +
                "\nAuthor: " + book2.getAuthor() +
                "\nPrice: " + book2.getPrice() +
                "\nDiscount Amount: " + book2.getDiscount());

        System.out.println("----------------------------------------------");

        System.out.println("Movie 1: " + movie1.getName() +
                "\nDirector: " + movie1.getDirector() +
                "\nPrice: " + movie1.getPrice() +
                "\nDiscount Amount: " + movie1.getDiscount());

        System.out.println("----------------------------------------------");


        System.out.println("Movie 2: " + movie2.getName() +
                "\nDirector: " + movie2.getDirector() +
                "\nPrice: " + movie2.getPrice() +
                "\nDiscount Amount: " + movie2.getDiscount());

        System.out.println("----------------------------------------------");
    }
}

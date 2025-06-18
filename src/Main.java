public class Main {
    public static void main(String[] args) {

        int ticketPrice = 15505;
        int bonus = 20;
        int bonusMiles = ticketPrice / bonus;

        System.out.println("Credited to you: " + bonusMiles + " miles");
    }
}
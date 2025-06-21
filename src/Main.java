public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        System.out.println("Начисленные мили: " + service.calculate(1550));
        System.out.println("Начисленные мили: " + service.calculate(200));
        System.out.println("Начисленные мили: " + service.calculate(219));
        System.out.println("Начисленные мили: " + service.calculate(221));
    }
}
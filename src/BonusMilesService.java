public class BonusMilesService {
    public int calculate (int ticketPrice) {
        int bonus = 20;
        int bonusMiles;
        bonusMiles = ticketPrice / bonus;
        return bonusMiles;

    }
}

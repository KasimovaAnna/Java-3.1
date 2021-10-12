public class BonusMilesService {

    public int calculate (int priceTicket) {
        int oneMile = 20;
        int mileAll = priceTicket / oneMile;
        return mileAll;
    }
}

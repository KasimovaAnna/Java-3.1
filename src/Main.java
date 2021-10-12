public class Main {
    public static void main(String[] args) {
       BonusMilesService service = new BonusMilesService();
       int priceTicket = 10_000;
       int mileAll = service.calculate(10_000);

       System.out.println("Ваши мили:" + mileAll);
    }
}



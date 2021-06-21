public class Main {
    public static void main ( String [] args ) {

        BmiService service = new BmiService();
        double bmiZina = service.calculate (60.2,1.76 );
        System.out.println(bmiZina);

        double bmiOlga = service.calculate (50.1,1.80 );
        System.out.println(bmiOlga);

        double bmiRuslan = service.calculate (83.2,1.76 );
        System.out.println(bmiRuslan);
    }
}

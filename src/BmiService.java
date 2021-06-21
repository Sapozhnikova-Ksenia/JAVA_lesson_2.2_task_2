public class BmiService {
    public double calculate( double весВКг, double ростВМетрах){
        double bmi = (весВКг / (ростВМетрах* ростВМетрах) ) ;
        return bmi;
    }
}

public class BmiService {

    public double calculate(double weightKilograms, double heightMeters) {
        double index = weightKilograms / (heightMeters * heightMeters);

        return (int) index;
    }
}

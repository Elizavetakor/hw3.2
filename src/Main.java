public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double targetBmi = service.calculate(98, 1.87);
        System.out.println(targetBmi);
    }
}

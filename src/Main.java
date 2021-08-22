public class Main {
    public static void main(String[] args) {
        BmService service = new BmService();
        {
            float height = 1.71f;
            int bodyMass = 78;
            float bodyMassIndeximt = service.calculate(height, bodyMass);
            System.out.print("Индекс массы вашего тела ");
            System.out.printf("%.2f", (float) bodyMassIndeximt);

        }
    }
}

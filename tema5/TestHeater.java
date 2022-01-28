public class TestHeater {
    public static void main(String[] args) {
        Heater temp1 = new Heater(17, 26);
        temp1.setIncrement(1);
        temp1.cooler(3);
        temp1.warmer(12);
        System.out.println(temp1.getTemperature());
    }
}

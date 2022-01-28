public class TestClock {
    public static void main(String[] args) {
        ClockDisplay reloj = new ClockDisplay();
        reloj.setTime(12, 12, 15);
        NumberDisplay reloj1 = new NumberDisplay(59);
        reloj1.increment(reloj.setTime(12, 12, 40));
        System.out.println(reloj.getTime());
    }
}

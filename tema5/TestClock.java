public class TestClock {
    public static void main(String[] args) {
        ClockDisplay reloj = new ClockDisplay();
        reloj.timeTick();
        reloj.timeTick();
                
        System.out.println(reloj.getTime());
        
        for (int i = 0; i < 3600; i++) {
            reloj.timeTick();
        }
        System.out.println(reloj.getTime());
        
        /* ClockDisplay reloj1 = new ClockDisplay(9,12,15);
        reloj1.setTime(15, 10, 14);

        System.out.println(reloj1.getTime());
        */
    }
}

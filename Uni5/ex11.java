package Uni5;

public class ex11 {

    public static void main(String[] args) {
        int totalBiscuitsBroken = 0;
        int biscuitsBrokenThisHour = 1;

        for (int hour = 1; hour <= 16; hour++) {
            totalBiscuitsBroken += biscuitsBrokenThisHour;

            if (hour == 1) {
                biscuitsBrokenThisHour = 3;
            } else {
                biscuitsBrokenThisHour *= 3;
            }
        }

        System.out.println("Total biscuits broken in a day: " + totalBiscuitsBroken);
    
    }
}

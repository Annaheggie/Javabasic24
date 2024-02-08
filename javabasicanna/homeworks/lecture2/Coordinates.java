package javabasicanna.homeworks.lecture2;



public class Coordinates {

    public static void main(String[] args) {
        Coordinates.sanny sanny = getSanny();

        danny(sanny.latitude(), sanny.longitude());
    }

    private static sanny getSanny() {
        System.out.println("Odesa Opera and Ballet Theatre " );
        //Odesa Opera and Ballet Theatre
        double latitude = 46.485556;
        double longitude = 30.741667;
        sanny sanny = new sanny(latitude, longitude);
        return sanny;
    }

    private record sanny(double latitude, double longitude) {
    }

    private static void danny(double latitude, double longitude) {
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
    }
}
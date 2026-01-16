package CorePrograming.Programing_Elements.level1;

public class VolumeofEarth {

    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;

        // Volume in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert km³ to miles³ (1 km = 0.621371 miles)
        double volumeMiles = volumeKm * Math.pow(0.621371, 3);

        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeKm +
                        " and cubic miles is " + volumeMiles
        );
    }
}


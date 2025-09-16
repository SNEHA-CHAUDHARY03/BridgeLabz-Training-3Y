// Class name indicates purpose: EarthVolume
class EarthVolume {

    public static void main(String[] args) {

        // Radius of earth in kilometers
        double radiusKm = 6378;

        // Conversion factor: 1 km = 0.621371 miles
        double radiusMiles = radiusKm * 0.621371;

        // Compute volume using formula (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Display result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}
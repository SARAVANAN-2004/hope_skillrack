package recursion;

import java.util.Scanner;

public class Minimum_Number_of_Antennas_to_Cover_All_Houses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of houses
        int n = sc.nextInt();

        // Distances of houses from the origin
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Range of the antennas
        int k = sc.nextInt();

        int totalAntennas = 1; // Start with the first antenna
        int coverDistance = arr[0]; // Start covering from the first house
        int currentAntennaLocation = arr[0]; // Place the first antenna at the first house

        for (int i = 1; i < n; i++) { // Loop through each house starting from the second one
            // If the current house is within the coverage of the existing antenna
            if ( coverDistance + k >= arr[i] ) {
                currentAntennaLocation = arr[i]; // Update the current antenna's location
            }
            // If the current house is outside the coverage range
            else if ( currentAntennaLocation + k >= arr[i] ) {
                // No action needed as the current antenna covers it
            } else {
                totalAntennas++; // Place a new antenna
                coverDistance = arr[i]; // Update the starting coverage for this new antenna
                currentAntennaLocation = arr[i]; // Place the new antenna at the current house
            }
        }

        // Output the total number of antennas
        System.out.println(totalAntennas);

    }
}

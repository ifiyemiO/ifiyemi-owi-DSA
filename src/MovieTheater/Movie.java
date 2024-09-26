package MovieTheater;

import java.util.Scanner;

public class Movie {
    private final char[][] seats;

    // Constructor
    public Movie(int rows, int seatsPerRow) {
        seats = new char[rows][seatsPerRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                seats[i][j] = 'a';
            }
        }
    }

    // reserve seat
    public void reserveSeat(int row, int seat) {
        if (row >= 0 && row < seats.length && seat >= 0 && seat < seats[row].length) {
            if (seats[row][seat] == 'a') {
                seats[row][seat] = 'r';
                System.out.println("Seat reserved successfully!");
            } else {
                System.out.println("Seat is occupied.");
            }
        } else {
            System.out.println("Invalid seat number.");
        }
    }

    // cancel reservation
    public void cancelSeat(int row, int seat) {
        if (row >= 0 && row < seats.length && seat >= 0 && seat < seats[row].length) {
            if (seats[row][seat] == 'r') {
                seats[row][seat] = 'a';
                System.out.println("Seat reservation canceled.");
            } else {
                System.out.println("Seat is available.");
            }
        } else {
            System.out.println("Invalid seat number.");
        }
    }

    // print seating chart
    public void printSeatingChart() {
        System.out.println("Seating Chart:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie(3, 5);

        while (true) {
            System.out.println("\n1. Reserve a seat");
            System.out.println("2. Cancel a reservation");
            System.out.println("3. Retrieve seating chart");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:  // Reserve seat
                    System.out.print("Select row number (0-3): ");
                    int row = scanner.nextInt();
                    System.out.print("Select seat number (0-5): ");
                    int seat = scanner.nextInt();
                    movie.reserveSeat(row, seat);
                    break;
                case 2:  // Cancel reservation
                    System.out.print("Select row number (0-3): ");
                    row = scanner.nextInt();
                    System.out.print("Select seat number (0-5): ");
                    seat = scanner.nextInt();
                    movie.cancelSeat(row, seat);
                    break;
                case 3:  // View seating chart
                    movie.printSeatingChart();
                    break;
                case 4:  // New Reservation
                    System.out.println("Make a new Reservation");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

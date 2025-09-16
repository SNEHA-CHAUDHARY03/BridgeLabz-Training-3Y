class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket() {
        // Default constructor
    }

    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

// Example usage
class MovieTicketBooking {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Inception", 12, 250.0);
        ticket.displayTicket();
    }
}

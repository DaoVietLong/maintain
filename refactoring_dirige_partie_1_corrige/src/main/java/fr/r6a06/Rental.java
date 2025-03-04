package fr.r6a06;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        this._movie = movie;
        this._daysRented = daysRented;
    }

    public double getCharge() {
        return this.getMovie().getCharge(this.getDaysRented());
    }

    public int getFrequentRenterPoints() {
        return this.getMovie().getFrequentRenterPoints(this.getDaysRented());
    }

    public int getDaysRented() {
        return this._daysRented;
    }

    public Movie getMovie() {
        return this._movie;
    }
}

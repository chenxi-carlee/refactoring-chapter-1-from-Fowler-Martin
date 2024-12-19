package bad.robot.refactoring.chapter1;

public class Rental {

    private final Movie movie;
    private int daysRented;
    private Movie _movie;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
    public double getCharge(){
        return _movie.getCharge(daysRented);
    }
    public int getFrequentRenterPoints(){
        return _movie.getFrequentRenterPoints(daysRented);
    }

}

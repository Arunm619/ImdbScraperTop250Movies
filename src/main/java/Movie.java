public class Movie {
    String name;
    Double rating;
    static Integer movieCount = 0;

    public Movie(String name, Double rating) {
        this.name = name;
        this.rating = rating;
        movieCount++;
    }

    public void print(){
        System.out.println( movieCount + ". " + name + "  --  "+ rating.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}

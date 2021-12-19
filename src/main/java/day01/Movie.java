package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String titleOfFilm;
    private int yearOfIssue;
    private List<Actor> actors = new ArrayList<>();

    public List<Actor> getActors() {
        return actors;
    }

    public Movie(String titleOfFilm, int yearOfIssue) {
        this.titleOfFilm = titleOfFilm;
        this.yearOfIssue = yearOfIssue;
    }

    public String getTitleOfFilm() {
        return titleOfFilm;
    }

    public void setTitleOfFilm(String titleOfFilm) {
        this.titleOfFilm = titleOfFilm;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int numberOfTwentyOld = 0;
        for ( Actor actual : actors ) {
            int ageOfActor = yearOfIssue - actual.getYearOfBirth();
            //System.out.println(("Színész kora: "+actual.getName()+" "+ageOfActor));
            if (ageOfActor >= 20 && ageOfActor <30 ) {
                numberOfTwentyOld++;
            }
        }
        return numberOfTwentyOld;
    }
}

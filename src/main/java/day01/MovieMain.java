package day01;

public class MovieMain {
    public static void main(String[] args) {
        Actor robertRedford = new Actor("Robert Redford", 1945);
        Actor merylStreep = new Actor("Meryl Streep", 1955);
        Actor bradPitt = new Actor("Brad Pitt", 1961);
        Actor barbaraStreisand = new Actor("Barbara Streisand",1950);
        Actor dustinHoffmann = new Actor("Dustin Hoffmann",1944);

        Movie theWayWeWere = new Movie("Ilyenek voltunk", 1970);
        Movie kramerKontraKramer = new Movie("Kramer kontra Kramer", 1975);

        theWayWeWere.addActor(robertRedford);
        theWayWeWere.addActor(barbaraStreisand);

        kramerKontraKramer.addActor(merylStreep);
        kramerKontraKramer.addActor(dustinHoffmann);

        System.out.println("Kramer kontra Kramer - húszas éveiben jártak: "+kramerKontraKramer.actorsInTheirTwenties());

        System.out.println("Lista hossza - Kramer kontra kramer: " + kramerKontraKramer.getActors().size());
        System.out.println("Film készítése: "+kramerKontraKramer.getYearOfIssue()+" "+
                kramerKontraKramer.getActors().get(0).getName()+
                kramerKontraKramer.getActors().get(0).getYearOfBirth());

        System.out.println("Ilyenek voltunk - húszas éveiben jártak: "+theWayWeWere.actorsInTheirTwenties());

        System.out.println("Lista hossza - Ilyenek voltunk: " + theWayWeWere.getActors().size());
        System.out.println("Film készítése: "+theWayWeWere.getYearOfIssue()+" "+
                theWayWeWere.getActors().get(0).getName()+
                theWayWeWere.getActors().get(0).getYearOfBirth());
        System.out.println("Film készítése: "+theWayWeWere.getYearOfIssue()+" "+
                theWayWeWere.getActors().get(1).getName()+
                theWayWeWere.getActors().get(1).getYearOfBirth());
    }
}

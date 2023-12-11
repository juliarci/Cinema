import java.util.Date;
import java.util.Map;

public class Seance extends Cinema {

    private Film film;
    private Date date;
    private String horaire;
    private String jour;
    private Salle salle;
    private Map<Prix, Integer> placesOccupees;
    ;

    public String descriptifFilm(String titreFilm) {
        film = new Film(titreFilm);
        return film.toString();
    }

    public boolean estComplete() {
        int nb = 0;
        for (Integer i : placesOccupees.values()) nb += i;
        return nb >= salle.getNbrePlaces();
    }

    public boolean acheteUnePlace(Prix prix) {
        if (estComplete()) return false;
        placesOccupees.put(prix,placesOccupees.get(prix)+1);
        return true;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "film=" + film +
                ", date=" + date +
                ", horaire='" + horaire + '\'' +
                ", jour='" + jour + '\'' +
                ", salle=" + salle +
                ", placesOccupees=" + placesOccupees +
                '}';
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public Map<Prix, Integer> getPlacesOccupees() {
        return placesOccupees;
    }

    public void setPlacesOccupees(Map<Prix, Integer> placesOccupees) {
        this.placesOccupees = placesOccupees;
    }

}

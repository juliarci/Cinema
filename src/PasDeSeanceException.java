import java.util.Date;

public class PasDeSeanceException extends Exception {
    PasDeSeanceException(String titreFilm, Date date, int horaire){
        super("Il n'y a pas de séance correspondant à "+titreFilm+date+horaire);
    }
}

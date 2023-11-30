public class PasDeSeanceException extends Exception {
    PasDeSeanceException(String titreFilm, String jourHoraire){
        super("Il n'y a pas de séance correspondant à "+titreFilm+jourHoraire);
    }
}

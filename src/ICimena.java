import java.util.List;

public interface ICimena {
    public List<String> lesSeances();
    public String descriptifFilm(String titreFilm);
    public List<String> filmsALAffiche();
    public boolean achetePlace(String titreFilm, String jourHoraire, int tarif) throws PasDeSeanceException;
}

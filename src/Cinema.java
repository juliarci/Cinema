import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Cinema{
    private List<Seance> seanceList;
    private List<Film> filmList;

    public List<String> lesSeances(){
        List<String> descriptions = new ArrayList<>();
        for(Seance seance: seanceList){
            descriptions.add(seance.toString());
        }
        return descriptions;
    }
    public List<String> filmsALAffiche(){
        List<String> films = new ArrayList<>();
        for(Seance seance: seanceList){
            films.add(seance.getFilm().getTitre());
        }
        return films;
    }

    public boolean achetePlace(String titreFilm, Date date, int horaire, Prix prix) throws PasDeSeanceException {
        for (Seance s : seanceList){
            if ((s.getFilm().equals(titreFilm))
                    && (s.getDate()==date) && (s.getDate().getTime()==horaire))
                return s.acheteUnePlace(prix);
        }
        throw new PasDeSeanceException(titreFilm, date, horaire);
    }

    public void creerFilm(String titre){
        Film film = new Film(titre);
        filmList.add(film);
    }

    private void nouvelleSemaine(){
        Date date = dateAujourdhui();
        for(Seance seance: seanceList){
            if(seance.getDate().before(date)){
                seanceList.remove(seance);
            }
        }
    }
    private Date dateAujourdhui(){
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        Date dateObj = calendar.getTime();
        return dateObj;
    }
}

public class FilmCourt extends Film{
    public FilmCourt(String titre, int anneeReal) {
        super(titre);
        this.anneeReal=anneeReal;
    }

    @Override
    public String toString() {
        return "FilmCourt : " +super.toString()+
                "Nom du réalisateur ='" + nomReal + '\'' +
                ", Année de réalisation =" + anneeReal +
                '}';
    }
}

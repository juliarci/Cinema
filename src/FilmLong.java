public class FilmLong extends Film{
    public FilmLong(String titre, String nomReal, int anneeReal, String descriptif) {
        super(titre);
        this.nomReal=nomReal;
        this.anneeReal=anneeReal;
        this.descriptif=descriptif;
    }

    @Override
    public String toString() {
        return "FilmLong : " +super.toString()+
                "Nom du réalisateur ='" + nomReal + '\'' +
                ", Année de réalisation =" + anneeReal +
                ", Descriptif ='" + descriptif + '\'' +
                '}';
    }
}

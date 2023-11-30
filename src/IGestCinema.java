public interface IGestCinema {
    public void creerFIlm(String titreFilm, String descriptif, String realisateur, int annee);
    public int calculeChiffreAffaires();
    public void nouvelleSemaine();
    public float tauxRemplissage(String titreFilm);
}

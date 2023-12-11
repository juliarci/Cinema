public class Film {

    private String titre;
    protected String nomReal;
    protected int anneeReal;
    protected String descriptif;

    public Film(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                '}';
    }


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNomReal() {
        return nomReal;
    }

    public void setNomReal(String nomReal) {
        this.nomReal = nomReal;
    }

    public int getAnneeReal() {
        return anneeReal;
    }

    public void setAnneeReal(int anneeReal) {
        this.anneeReal = anneeReal;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }
}

public enum Prix {
    NORMAL(5), REDUIT(2), GRATUIT(0);
    private final int valeur;

    private Prix(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return this.valeur;
    }
}

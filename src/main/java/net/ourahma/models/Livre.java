package net.ourahma.models;

public class Livre {
    private String titre;
    private String auteur;
    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    @Override
    public String toString() {
        return "Livre est => " +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'';
    }

}

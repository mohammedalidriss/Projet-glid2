package com.example.turki.animo;

/**
 * Created by turki on 24/04/2016.
 */
public class Animal {
    private int id;
    private String nom;
    private String description;
    private int taille;
    private String nourriture;
    private int poids;
    private String image;
    private String video;
    private String type;

    public Animal(int id, String nom, int taille, String description, String nourriture, int poids, String image, String video, String type) {
        this.id = id;
        this.nom = nom;
        this.taille = taille;
        this.description = description;
        this.nourriture = nourriture;
        this.poids = poids;
        this.image = image;
        this.video = video;
        this.type = type;
    }
public Animal(){}
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public int getTaille() {
        return taille;
    }

    public String getNourriture() {
        return nourriture;
    }

    public int getPoids() {
        return poids;
    }

    public String getImage() {
        return image;
    }

    public String getVideo() {
        return video;
    }

    public String getType() {
        return type;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNourriture(String nourriture) {
        this.nourriture = nourriture;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public void setType(String type) {
        this.type = type;
    }
}

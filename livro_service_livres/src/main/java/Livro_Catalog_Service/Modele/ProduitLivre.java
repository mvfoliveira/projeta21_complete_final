package Livro_Catalog_Service.Modele;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="produitlivre")
public class ProduitLivre {

    @Id
    @Column(name="Code")
    private int code;

    @Column(name="Titre")
    private String titre;

    @Column(name="Description")
    private String description;

    @Column(name="Auteur")
    private String auteur;

    @Column(name="Date_edition")
    private LocalDate dateEdition;

    @Column(name="Maison_edition")
    private String maisonEdition;

    @Column(name="Categorie")
    private String categorie;


    @Column(name="Numero_commande")
    private int numeroCommande;

    @Column(name="image")
    private String image;

    @Column(name="Promotion")
    private String promotion;

    @JsonManagedReference
    @OneToOne(mappedBy = "livre", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private prixquantite prixQuantite;

    public ProduitLivre() {
    }

    public ProduitLivre(int code, String titre, String description, String auteur, LocalDate dateEdition, String maisonEdition, String categorie, int numeroCommande, String image, String promotion, prixquantite prixQuantite) {
        this.code = code;
        this.titre = titre;
        this.description = description;
        this.auteur = auteur;
        this.dateEdition = dateEdition;
        this.maisonEdition = maisonEdition;
        this.categorie = categorie;
        this.numeroCommande = numeroCommande;
        this.image = image;
        this.promotion = promotion;
        this.prixQuantite = prixQuantite;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public LocalDate getDateEdition() {
        return dateEdition;
    }

    public void setDateEdition(LocalDate dateEdition) {
        this.dateEdition = dateEdition;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        this.maisonEdition = maisonEdition;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public prixquantite getPrixQuantite() {
        return prixQuantite;
    }

    public void setPrixQuantite(prixquantite prixQuantite) {
        this.prixQuantite = prixQuantite;
    }

    @Override
    public String toString() {
        return "ProduitLivre{" +
                "code=" + code +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", auteur='" + auteur + '\'' +
                ", dateEdition=" + dateEdition +
                ", maisonEdition='" + maisonEdition + '\'' +
                ", categorie='" + categorie + '\'' +
                ", numeroCommande=" + numeroCommande +
                ", image='" + image + '\'' +
                ", promotion='" + promotion + '\'' +
                ", prixQuantite=" + prixQuantite +
                '}';
    }
}

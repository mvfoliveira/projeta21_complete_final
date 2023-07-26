package Livro_Catalog_Service.Modele;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "prixquantite")
public class prixquantite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double prix;

    @Column(nullable = false)
    private Integer quantite;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "code")
    private ProduitLivre livre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public ProduitLivre getLivre() {
        return livre;
    }

    public void setLivre(ProduitLivre livre) {
        this.livre = livre;
    }

    @Override
    public String toString() {
        return "prixquantite{" +
                "id=" + id +
                ", prix=" + prix +
                ", quantite=" + quantite +
                '}';
    }
}

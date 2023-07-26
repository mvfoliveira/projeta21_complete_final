package Livro_Catalog_Service.Repository;


import Livro_Catalog_Service.Modele.ProduitLivre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitLivreRepo extends JpaRepository<ProduitLivre, Integer> {


}

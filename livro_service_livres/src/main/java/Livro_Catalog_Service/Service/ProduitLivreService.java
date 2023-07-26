package Livro_Catalog_Service.Service;

import Livro_Catalog_Service.Modele.ProduitLivre;
import Livro_Catalog_Service.Repository.ProduitLivreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitLivreService {
    @Autowired
    private ProduitLivreRepo produitLivreRepo;

    public List<ProduitLivre> listAllProduitLivre() {
        return produitLivreRepo.findAll();
    }

    public Optional<ProduitLivre> listLivreById(int id) { return produitLivreRepo.findById(id);
    }
}

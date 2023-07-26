package Livro_Catalog_Service.Controller;


import Livro_Catalog_Service.Modele.ProduitLivre;
import Livro_Catalog_Service.Repository.ProduitLivreRepo;
import Livro_Catalog_Service.Service.ProduitLivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins = "*")
@RestController
public class ProduitLivreController  {
    @Autowired
    private final ProduitLivreRepo produitLivreRepo;
    @Autowired
    private final ProduitLivreService produitLivreService;


    public ProduitLivreController(ProduitLivreRepo produitLivreRepo, ProduitLivreService produitLivreService) {
        this.produitLivreRepo = produitLivreRepo;
        this.produitLivreService = produitLivreService;
    }

    //PagePrincipale
    @GetMapping("/")
    public List<ProduitLivre> pageInitial() {
//        System.out.println(produitLivreService.listAllProduitLivre());
        return produitLivreService.listAllProduitLivre();
    }

    //PagePrincipale
    @GetMapping("/livres/livreById/{id}")
    public Optional<ProduitLivre> livreById(@PathVariable int id)
    {
        return produitLivreService.listLivreById(id);

    }


}

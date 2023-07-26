package User_Service.Controller;

import User_Service.Modele.Utilisateur;
import User_Service.Repository.UtilisateurRepo;
import User_Service.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.List;

//@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})
@RestController
public class UtilisateurController {
    @Autowired
    private final UtilisateurRepo utilisateurRepo;
    @Autowired
    private final UtilisateurService utilisateurService;


    public UtilisateurController(UtilisateurRepo utilisateurRepo, UtilisateurService utilisateurService) {
        this.utilisateurRepo = utilisateurRepo;
        this.utilisateurService = utilisateurService;
    }

    //PagePrincipale
    @GetMapping("/utilisateurs")
    public List<Utilisateur> pageInitial() {
        return utilisateurService.listAllUtilisateur();
    }

    @PostMapping("/utilisateurs/ajouterutilisateur")
    public ResponseEntity<?> ajouterUtilisateur(@RequestBody Utilisateur utilisateur) {
        Utilisateur utilisateurExistente = utilisateurService.findByEmail(utilisateur.getEmail());
        if (utilisateurExistente != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.TEXT_PLAIN).body("E-mail deja utilise.");
        }
        if (utilisateur.getNom() == null || utilisateur.getNom().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.TEXT_PLAIN).body("Le champ Nom est obligatoire.");
        }
        if (utilisateur.getPrenom() == null || utilisateur.getPrenom().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.TEXT_PLAIN).body("Le champ PreNom est obligatoire.");
        }
        if (utilisateur.getEmail() == null || utilisateur.getEmail().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.TEXT_PLAIN).body("Le champ Email est obligatoire.");
        }
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(utilisateur.getEmail());

        if (!matcher.matches()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.TEXT_PLAIN).body("L'email n'attend pas aus requisites, email@email.com");
        }
        if (utilisateur.getMotdepasse() == null || utilisateur.getMotdepasse().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.TEXT_PLAIN).body("Le champ motdepasse est obligatoire.");
        }
        Utilisateur nouveauUtilisateur = utilisateurService.ajouterUtilisateur(utilisateur);
        return new ResponseEntity<>(nouveauUtilisateur, HttpStatus.CREATED);
    }

}
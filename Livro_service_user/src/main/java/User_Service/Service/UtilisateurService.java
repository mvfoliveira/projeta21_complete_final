package User_Service.Service;

import User_Service.Modele.Utilisateur;
import User_Service.Repository.UtilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepo utilisateurRepo;

    public List<Utilisateur> listAllUtilisateur() {
        return utilisateurRepo.findAll();
    }

    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepo.save(utilisateur);
    }

    public Utilisateur findByEmail(String email) {
        return utilisateurRepo.findByEmail(email);
    }

    public Utilisateur loginUtilisateur(String email, String motdepasse) {
        if (email == null || email.isEmpty() || motdepasse == null || motdepasse.isEmpty()) {
            throw new IllegalArgumentException("L'email et le mot de passe doivent être fournis.");

        }

        Utilisateur utilisateur = utilisateurRepo.findByEmail(email);

        if (utilisateur == null) {
            System.out.println("email vazio");
            throw new IllegalArgumentException("Utilisateur non trouvé.");
        }

        if (!utilisateur.getMotdepasse().equals(motdepasse)) {
            throw new IllegalArgumentException("Mot de passe incorrect.");
        }
        return utilisateur;

    }
}

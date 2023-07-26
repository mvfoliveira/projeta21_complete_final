package User_Service.Repository;

import User_Service.Modele.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Integer> {
    Utilisateur findByEmail(String email);
}

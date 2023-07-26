
package User_Service.Controller;

import User_Service.Modele.Utilisateur;
import User_Service.Service.UtilisateurService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping("/utilisateurs/login")
    public ResponseEntity<?> fazerLogin(@RequestBody Utilisateur utilisateur, HttpServletResponse response) {
        try {
            Utilisateur utilisateurLogedin = utilisateurService.loginUtilisateur(utilisateur.getEmail(), utilisateur.getMotdepasse());
            String nomutilisateur = utilisateurLogedin.getPrenom();
            Cookie utilisateurCookie = new Cookie("utilisateur", nomutilisateur);
            utilisateurCookie.setMaxAge(24 * 60 * 60);
            response.addCookie(utilisateurCookie);

            return ResponseEntity.ok(utilisateurLogedin);
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .contentType(MediaType.TEXT_PLAIN)
                    .body(ex.getMessage());
        }
    }
}

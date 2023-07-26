import { Utilisateur } from './utilisateur';

describe('Utilisateur', () => {
  it('should create an instance', () => {
    const utilisateur = new Utilisateur(
      'Cliente', // profil
      'Fulano', // nom
      'Silva', // prenom
      'Rua A, 123', // adresse
      '123456789', // telefone
      'fulano@example.com', // email
      'Mot de passe', // motdepasse
      'Statut' // infobancaire
    );

    expect(utilisateur).toBeTruthy();
  });
});

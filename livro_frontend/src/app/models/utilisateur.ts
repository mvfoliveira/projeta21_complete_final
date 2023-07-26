export class Utilisateur {
    profil: string = 'client';
    nom: string;
    prenom: string;
    adresse: string;
    telephone: string;
    email: string;
    motdepasse: string;
    statut: string = 'actif';
  
    constructor(
      profil: string = 'client',
      nom: string,
      prenom: string,
      adresse: string,
      telephone: string,
      email: string, 
      motdepasse: string,
      statut: string = 'actif'

    ) {
      this.profil = profil;
      this.nom = nom;
      this.prenom = prenom;
      this.adresse = adresse;
      this.telephone = telephone;
      this.email = email;
      this.motdepasse = motdepasse;
      this.statut = statut;
    }
  }
  
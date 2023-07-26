import { PrixQuantite } from '../models/prixquantite';
export class Livres {
    code: number;
    titre: string;
    description: string;
    auteur: string;
    dateEdition: Date;
    maisonEdition: string;
    categorie: string;
    numeroCommande: number;
    image: string;
    promotion: string;
    prixQuantite: PrixQuantite;
  
    constructor(
      code: number,
      titre: string,
      description: string,
      auteur: string,
      dateEdition: Date,
      maisonEdition: string,
      categorie: string,
      numeroCommande: number,
      image: string,
      promotion: string,
      prixQuantite: PrixQuantite
    ) {
      this.code = code;
      this.titre = titre;
      this.description = description;
      this.auteur = auteur;
      this.dateEdition = dateEdition;
      this.maisonEdition = maisonEdition;
      this.categorie = categorie;
      this.numeroCommande = numeroCommande;
      this.image = image;
      this.promotion = promotion;
      this.prixQuantite = prixQuantite;
    }
  }
  
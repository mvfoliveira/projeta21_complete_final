import { Livres } from "./livres";

export class PrixQuantite {
    code: number;
    prix: number;
    quantite: number;
    livre: Livres;

    
    constructor(
        code: number,
        prix: number,
        quantite: number,
        livre: Livres,
      ) {
        this.code = code;
        this.prix = prix;
        this.quantite = quantite;
        this.livre = livre;
      }
  }
  
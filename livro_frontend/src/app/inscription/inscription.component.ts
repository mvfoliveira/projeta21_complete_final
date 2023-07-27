import { Component } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-inscription',
  templateUrl: './inscription.component.html',
  styleUrls: ['./inscription.component.css']
})
export class InscriptionComponent {
  utilisateur: any = {};
  msg: string = '';

  constructor(private http: HttpClient) {
  }

  creerCompte() {
    const url = 'http://localhost:8080/utilisateurs/ajouterutilisateur';
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });

    this.http.post(url, this.utilisateur, { headers, responseType: 'text' }).subscribe(
      (response) => {
        console.log('Compte crée avec succes:', response);
        this.msg = 'Compte crée avec succes!';
        this.effacerForm();
      },
      (error: HttpErrorResponse) => {
        console.error('Erreur:', error);
        this.msg = 'Erreur: ' + error.error;
      }
    );
  }
  effacerForm() {
    this.utilisateur = {};
    this.msg = 'Compte crée avec succes';
  }
  onSubmit() {
    const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;


    if (emailPattern.test(this.utilisateur.email)) {
      this.utilisateur.profil = 'client';
      this.utilisateur.statut = 'actif';
      this.creerCompte();
      console.log(this.utilisateur);
    }
    else if (!emailPattern.test(this.utilisateur.email)) {
      this.msg = "Veuillez remplir les informations correctement ";
    }

  }
}


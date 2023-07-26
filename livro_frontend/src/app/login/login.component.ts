import { Component } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  utilisateur: any = {};
  msg: string = '';

  constructor(private http: HttpClient) {}

  faireLogin() {
    const url = 'http://localhost:8080/utilisateurs/login'; //  endpoint backend pour login
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });

    this.http.post(url, this.utilisateur, { headers, responseType: 'text' }).subscribe(
      (response) => {
        console.log(this.utilisateur);
        console.log('Login avec succés:', response);
        this.msg = 'Login avec succés!';
      },
      (error: HttpErrorResponse) => {
        console.error('Erreur:', error);
        this.msg = 'Erreur: ' + error.error;
      }
    );
  }

  onSubmit() {
    const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;

    this.faireLogin();
  }

}

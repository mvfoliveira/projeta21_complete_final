import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { LivresComponent } from './components/livres/livres.component';
import { InscriptionComponent } from './inscription/inscription.component';
import { LivredetailsComponent } from './livredetails/livredetails.component';
import { CartComponent } from './cart/cart.component';


const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'livres', component: LivresComponent },
  { path: 'inscription', component: InscriptionComponent },
  { path: 'livredetails/:code', component: LivredetailsComponent },
  { path: 'cart', component: CartComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

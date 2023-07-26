import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { LivresService } from '../services/livres.service';
import { Livres } from '../models/livres';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-livredetails',
  templateUrl: './livredetails.component.html',
  styleUrls: ['./livredetails.component.css']
})
export class LivredetailsComponent implements OnInit {
  livre!: Livres;

  constructor(
    private route: ActivatedRoute,
    private livresService: LivresService,
    private cartService: CartService
  ) { }

  ngOnInit(): void {
    // Get the book code from the route URL
    const code = Number(this.route.snapshot.paramMap.get('code'));
    
    // Use the LivresService to get the book details
    this.livresService.getLivresById(code).subscribe(livre => {
      this.livre = livre;
    });
  }
  
  addToCart(): void {
    this.cartService.addToCart(this.livre); 
    console.log('Livro adicionado ao carrinho:', this.livre); 


  }
}

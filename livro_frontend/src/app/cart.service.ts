import { Injectable } from '@angular/core';
import { Livres } from './models/livres';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  private items: Livres[] = [];

  constructor() { }
  addToCart(livre: Livres): void {
    this.items.push(livre);
}
removeFromCart(livre: Livres): void {
  const index = this.items.findIndex(item => item.code === livre.code);
  if (index !== -1) {
    this.items.splice(index, 1);
  }
}
getItems(): Livres[] {
  return this.items;
}
clearCart(): void {
  this.items = [];
}

// Calcular o total do carrinho
getTotal(): number {
 return this.items.reduce((total, livre) => total + livre.prixQuantite.prix, 0);
}
}

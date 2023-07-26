import { Component, OnInit} from '@angular/core';
import { CartService } from '../cart.service';
import { Livres } from '../models/livres';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  cartItems: Livres[] = [];
  cartTotal: number = 0;

  constructor(private cartService: CartService) { }

  ngOnInit() {
    this.cartItems = this.cartService.getItems();
    this.cartTotal = this.cartService.getTotal();
  }

  removeFromCart(livre: Livres): void {
    this.cartService.removeFromCart(livre);
    this.cartItems = this.cartService.getItems();
    this.cartTotal = this.cartService.getTotal();
  }

  clearCart(): void {
    this.cartService.clearCart();
    this.cartItems = [];
    this.cartTotal = 0;
  }
}

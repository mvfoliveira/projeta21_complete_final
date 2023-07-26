import { Component, OnInit } from '@angular/core';
import { LivresService } from '../../services/livres.service';
import { Livres } from '../../models/livres';

@Component({
  selector: 'app-livres-component',
  templateUrl: './livres.component.html',
  styleUrls: ['./livres.component.css']
})
export class LivresComponent implements OnInit {

  livres: Livres[] = [];

  constructor(private livresService: LivresService) { }

  ngOnInit(): void {
    this.livresService.getLivres().subscribe(livres => {
      this.livres = livres;
    });
  }
}

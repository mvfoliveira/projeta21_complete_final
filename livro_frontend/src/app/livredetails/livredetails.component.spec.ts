import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LivredetailsComponent } from './livredetails.component';

describe('LivredetailsComponent', () => {
  let component: LivredetailsComponent;
  let fixture: ComponentFixture<LivredetailsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LivredetailsComponent]
    });
    fixture = TestBed.createComponent(LivredetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

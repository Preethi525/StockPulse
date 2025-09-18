import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Stockhistory } from './stockhistory';

describe('Stockhistory', () => {
  let component: Stockhistory;
  let fixture: ComponentFixture<Stockhistory>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Stockhistory]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Stockhistory);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Stockinfo } from './stockinfo';

describe('Stockinfo', () => {
  let component: Stockinfo;
  let fixture: ComponentFixture<Stockinfo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Stockinfo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Stockinfo);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

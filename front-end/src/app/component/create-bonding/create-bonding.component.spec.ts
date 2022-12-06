import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateBondingComponent } from './create-bonding.component';

describe('CreateBondingComponent', () => {
  let component: CreateBondingComponent;
  let fixture: ComponentFixture<CreateBondingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateBondingComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateBondingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

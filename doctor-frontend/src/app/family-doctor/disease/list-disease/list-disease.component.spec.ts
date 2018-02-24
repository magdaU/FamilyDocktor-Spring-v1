import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListDiseaseComponent } from './list-disease.component';

describe('ListDiseaseComponent', () => {
  let component: ListDiseaseComponent;
  let fixture: ComponentFixture<ListDiseaseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListDiseaseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListDiseaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

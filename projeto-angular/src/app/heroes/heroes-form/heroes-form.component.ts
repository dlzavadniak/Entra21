import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges, ɵɵngDeclareClassMetadata } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Hero } from '../heroes-screen/heroes-screen.component';

@Component({
  selector: 'app-heroes-form',
  templateUrl: './heroes-form.component.html',
  styleUrls: ['./heroes-form.component.css']
})
export class HeroesFormComponent implements OnChanges {

  @Input() editingHero?: Hero | null | undefined;
  @Output() insertChange = new EventEmitter<boolean>();
  @Output() heroSave = new EventEmitter<Hero>();

  ngOnChenages(changes: SimpleChanges): void {
    this.heroForm.patchValue(changes["editingHero"].currentValue);
  }

  heroForm = this.fb.group({
    id: [null],
    name: ['', Validators.required],
    secretIdentity: [''],
    deceased: [false],
    universe: ['', Validators.required]


  });

  cancel = () => {
    this.insertChange.emit(false);
  }

  onSubmit = () => {
    this.heroSave.emit(this.heroForm.value as Hero);
    this.heroForm.reset();
    this.cancel();
  }

  constructor(private fb: FormBuilder){}
  ngOnChanges(changes: SimpleChanges): void {
    throw new Error('Method not implemented.');
  }

}

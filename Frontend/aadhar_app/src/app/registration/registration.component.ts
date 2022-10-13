import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { kMaxLength } from 'buffer';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  signupForm: FormGroup;

  constructor(private router: Router) { }

  ngOnInit(): void {
    this.signupForm = new FormGroup({
      phone_num: new FormControl(null, [Validators.required,Validators.pattern("^((\\+91-?)|0)?[0-9]{10}$")]),
      password: new FormControl(null, [Validators.required,]),
    });
  }

  onSubmit() {
    console.log(this.signupForm.value);

    this.router.navigate(['/']);
  }


}

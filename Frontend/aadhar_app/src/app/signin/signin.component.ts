import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {

  signupForm: FormGroup;

  constructor(private router: Router) { }

  ngOnInit(): void {
    this.signupForm = new FormGroup({
      phone_num: new FormControl(null, [Validators.required,Validators.pattern("^((\\+91-?)|0)?[0-9]{10}$")]),
      password: new FormControl(null, [Validators.required]),
    });
  }

  onSubmit() {
    console.log(this.signupForm.value);

    this.router.navigate(['/dashboard']);
  }

}

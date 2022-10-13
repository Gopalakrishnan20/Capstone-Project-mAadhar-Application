import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Admin } from '../services/admin';
import {AdminServiceService} from '../services/admin-service.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  signupForm: FormGroup;
  admin:Admin=new Admin();

  constructor(private adminServ:AdminServiceService, private router: Router,private fb: FormBuilder) { }

  ngOnInit(): void {
    this.signupForm = this.fb.group({
      uName: 'admin',
      pass: 'Qwerty@098!'
    });
  }

  onSubmit() {
    if(this.signupForm.value.uName=="admin" && this.signupForm.value.pass=="Qwerty@098!"){
      this.router.navigate(['/admindashboard']);
    }
    else{
      alert("Invalid credentials");
    }
  }

}

import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
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

  constructor(private adminServ:AdminServiceService, private router: Router) { }

  ngOnInit(): void {
  }

  onSubmit() {
    this.router.navigate(['/admindashboard']);
  }

}

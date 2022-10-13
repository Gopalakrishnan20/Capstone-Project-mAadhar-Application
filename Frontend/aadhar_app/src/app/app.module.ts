import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { SigninComponent } from './signin/signin.component';
import { RegistrationComponent } from './registration/registration.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UpdateaadharComponent } from './updateaadhar/updateaadhar.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';

const appRoutes: Routes = [
  {path: '', component:SigninComponent},
  {path: 'signup', component:RegistrationComponent},
  {path: 'dashboard', component:DashboardComponent},
  {path: 'updateaadhar', component:UpdateaadharComponent},
  {path: 'adminsignin', component:AdminloginComponent},
  {path: 'admindashboard', component:AdmindashboardComponent},
];

@NgModule({
  declarations: [
    AppComponent,
    SigninComponent,
    RegistrationComponent,
    DashboardComponent,
    UpdateaadharComponent,
    AdminloginComponent,
    AdmindashboardComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(appRoutes),
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

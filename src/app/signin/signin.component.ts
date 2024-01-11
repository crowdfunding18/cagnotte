import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute, Router } from '@angular/router';
import { ServiceService } from '../service.service';
@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent {
  UtilisateurArray : any[] = [];
  isResultLoaded = false;
  isUpdateFormActive = false;
 
  public utilisateur={
    email:"",
    password : "",
    remember :"",
    
  }
  public idUtilisateur! :number;
constructor(private serviceService :ServiceService,private router:Router,private route :ActivatedRoute)
 {
 
  }
  save(){
    this.serviceService.saveUtilisateur(this.utilisateur).subscribe((result) => {
     
  },err=>{
    
  });
  }
}
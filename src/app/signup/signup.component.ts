import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute, Router } from '@angular/router';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
  UtilisateurArray : any[] = [];
  isResultLoaded = false;
  isUpdateFormActive = false;
 
  public utilisateur={
    cin: "",
    nom: "",
    prenom: "",
    email: "",
    adresse: "",
    telephone: "",
    password: "",
    confirmermot_de_passe: "",
    type_de_utilisateur: "",
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
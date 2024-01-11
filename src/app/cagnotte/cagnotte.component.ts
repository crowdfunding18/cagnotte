// cagnotte.component.ts

import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute, Router } from '@angular/router';
import { ServiceService } from '../service.service';
@Component({
  selector: 'app-cagnotte',
  templateUrl: './cagnotte.component.html',
  styleUrls: ['./cagnotte.component.css']
})
export class CagnotteComponent {
  CagnotteArray : any[] = [];
  isResultLoaded = false;
  isUpdateFormActive = false;
 
  public cagnotte={
    titre:"",
    description : "",
    prix: "",
    telephone: "",
    categorie: "",
    image: "",
   
  }
  public idProject! :number;
constructor(private serviceService :ServiceService,private router:Router,private route :ActivatedRoute)
 {
 
  }
  save(){
    this.serviceService.saveCagnotte(this.cagnotte).subscribe((result) => {
     
  },err=>{
    
  });
  }
}
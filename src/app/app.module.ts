import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { SigninComponent } from './signin/signin.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { AboutComponent } from './about/about.component';
import { SignupComponent } from './signup/signup.component';
import { CagnotteComponent } from './cagnotte/cagnotte.component';
import { CategoriesComponent } from './categories/categories.component';
import { ProfileComponent } from './profile/profile.component';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { ResetpasswordComponent } from './resetpassword/resetpassword.component';
import { CommentComponent } from './comment/comment.component';
import { PaiementComponent } from './paiement/paiement.component';
import { UpdateprofileComponent } from './updateprofile/updateprofile.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    SigninComponent,
    HeaderComponent,
    FooterComponent,
    AboutComponent,
    SignupComponent,
    CagnotteComponent,
    CategoriesComponent,
    ProfileComponent,
    ResetpasswordComponent,
    CommentComponent,
    PaiementComponent,
    UpdateprofileComponent,
    
  
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

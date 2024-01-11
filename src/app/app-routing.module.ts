import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { SigninComponent } from './signin/signin.component';
import { FooterComponent } from './footer/footer.component';
import { AboutComponent } from './about/about.component';
import { SignupComponent } from './signup/signup.component';
import { CategoriesComponent } from './categories/categories.component';
import { ProfileComponent } from './profile/profile.component';
import { CagnotteComponent } from './cagnotte/cagnotte.component';
import { ResetpasswordComponent } from './resetpassword/resetpassword.component';
import { CommentComponent } from './comment/comment.component';
import { PaiementComponent } from './paiement/paiement.component';
import { UpdateprofileComponent } from './updateprofile/updateprofile.component';



const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
  },
  {
    path: 'header',
    component: HeaderComponent,
   },
  {
    path: 'signin',
    component: SigninComponent,
   },
   
   {
    path: 'footer',
    component: FooterComponent,
   },
   {
    path: 'about',
    component: AboutComponent,
   },
   {
    path: 'signup',
    component: SignupComponent,
   },
   {
    path: 'categories',
    component: CategoriesComponent,
   },
   {
    path: 'profile',
    component: ProfileComponent,
   },
   {
    path: 'cagnotte',
    component: CagnotteComponent,
   },
   {
    path: 'restpassword',
    component: ResetpasswordComponent,
   },
   {
    path: 'comment',
    component: CommentComponent,
   },
   {
    path: 'paiement',
    component: PaiementComponent,
   },
   {
    path: 'updateprofile',
    component: UpdateprofileComponent,
   },
  { path: 'admin', loadChildren: () => import('./admin/admin.module').then(m => m.AdminModule) },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

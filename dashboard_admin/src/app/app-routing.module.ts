import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { SiderbarComponent } from './siderbar/siderbar.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ProjetsComponent } from './projets/projets.component';
import { UsersComponent } from './users/users.component';
import { ProfileComponent } from './profile/profile.component';
import { NotificationComponent } from './notification/notification.component';
import { SigninComponent } from './signin/signin.component';




const routes: Routes = [

  {
    path: '',
    component: HomeComponent,
  },
  {
    path: 'siderbar',
    component: SiderbarComponent,
   },
  {
    path: 'navbar',
    component: NavbarComponent,
    },
  {
    path: 'projets',
    component: ProjetsComponent,
  },

  {
  path: 'users',
  component: UsersComponent,
  },

  {
    path: 'profile',
    component: ProfileComponent,
  },
  {
    path: 'notification',
    component: NotificationComponent,
  },
  {
    path: 'signin',
    component: SigninComponent,
  },
 

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin.component';
import { HomeComponent } from './home/home.component';
import { SiderbarComponent } from './siderbar/siderbar.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ProjetsComponent } from './projets/projets.component';
import { UsersComponent } from './users/users.component';
import { NotificationComponent } from './notification/notification.component';

const routes: Routes = [
  { path: '',
   component: AdminComponent ,
  children: [
    {
      path: 'home',
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
      path: 'notification',
      component: NotificationComponent,
    },
  
  ],
},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }

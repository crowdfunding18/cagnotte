import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { AdminComponent } from './admin.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SiderbarComponent } from './siderbar/siderbar.component';
import { ProjetsComponent } from './projets/projets.component';
import { UsersComponent } from './users/users.component';
import { NotificationComponent } from './notification/notification.component';


@NgModule({
  declarations: [
    AdminComponent,
    HomeComponent,
    NavbarComponent,
    SiderbarComponent,
    ProjetsComponent,
    UsersComponent,
    NotificationComponent
  ],
  imports: [
    CommonModule,
    AdminRoutingModule
  ]
})
export class AdminModule { }

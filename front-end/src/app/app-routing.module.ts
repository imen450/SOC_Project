import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddproductComponent } from './components/addproduct/addproduct.component';
import { DashbordAdminComponent } from './components/dashbord-admin/dashbord-admin.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { SignComponent } from './components/sign/sign.component';



const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'sign',component:SignComponent},
  {path:'login',component:LoginComponent},
  {path:'dashbordAdmin',component:DashbordAdminComponent},
  {path:'addProduct',component:AddproductComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

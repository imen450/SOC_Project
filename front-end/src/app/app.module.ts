import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HeaderComponent } from './components/header/header.component';
import { PortfolioSectionComponent } from './components/portfolio-section/portfolio-section.component';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { SignComponent } from './components/sign/sign.component';
import { LoginComponent } from './components/login/login.component';
import { DashbordAdminComponent } from './components/dashbord-admin/dashbord-admin.component';
import { AddproductComponent } from './components/addproduct/addproduct.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HeaderComponent,
    PortfolioSectionComponent,
    AboutComponent,
    ContactComponent,
    FooterComponent,
    HomeComponent,
    SignComponent,
    LoginComponent,
    DashbordAdminComponent,
    AddproductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

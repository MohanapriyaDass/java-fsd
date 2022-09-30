import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { FormsModule } from '@angular/forms';
import { TranspipePipe } from './transpipe.pipe';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';

import { RouterModule,Routes } from '@angular/router';


const routes: Routes = [
  {path:'about',component:AboutComponent},
  {path:'contact',component:ContactComponent}
  ];
  

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    TranspipePipe,
    AboutComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

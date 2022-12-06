import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BondingComponent } from './page/bonding/bonding.component';
import { CreateBondingComponent } from './component/create-bonding/create-bonding.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    BondingComponent,
    CreateBondingComponent
  ],
  imports: [
    BrowserModule,AppRoutingModule,FormsModule,ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

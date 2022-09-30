import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angdemo';
  
  newcolor:string="blue";
  updatecolor(e:any){
  this.newcolor=e.target.value;
  }

name1="degi";
updatename1(){
  this.name1="Delhi";
  }

 value="namaste"
salary=50000;
date=new Date();
mobileseries=[
  {
  "id":1,
  "name":"realme"
  },
  {
    "id":2,
    "name":"Oneplus"
  
  }
  ]

wish="GOOD MORNING";

greet="Have a nice day";
person=
  {
"name":"kalvi",
"gender":"Female"
  }

}




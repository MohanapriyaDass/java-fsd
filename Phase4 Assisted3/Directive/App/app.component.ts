import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'directives';

  show=true;

  show1=false;
  value="hi";

  show2=true;
  value1="call me";
  cval="omg";

  mobiles=["samsung","nokia"]

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

op:string="+";
num1:number=3;
num2:number=3;

}

import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'binding';

  value:string="hi Resh"
 path:string="../assets/dhoni.jpg"
 cprop:string="special"

 isdisabled:boolean=false;
 ishidden:boolean=false;

 applyc1:boolean=true;

 cval:string="blue";
 hasError:boolean=true;

 counter:number=0;
incr(){
  this.counter+=1;
}
decr(){
  this.counter-=1;
}

name:string="default";
updatename(e:any){
this.name=e.target.value;
}

name1:string="default";
updatename1(){
this.name1="Delhi";
}

}

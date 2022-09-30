import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'transpipe'
})
export class TranspipePipe implements PipeTransform {

  // transform(wish: string,param1: string,param2:number): string{
  //   if(param1=="lower"){
  //     wish=wish.toLowerCase();
  //   }
  //   return wish.substring(0,param2);
  // }

  transform(person: any,greet: string):string{
    if(person.gender=="male"){
      return "Hello Mr "+ person.name+" "+greet;
        }
        else{
         return "Hello Miss "+ person.name+" "+greet;
        }
        
  }
}

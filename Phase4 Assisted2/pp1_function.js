function calculateAge(name,year,phno){
this.name=name;
this.year=year;
this.phno=phno;
}
calculateAge.prototype.findAge=function(){
    console.log("The current age is "+(2022-this.year));
}
console.log(calculateAge.prototype);

let age=new calculateAge("kalviyarasi",2001,123456789);
console.log(age);
age.findAge();

let age1=new calculateAge("Sowmiya",2001,1234512345);
console.log(age1);
age1.findAge();
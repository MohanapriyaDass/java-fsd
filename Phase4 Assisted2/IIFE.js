const iife=(function(){
let c=0;
return function(){
    ++c;
    return `emp${c}`;
};
})();
console.log("Employee Id:");
console.log("kalvi="+iife());
console.log("sow="+iife());
console.log("savi="+iife());

//callback
console.log("\n");
function myName(fname,lname,callback){
    console.log(`My name is ${fname} ${lname}`);
    callback(fname);
}
var greet=function(l){
    console.log(`welcome ${l}`);
}
myName("Kalvi","M",greet);
console.log("\n");
myName("Degi","R",greet);
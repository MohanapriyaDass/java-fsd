function checkfn(){
    
    var sid1=document.f1.sid.value;
    var sofsid="",semp="";
    if(sid1==""){
        semp="student id cannot be empty"
     }
    else if(sid1.length<=8){
        sofsid="student id must be minimum of 8 character"
    }
    
    var name1=document.f1.name.value;
    var sofname1="",sofname2="",sname="";
    if(name1==""){
        sname="name should not be empty"
    }
    else if(name1.length<=8){
        sofname1="name must be minimum of 8 charcters"
    }
    else if(name1.length>16){
        sofname2="name should not exceeed 16 characters"
    }


    var pwd1=document.f1.pwd.value;
    var sofpwd="",spwd="";
    sr=pwd1.search("@")
    if(pwd1==""){
        spwd="password cannot be empty"
    }
    else if(sr<0){
        sofpwd="password must contain atleast one @ symbol"
    }
     
   
    
    var gen="";
    if((document.getElementById("male").checked==false)&& (document.getElementById("female").checked==false)){
        gen="please select gender"
    }
    
    
    var sport="";
    if((document.getElementById('cricket').checked==false) && (document.getElementById('football').checked==false)){
        sport="please select any fav sport"
    }

var find1=document.getElementById("find");
var find2="";
if(find1.value==""){
find2="please select list of subjects"
}
    
var text=document.f1.text1.value;
var text2="";
if(text==""){
text2="enter your address"
}

 

alert(sofsid+"\n"+semp+"\n"+sofname1+"\n"+sofname2+"\n"+sname+"\n"+sofpwd+"\n"+spwd+"\n"+gen+"\n"
+sport+"\n"+find2+"\n"+text2)
}
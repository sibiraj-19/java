let p='';
let n='';
let r='';
let t='';
 
function simpleintrest(){
    p=parseFloat(document.getElementById('principle').value);
    n=parseFloat(document.getElementById('numberofyears').value);
    r=parseFloat(document.getElementById('rateofintrest').value);
    let answer;
    answer=((p)*(n)*(r))/100;
    document.getElementById('result').innerHTML="SIMPLE INTREST="+answer;
    p='';
    n='';
    r='';
}

 
function compundintrest(){
    p=parseFloat(document.getElementById('principle1').value);
    n=parseFloat(document.getElementById('numberofyears1').value);
    r=parseFloat(document.getElementById('rateofintrest1').value);
    t=parseFloat(document.getElementById('timeinyears1').value) ;
    let answer;
    answer=p*(1+(r/n))**(n*t);
    document.getElementById('result1').innerHTML="COMPUND INTERST="+answer;
    
    p='';
    n='';
    r='';
    t='';
}

function clr(){
let p='';
let n='';
let r='';
let t='';
document.getElementById('result').innerHTML=" ";
document.getElementById('result1').innerHTML=" ";

}
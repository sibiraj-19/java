let i='';
let r='';
let n='';

function cal(){
    i=parseFloat(document.getElementById('Yearly Interest').value);
    n=parseFloat(document.getElementById('Time Period').value);
    r=parseFloat(document.getElementById('Rate Of Interest').value);

    let PPF;
    let a;
    let b;
    let c;
    a = Math.pow((1 + r),n);
    b=a-1;
    c=b/r;
    PPF= i*c;
    
    document.getElementById('ppf').innerHTML="Maturity Amount :  "+PPF;
    document.getElementById('yi').innerHTML="Yearly Interest :    "+i;
    document.getElementById('no').innerHTML="Number Of Years :    "+n;
    document.getElementById('ri').innerHTML="Rate Of Interest :    "+r;
    
}

function clr(){
    let i='';
    let r='';
    let n='';
    let PPF;
    let a;
    let b;
    let c;
    document.getElementById('ppf').innerHTML="  ";
    document.getElementById('yi').innerHTML="Yearly Interest :    "+i;
    document.getElementById('no').innerHTML="Number Of Years :    "+n;
    document.getElementById('ri').innerHTML="Rate Of Interest :    "+r;
}
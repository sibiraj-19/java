let l='';
let i='';
let t='';

function cal(){


    l=parseInt(document.getElementById('Loan').value);
    i=parseInt(document.getElementById('Interest').value);
    t=parseInt(document.getElementById('Time').value);
    
    let I;
    let EMI;
    let TI;
    let TA;
    I=i/100/12;
    EMI=(l*I* (Math.pow (1+I,t))) / (Math.pow(1+I,t)-1);
    TI=(EMI * t);
    TA= l+(TI) ;
    // document.write(l).innerHTML;
    document.getElementById('emi').innerHTML="EMI :"+EMI.toFixed(2);
    document.getElementById('ti').innerHTML="Total Interest :"+TI.toFixed(2);
    document.getElementById('ta').innerHTML="Total Amount :"+TA.toFixed(2);


}

function clr(){
    document.getElementById('emi').innerHTML="EMI :"
    document.getElementById('ti').innerHTML="Total Interest :"
    document.getElementById('ta').innerHTML="Total Amount :"
}
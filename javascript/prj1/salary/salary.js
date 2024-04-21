let h='';
let d='';
let w='';

function cal(){

    h=parseInt(document.getElementById('hourly rate').value);
    d=parseInt(document.getElementById('hours per day').value);
    w=parseInt(document.getElementById('days per week').value);

    let ha; 
    let da; 
    let wa; 
    let ma; 
    let ya;  

    ha= h;
    da= d*ha;
    wa= w*da;
    ma= wa*4;
    ya= ma*12;

    document.getElementById('hs').innerHTML="Hourly Salary : "+ha;
    document.getElementById('ds').innerHTML="daily Salary : "+da;
    document.getElementById('ws').innerHTML="weekly Salary : "+wa;
    document.getElementById('ms').innerHTML="monthly Salary : "+ma;
    document.getElementById('ys').innerHTML="yearly Salary : "+ya;

}
function clr(){
    let h='';
    let d='';
    let w='';
    
    let ha=''; 
    let da=''; 
    let wa=''; 
    let ma=''; 
    let ya='';
    document.getElementById('hs').innerHTML="Hourly Salary : "+ha;
    document.getElementById('ds').innerHTML="daily Salary : "+da;
    document.getElementById('ws').innerHTML="weekly Salary : "+wa;
    document.getElementById('ms').innerHTML="monthly Salary : "+ma;
    document.getElementById('ys').innerHTML="yearly Salary : "+ya;
}
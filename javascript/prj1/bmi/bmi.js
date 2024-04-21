let w='';
let h='';

function cal(){
    w=parseFloat(document.getElementById('weight').value);
    h=parseFloat(document.getElementById('height').value);
    let BMI;
    BMI=w/(h/100)**2;
    if(BMI<18.5){
    document.getElementById('bmi').innerHTML="You are Underweight "+BMI;
         
    }
    else if(BMI>=18.5 && BMI<25){
    document.getElementById('bmi').innerHTML="You are fit "+BMI;

    }
    else if(BMI>=25 && BMI<30){
    document.getElementById('bmi').innerHTML="You are Overweight "+BMI;

    }
    else if(BMI>30){
    document.getElementById('bmi').innerHTML=" Obesity "+BMI;

    }
    
}
function clr(){
    let w='';
    let h='';
    let BMI;
    document.getElementById('bmi').innerHTML=" ";
}
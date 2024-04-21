    let fn='';
    let sn='';
    let op='';

    function appendNumber(number){
        if(op==''){
            fn+=number;
            document.getElementById('result').value=fn;
        }
        else{
            sn+=number;
            document.getElementById('result').value=sn;
        }
         }
         function Setoperator(operator){
            op=operator;
         }
    function calculate(){
      let answer;
      switch (op){
            case '+':
            answer=parseInt(fn) + parseInt(sn);
             break;
            case '-':
            answer=parseInt(fn) - parseInt(sn);
            break;
             case '*':
            answer=parseInt(fn)*parseInt(sn);
            break;
           case '/':
            answer=parseInt(fn)/parseInt(sn);
            break;
        
      }
   document.getElementById('result').value=answer;
   sn='';
 fn='';
op='';
    }

    function clearresult(){
        sn='';
        fn='';
        op='';
        document.getElementById('result').value='';

    }

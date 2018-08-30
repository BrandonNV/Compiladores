grammar prefijo;

prog: expr '\n' ;
expr:  expr '+' term |
       expr '-' term |
      term;
term: '0'  |
      '1'  |
      '2'  |
 	  '3'  |
      '4'  |
      '5'  |
      '6'  |
      '7'  |
      '8'  |
      '9'  ; 
       
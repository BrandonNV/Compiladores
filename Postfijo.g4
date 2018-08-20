grammar Postfijo;
prog: expr '\n' {System.out.println();};
expr: expr '+' term {System.out.print('+');}|
      expr '-' term {System.out.print('-');}|
      term;
term: '0' {System.out.print('0');}|
      '1' {System.out.print('1');}|
      '2' {System.out.print('2');}|
 	  '3' {System.out.print('3');}|
      '4' {System.out.print('4');}|
      '5' {System.out.print('5');}|
      '6' {System.out.print('6');}|
      '7' {System.out.print('7');}|
      '8' {System.out.print('8');}|
      '9' {System.out.print('9');};
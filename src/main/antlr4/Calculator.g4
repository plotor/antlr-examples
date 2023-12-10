grammar Calculator;

expr:  expr op=('*'|'/') expr  # MulDiv
    |  expr op=('+'|'-') expr  # AddSub
    |  NUM                     # num
    |  '(' expr ')'            # parens
    ;

NUM     : [0-9]+ ;

MUL     : '*' ;
DIV     : '/' ;
ADD     : '+' ;
SUB     : '-' ;
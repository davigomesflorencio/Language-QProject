grammar qproject;
programa
    : lista_de_definicoes EOF
    ;
lista_de_definicoes
    : lista_de_definicoes definicao
    | definicao
    ;
definicao
    : funcao
    | estrutura
    ;
estrutura: STRUCT ID LBRACE lista_estrutura_corpo RBRACE SEMI;
lista_estrutura_corpo
    : lista_estrutura_corpo estrutura_acesso
    | estrutura_acesso
    ;
estrutura_acesso
    : PUBLIC COLON lista_estrutura_membros
    | PROTECTED COLON lista_estrutura_membros
    ;
lista_estrutura_membros
    : lista_estrutura_membros membro
    | membro
    ;
membro
    : construtor
    | variavel
    | metodo
    | STATIC variavel
    | STATIC funcao
    ;
variavel : tipo ID SEMI;
variavel_atribuicao : tipo ID ATRIB expressao SEMI;
construtor : ID LPAREN parametros_formais RPAREN bloco;
metodo : funcao_cabecalho qualificador bloco;
funcao : funcao_cabecalho bloco;
funcao_cabecalho : tipo ID LPAREN parametros_formais RPAREN;
parametros_formais
    : lista_parametros_formais
    |
    ;
lista_parametros_formais
    : lista_parametros_formais COMMA tipo ID
    | tipo ID
    ;
tipo
    : VOID
    | qualificador INT decorador
    | qualificador CHAR decorador
    | qualificador BOOL decorador
    | qualificador tipo_nome decorador
    ;
tipo_nome
    : tipo_nome DBLCOL ID
    | ID
    ;
qualificador
    : CONST
    |
    ;
decorador
    : AMPER
    |
    ;
bloco : LBRACE lista_declaracoes_locais lista_comandos RBRACE;
lista_comandos
    : lista_comandos comando
    | comando
    ;
comando
    : bloco
    | selecao
    | repeticao
    | atribuicao
    | retorno
    | entrada
    | saida
    | expressao_comando
    | BREAK SEMI
    ;
selecao : IF LPAREN expressao RPAREN lista_comandos selecao_senao;
selecao_senao
    : ELSE lista_comandos
    |
    ;
repeticao : WHILE LPAREN expressao RPAREN lista_comandos;
atribuicao : nome ATRIB expressao SEMI;
retorno : RETURN expressao_comando;
entrada : STDCIN lista_entrada_params SEMI;
lista_entrada_params
    : lista_entrada_params RSHIFT nome
    | nome
    | STDENDL
    ;
saida : STDCOUT lista_saida_params SEMI;
lista_saida_params
    : lista_saida_params LSHIFT expressao
    | expressao
    | STRL
    | STDENDL
    ;
lista_declaracoes_locais
    : variavel
    | variavel_atribuicao
    |
    ;
expressao_comando
    : expressao SEMI
    | SEMI
    ;
expressao
    : LPAREN expressao RPAREN
    | <assoc=right> expressao operador_binario expressao
    | <assoc=right> operador_unario expressao
    | nome LPAREN parametros_reais RPAREN
    | nome
    | INTL
    | CHARL
    | TRUE
    | FALSE
    ;
operador_binario
    : AND
    | OR
    | PLUS
    | MINUS
    | TIMES
    | DIV
    | MOD
    | LT
    | LEQ
    | GT
    | GEQ
    | EQ
    | NEQ
    ;
operador_unario
    : INCR
    | DECR
    | MINUS
    | NOT
    ;
nome
    : ID DBLCOL nome_lista
    | THIS ARROW nome_lista
    | nome_lista
    ;
nome_lista
    : ID DOT nome_lista
    | ID nome_one
    | ID ;
nome_one:
    | LPAREN parametros_reais RPAREN DOT nome_lista
    | LPAREN parametros_reais RPAREN DOT nome_one
    ;
parametros_reais
    : lista_parametros_reais
    |
    ;
lista_parametros_reais
    : lista_parametros_reais COMMA expressao
    | expressao
    ;
//special
AMPER:'&';
SEMI : ';';
COLON : ':';
COMMA : ',';
LSHIFT:'<<';
RSHIFT:'>>';
STDCIN:'std::cin';
STDCOUT:'std::cout';
STDENDL:'std::endl';
//operators
AND:'&&';
ARROW:'->';
ATRIB:'=';
DBLCOL : '::';
DECR:'--';
DIV:'/';
DOT:'.';
EQ:'==';
GEQ:'>=';
GT:'>';
INCR:'++';
LEQ:'<=';
LT:'<';
MINUS:'-';
MOD:'%';
NEQ:'!=';
NOT:'!';
OR:'||';
PLUS:'+';
TIMES:'*';
//delimiters
DQUO : '"';
SQUO : '\'';
LBRACE : '{';
RBRACE : '}';
LPAREN : '(';
RPAREN : ')';
//reserved tokens
PUBLIC : 'public';
PROTECTED : 'protected';
PRIVATE : 'private';
STATIC : 'static';
STRUCT : 'struct';
IF : 'if';
ELSE :'else';
WHILE :'while';
BREAK :'break';
RETURN :'return';
THIS :'this';
TRUE :'true';
FALSE :'false';
CONST :'const';
VOID :'void';
INT :'int';
CHAR :'char';
BOOL :'bool';
WHITE : [ \t]+ -> skip ;
DIR : '#'.*? -> skip;
COM : ('//' ~ [\r\n]*| '/*' .*? '*/')->skip;
CHARL: '\''[0-9a-zA-Z]'\'';
INTL:(('+'|'-')?[1-9]+[0-9]*|[0]);
STRL:'"'[0-9a-zA-Z]*'"';
ID: NONDIGIT+ (DIGIT|NONDIGIT)*;
fragment NONDIGIT
   : [a-zA-Z_]
   ;
fragment DIGIT
   : [0-9]
;




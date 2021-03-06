package analisadorlexico;

public interface Constantes {
    
    enum Token { WHILE, DO, IF , FOR, SWITCH, CASE, AP, FP, ACH, FCH, PTV, DPT, NEGACAO, VARIAVEL, NUMERO, OP_UN_BIN, OP_UNARIO, OP_BINARIO, IGUALDADE, CARACTERE }
    
    String  WHILE = "while",
            DO = "do",
            IF = "if",
            FOR = "for",
            SWITCH = "switch",
            CASE = "case",
            LETRA = "abcdefghijklmnopqrstuvwxyz",
            DIGITO = "0123456789",
            SINAL = "+-",
            OP_BINARIO = "*/%&&||==!=&|>><<",
            OP_UN_BIN = "+-",
            OP_UNARIO = "++--";
            
    
    char    AP = '(',
            FP = '(',
            ACH = '{',
            FCH = '}',
            PTV = ';',
            DPT = ':',
            NEGACAO = '!';
            
    
}

package Head_First_Java_3rd;

/*
Em java as variaveis fazem parte de duas categorias: primitivas e referencias de objecto.

As variaveis do tipo primitivos compreendem de :

integers:valores inteiros

tipo       tamanho        intervalo
byte        8bits          -128 a 127
short       16bits         -32768 a 32767
int         32bits          -2147483648 a 2147483647
long        64bits           -grande para grande

ponto flutuante:valores decimais

tipo       tamanho        intervalo
float        32bits        varia
double       64bits         varia

boolean e char: valores logicos e caracter

tipo       tamanho        intervalo
byte                      true ou false
char       16bits           0 a 65535

Declaracao de uma variavel deve contar com :tipo de dado nome;

*********************************************************
Regra para nomear variaveis, classes e metodos:
1.Pode comecar por uma letra,underscore(_) ou sinal dolar($).O nome nao pode comecar por numeros
2.Depois do primeiro caracter podemos usar um numero
3.Pode ser qualquer nome desde que obedeca as regras acima e nao seja uma palavra reservada do java

 */
public class cap3_variaveis_primitivas {

    //declarando algumas variaveis
    public static void main(String[] args) {
    int x;//declarando uma variavel do tipo int
    x=234;//inicializando a variavel acima
    byte b=89;//declarando e  inicializando
    boolean isFun=true;
    double d=3456.98;
    char c='f';//caracteres devem estar entre aspas simples
    boolean isPunkRock;
    isPunkRock=false;
    boolean powerOn;
    powerOn=isFun;//inicializamos a valores powerOn com o valor da variavel isFun
    long big=3456789L;//no final do valor demos colocar um L(maiusculo ou minusculo) para que o compiladores perceba que e um long
    float f=32.5f;//no final do valor demos colocar um F(maiusculo ou minusculo) para que o compiladores perceba que e um float
        //NB:Nao podemos colocar o valor de uma variavel de um tipo maior em uma de um tipo menor.
        //ex: int x=24; byte  b=x;.Mesmo 24 fazendo parte do intervalo aceite pelo byte o compiladores nao permite que dados de bits maiores sem colocados em variaveis de bits menores mas o inverso e possivel.
}
}

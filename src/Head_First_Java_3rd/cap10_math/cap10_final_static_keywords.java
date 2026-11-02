package Head_First_Java_3rd.cap10_math;

/*
***********************************Metodos static************************************************************
metodos dos tipo estaticos sao aqueles que não precisam do objecto para serem invocados, precisam simplesmente do nome da classe.NB:E possivel usar uma instancia para invocar um metodo estatico mas nao e o ideal.
Os metodos estaticos não são influenciados(usados com) pelas variaveis de instancia.

metodos estaticos vs metodos nao estaticos

metodos nao estaticos
Objecto obj=new Objecto();
obj.metodo();

metodos estaticos
Objecto.metodo();

Metodos estaticos so podem ser usados com variaveis estaticas e outros metodos estaticos

* construcao de um metodo estatico:
* modificador static retorno nome(){}
* ex: public static void fazer(){}
*****************************************variaveis static*******************************************************************
variaveis do tipo estaticas sao aquelas em que o valores delas e partilhado por todas as instancias.
* construcao de uma variavel estatica:
* modificador static tipo dado nome;
* ex: private static int tamanho;
* ******************************************** variaveis Final***********************************

variavel do tipo final e aquele que uma vez inicializada o seu valores nao muda.
*
* estrutura:
*
* modificador final tipo dado nome;
* ex: private final double PI;
* NB: por convencao variaveis do tipo final(constantes) sao maiusculas.Ao ser cria a variavel deve ser logo inicializada.
*
* Existem duas formas de inicializar.
* 1.Inicializar logo durante a criacao
* ex: private static final double PI=3.14;

* 2.Usando o inicializador static
* Criamos a variavel.
* ex: private static final double PI;
*depois usamos o static{}
* static{
* PI=valor
* }
* * ******************************************** Metodos Final***********************************
* Um metodo final e aquele que nao pode ser subescrito(override).
* construcao:
* modificador final retorno nome(){}
* ex: public final void nomear(){};
*
* * ******************************************** parametros final***********************************
* construcao:
*  modificador retorno nome(final retorno var){
* a variavel var nao podera ser mudada
* }
* * ******************************************** classe final***********************************
* modificador final class Nome{}-> a classe nao pode ser herdada
 */
public class cap10_final_static_keywords {
   //exemplo variavel estatica private int tamanho;
    //private static final int X=25;//criamos uma variavel privada, estatica e final.metodo 1.
   private static final double X;//metodo 2
    static{
        X=Math.random();
    }
    public static void main(String[] args) {
       //vai dar erro pois o metodo main é estatico  e nao pode ser usado com variaveis nao estaticas System.out.println("O tamanho é :"+tamanho); se a variavel tamanho fosse estatica esta instrucao funcionaria
       // System.out.println("Tamanho: "+getTamanho()); vai dar erro porque o metodo getTamanho() nao e estatico


    }
//    public int getTamanho(){ exemplo metodo estaticos
//        return tamanho;
//    }
}

package Head_First_Java_3rd.cap10_math;
/*
Wrapping-> e o processo de converter um tipo de dado primitivo em objecto.Ideal para usar estruturas de dado que so suportam objectos e usar os static utility methods.ex:arraylist
Primitivos               Objecto/Classe
boolean                   Boolean
char                      Character
byte                      Byte
short                     Short
int                       Integer
long                      Long
float                     Float
double                    Double


********************Conversao de um tipo primitivo para objecto wrapping*******************
Nome classe var=valor;
ex: Integer wrap=288;

********************Conversao de um objecto para tipo primitivo unwrapping*******************
tipo dado var=Objecto.tipoDadoValue();
ex: int unwrap=wrap.intValue();

NB:Esses procedimentos nao precisam ser feitos por nos ja que o java faz isto por nos(autoboxing)


***********************************static utility metodos**********************************

static utility metodos-> sao metodos que transformam string em numero.Quando refiro string estou a falar de numeros dentro de aspas.
1.convertendo de string para numeros.
Nome da classe.parseTipoDado("valor"); A inicial do tipo de dado deve estar em maiusculo.
ex: Integer.parseInt("3")
2.convertendo numeros para string
 1.Criar uma variavel do tipo String e adicionar o numero
 ex:double x=4.5;
 String doubleString=""+x;
 2.Usar o metodo toString();
  nome da classe.toString(valor);
  ex: Double.toString(42.5)

3.Usar o metodo String.valueOf(valor)
    ex: String.valueOf(42.5)


 */

public class cap10_wrapping_autoboxing {
    public static void main(String[] args) {
        //Wrapping
        int i=288;
        Integer wrap=i;
        //System.out.println(wrap);
        //unwrapping
        int unwrap=wrap.intValue();
       // System.out.println(unwrap);
        //de String para primitivos
        System.out.println(Integer.parseInt("3"));
        System.out.println(Double.parseDouble("3.5"));
        //de primitivos para String
        double x=4.5;
        String doubleString="";
        doubleString+=x;
        System.out.println(doubleString);
        System.out.println(Double.toString(x));
        System.out.println(String.valueOf(x));


    }
}

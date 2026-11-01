package Head_First_Java_3rd.cap10_math;
/*
Math-> é uma classe com metodos que nos permitem fazer algumas operacoes aritmeticas complexas.
E impossivel criar uma instancia(Objecto) do tipo Math porque o constructor da classe Math é privado.
Os metodos na classe Math são "static", ou seja, não precisam de uma instancia para acessá-los.

Metodos:
NB:Os metodos deve ser precedidos pelo nome da classe.Math.metodo().
round(valor)->arrendonda o valor
min(val1,val2)-> retorna o menor entre dois valores
max(val1,val2) -> retorna o maior entre dois valores
abs(-val)-> retorna o maior valor absoluto
random()-> retorna um valor entre [0,1[
sqrt(valor)-> retorna a raiz quadrada do valor
 */
public class cap10_math {
    //Math math=new Math();como referenciado acima é impossivel fazer isto
    public static void main(String[] args) {
        System.out.println(Math.abs(-1));
    }

}

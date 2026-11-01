package Head_First_Java_3rd.cap10_math;
/*
E possivel colocar underscore no numero para melhorar a legibilidade
ex:   long var=1_000_000_000;
NB:Na hora da execucao o compilador ignora o underscore

Para formatarmos numeros devemos usar o metodo:
format() da classe String.Este metodo retorna uma string

format segue a seguinte estrutura:

******************Especificadores de formatto

% [argumento] [flags] [largura] [.precisao] tipoDado

NB: OS elementos que estao entre "[]" sao opcionais.Mas a ordem de disposicao é importante

%->representa o valor/variavel a ser formatada
tipo dados:
d->numeros inteiros
f-> ponto flutuantes
x->hexadecimal
c-caracteres

flags-> sao os elementos que devem ser inseridos na formatacao:
virgulas,parenteses, sinal negativo, etc

precisao-> determina o numero de casas decimais a serem exibidas

largura-> define o numero minimo de caracteres a serem exibidos, se o valor tiver menos caracteres que requerido serao adicionados zeros ao numero

format("instrucao",valor).
String.format("%,d",valor).
NB: Os valores a serem formatados ficam fora de aspas ("").

 */
public class cap10_NumberFormatting {
    public static void main(String[] args) {
//        long var=1_000_000_000;
//        System.out.println(var);
        int one=20456654;
        double two=100567890.248907;
        //usando o metodo format
        System.out.println(String.format("%,d",1000000000));//O metodo separa cada grupo de 3 zeros por virgula
        System.out.println(String.format("I tenho %,.2f bugs por resolver.",476578.09876));//%-o elemento ,-> o que deve ser adicionado .2->precisao f->tipo de dado
        System.out.println(String.format("O rank e %,d de %,.2f",one,two));
    }
}

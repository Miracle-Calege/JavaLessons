package Java_core;

public class Aula1_printf {

    public static void main(String[] args) {


        //print()-> e usado para formatar o saida
        /*
        %s-> strings
        %c->char
        %d->numeros inteiros
        %f-> numeros decimais
        %b-> booleans
        //como usar
        System.out.printf("texto %s", variavel);
       Os caracteres supracitados devem estar entre aspas (""), e o conteudo a ser exibido deve estar separado do caracteres por meio de uma virgula. O conteudo a ser exibido estara no mesmo lugar em que o caracter foi colocado
         */


        String nome = "Miracle Calege";
        char letra = 'M';
        int idade = 20;
        double altura = 1.78;
        boolean estudante = true;
        System.out.printf("Kmk %s\n", nome);//NB: se quisermos saltar uma linha e so colocar \n entre as aspas("")
        System.out.printf("Teu nome inicia pela letra %c\n", letra);
        System.out.printf("Tens %d anos de idade \n", idade);
        System.out.printf("Tens uma altura de %f cm\n", altura);
        System.out.printf("EStudante: %b\n", estudante);

        //colocando toda informacao acima na mesma linha
        System.out.printf("Kmk %s,Teu nome inicia pela letra: %c,Tens %d anos de idade, Tens uma altura de %f cm e es estudante?: %b\n",nome,letra,idade,altura,estudante);

        //precisao em numeros decimais
        double preco1=9000.99;
        double preco2=1000000.15;
        double preco3=-54000.01;
        //se quisermos exbir os numeros acima do jeito que estao, notaremos que serao exibidos com o numero extra de casas decimais
        //para limitarmos o numero de casas decimais fazemos o seguinte "%.numerof", o numero(inteiro) determina a quantidade de casas decimais a serem exibidas(podendo arredondar)
        System.out.printf("%.1f\n",preco1);
        System.out.printf("%.1f\n",preco2);
        System.out.printf("%.1f\n",preco3);
        //"%+f" colocar o simbolo "+" antes dos valores(so para numeros positivos)
        System.out.printf("%+f\n",preco1);
        System.out.printf("%+.1f\n",preco2);
        System.out.printf("%+.1f\n",preco3);
        //"%,f"separa os milhares(tres zeros) por virgula
        System.out.printf("%,f\n",preco1);
        System.out.printf("%,.2f\n",preco2);
        System.out.printf("%,.2f\n",preco3);
        //"%(f"-> coloca entre parenteses somente os numeros negativos
        System.out.printf("%(.2f\n",preco1);
        System.out.printf("%(.2f\n",preco2);
        System.out.printf("%(.2f\n",preco3);
        //% f(% espaco em branco f)-> exbibe "-" se o numero for negativo e deixa um espaco em branco antes do numero se for positivo
        System.out.printf("% .2f\n",preco1);
        System.out.printf("% .2f\n",preco2);
        System.out.printf("% .2f\n",preco3);

        int id1=1;
        int id2=23;
        int id3=456;
        int id4=7890;
        //para adicionar zeros antes de um numero inteiro->"%0numeorod" numero(inteiro) e a quantidade de zero que queremos
        // colocando "%numerod" os valores terao um espacamento a esquerda em forma de ma piramide
        // colocando "%-numerod" os valores terao um espacamento a direita em forma de ma piramide
        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);



    }
}

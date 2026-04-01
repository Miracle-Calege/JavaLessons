package Java_core;

public class Aula9_escopoVariavel {

    static int x=3;//variavel global


    public static void main(String[] args) {
        /* variavel local -> e aquela que nao pode ser acessada fora do metodo(so pode ser acessada localmente, no metodo onde foi criada)
            variavel global-> aquela cria fora do metodo, na classe, que pode ser acessada por todos metodos
         */
        int x=1;//variavel local;
        System.out.println(x);
        facAlgo();
        /*
        local>global por isso enquantos houver variaveis locais com o mesmo nome que as globais , as locais serao dadas prioridade(no nosso caso serao impressas)
         */

    }

    static void facAlgo(){
        int x=2;//(tambem e variavel local) podemos ter variaveis com mesmo nome mas em escopos diferentes(cada variavel e acessavel no seu metodo)
        System.out.println(x);
    }

}

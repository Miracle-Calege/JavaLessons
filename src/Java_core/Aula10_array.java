package Java_core;

import java.util.Arrays;

public class Aula10_array {
    public static void main(String[] args) {
        //uma estrutura estatica(o tamanho nao e ajustavel automaticamente) que contem elementos do mesmo tipo de dados
    /*
    criando -> tipo de dado [] nome=new tipo de dado(o mesmo colocado anteriormente)[tamanho];
    criando e inicializando-> tipo de dado [] nome={elemnto1,elemento2};
    os elementos dessas estrutura sao acessaveis via indice, nome da estrutura[indice],lembrando que a contagem dos indices iniciam por 0, se um array for de tamanho 4 entao o ultimo indice sera 3
     */

        String[] frutas ={"maca","laranja","banana","coco"};

        //mundadoo o elemnto de um array num determinado indice :nome do araay[indice]=novo elemento;
        frutas[0]="ananas";
        // para retornar o tamanho de um array: nome do array.length

        // para imprimir todos elementos do array devemos usar uma estrutura de repeticao que vai acessar dos indices
            //para arrays e mais eficientes usar for-each
        /* for(tipo de dado do array nome(ao seu criterio):nome do array){
            accao
        }
         */
        //o metodo abaixo e os de maais podem ser encontrados importando a biblioteca java.util.Arrays;
        Arrays.sort(frutas);//organiza os elemntos do array em ordem crescente
        for(String fruta:frutas){
            System.out.print(fruta+" ");// imprimimos fruta por que agora cada elemento do array frutas chamar-se-a fruta
        }


    }


}

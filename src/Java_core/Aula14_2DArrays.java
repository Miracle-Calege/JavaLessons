package Java_core;

public class Aula14_2DArrays {
    public static void main(String[] args) {
        //2D array-> e um array de arrays
        //cria e inicializar ->tipo de dado [][] nome={array1,array2,...} ou {{dado1,dado2,dado3},dado4,dado5,dado6}};
        //cria e nao inicializar->tipo de dado [][] nome=new tipo de dado[numero linhas][numero colunas];
//       para substituir/inicializar um elemento via indice->nome da estrutura[numero da linha][numero da coluna]
//        String[]frutas={"maca","laranja","manga"};
//        String[] vegetais={"batata","cebola","cenoura"};
//        String[] carnes={"frango","porco","bife","peixe"};

//        String[][]compras={frutas,vegetais,carnes};

        String[][]compras={{"maca","laranja","manga"},//este array tem 3 linhas e 4 colunas
                         {"batata","cebola","cenoura"},
                            {"frango","porco","bife","peixe"}};
        compras[0][0]="ananas";//maca foi substituido por ananas

        for(String[] comidas:compras){//como cada elemento de compras e um array depois do tipo de dado colocamos tambem [],este for acessa os arrays
            for(String comida:comidas){//este loop e usado para acessar os elemento de cada array de forma individual
                System.out.print(comida+" ");
            }
            System.out.println();
        }

    }
}

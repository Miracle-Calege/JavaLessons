package Java_core;

public class Aula39_generics {
    public static void main(String[] args) {
        /*Generics-um conceito que permite criar classes, interface e metodos compatíveis com diferentes tipos de dado.
        Por convenção é usado <T>(type parameter) o parametro que vai receber o valor real
        type argument -> especifica o tipo de dado ex: <String>
        ex: ArrayList<String> frutas=new ArrayList<>();

        Para que as nossas variaveis e metodos aceitem o T(Pode ser outra letra) como um tipo de dado generico devemos colocar logo após o nome da classe <letra>

        NB:Podemos ter mais de um type parameter.
        ex:<T,U,V>
        public class Caixa <T>{

       }-> assim já podemos ter variáveis e  métodos que suportam T

       para declarar uma variavel do tipo generic:

       letra nome da variavel;
       ex:T preco;

       No método
             como retorno:
       T limpar(){
       }
                como parametro:
                void limpar(T variavel){

       }
        Durante a instanciação/criação de objecto:
        Classe <tipo de dado> nome =new Classe<>();

         */


        Caixa<String> caixa=new Caixa<>();

        caixa.setItem("Maca");
        System.out.println(caixa.getItem());

        Produto<String,Double>produto=new Produto<>("Maca",50.00);
        System.out.println(produto.getItem());
        System.out.println(produto.getPreco());

    }
}

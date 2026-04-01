package Java_core;

public class Aula20_Heranca {
    public static void main(String[] args) {
        /*Heranca: existe uma classe pai/mae,que serve  como modelo para as outras, tudo o que a classe
        pai tiver as outras terao automaticamente.
        Para as classes filhos usarem ou terem acesso aos atributos e metodos da classe pai apos o nome da classe filho colocamos extends nome da classe pai.
        Apesar de terem herdados o conetudo da classe pai, as classes filhos podem ter as suas proprias caracteristicas(atributos ou metodos)
         Atributos=variaveis que caracterizam o objecto;
         */

              Cao cao=new Cao();
              Gato gato=new Gato();
              Planta planta=new Planta();
              cao.falar();
              gato.falar();

        System.out.println(planta.vivo);
        planta.fotossintese();

    }
}

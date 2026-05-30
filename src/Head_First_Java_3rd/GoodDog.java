package Head_First_Java_3rd;
/*
Encapsular-> e restringir o acesso directo as variaveis de instancia por meio de "." recorrendo a getters(para retornar os seus valores) e setters(para inicializa-las).
Para encapsular usamos private antes do tipo de dado da variavel.Os metodos getteres e setteres sao encapsulados por com a keyword:public.
NB: por convencao o nome do getters segue o padrao: public retorno getNomeVariavelAretornar(); e o setter: public void setNomeVariavelAinicializar(tipo de dado valor);
Quando retornamos um get sem termos inicializado as variaveis de instancia o retorno para os tipos primitivos sera 0(incluindo char), para boolean sera false e para objectos sera null.
 */
public class GoodDog {
    private int tamanho;

    public int getTamanho(){//getters
        return tamanho;
    }
    public void setTamanho(int s){//setters
        tamanho=s;
    }
    void latir() {
        if (tamanho > 60) {
            System.out.println("woof woof");
        } else if (tamanho > 14) {
            System.out.println("Ruff Ruff");
        } else {
            System.out.println("Yip! yip!");
        }
    }


}
/*
Variaveis locais-> aquelas declaradas dentro do metodo.Devem ser inicializada antes de usadas diferente das variaveis de instancia.
== ->verifica se duas variaveis tem os mesmos bits(se sao iguais)
 */

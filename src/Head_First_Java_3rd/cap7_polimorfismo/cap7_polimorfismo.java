package Head_First_Java_3rd.cap7_polimorfismo;

public class cap7_polimorfismo {
    /*
    Supondo que temos uma superclasse classe Animal e uma subclasse cao

    É possível criar uma variavel de referência diferente do tipo do objecto

    ex: Animal myDog=new Cao();

    Criamos um objecto do tipo cao cujo a sua variavel é do tipo animal, ou seja, todas as subclasses podem ser armazenadas em variáveis
    do mesmo tipo da superclasse.

    Benifícios:
    1.É possível colocar os diferentes tipos de objectos numa mesma estrutura de dados, nao sendo necessario criar estruturas do mesmo tipo.
    Animal [] animals=new Animal[5];
    animals[0]=new Cao();
    animals[1]=new Gato();
    NB:Só serão acessados os metodos da superclasse(incluindo os overrided) e nao os específicos de cada classe.

***********************************************************************************************************************
NB: Uma classe nao pode ser privada(private class), mas pode ser não pública(class).

1.Uma classe não publica só pode ser herdada por classes que estão no mesmo pacote que ela.
2.Uma classe com a keyword final nao pode ser herdada
     */
}

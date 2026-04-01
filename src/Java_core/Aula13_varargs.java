package Java_core;

public class Aula13_varargs {
    public static void main(String[] args) {
        //varargs->permite que um metodo aceita varios argumentos, os argumentos sao colocados num array
        //como criar->tipo de dado ...(reticencias/tres pontinhos->ellipsis) nome a sua escolha

        System.out.println(adicionar(1,2,3,4,5,6));
    }

    private static int adicionar(int ...numeros){
        int soma=0;
        for(int numero:numeros){
            soma+=numero;
        }
        return soma;
    }
}

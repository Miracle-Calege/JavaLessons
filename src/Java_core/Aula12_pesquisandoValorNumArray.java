package Java_core;

public class Aula12_pesquisandoValorNumArray {
    public static void main(String[] args) {

        int[] numeros={1,3,9,4,5,6,7,2};
        int alvo=4;

        for(int i=0;i<numeros.length;i++){//linear search, acessamos indice por indice ate encontrar o alvo
            if(alvo==numeros[i]){
                System.out.println("Elemento encontrado no indice: "+i);
                break;
            }
        }

    }
}

package Head_First_Java_3rd;
/*
Arrays e uma estrutura de dados que armazena dados em indices.O array pode ser do tipo primitivo ou referencia.NB:Array tambem e um objecto
Declarando um array: tipo de dado[]nome;
incializa:nome da array=new tipo de dado[tamanho];
inicializando cada indice: nome do array[indice]=valor;
NB:Lembrando que os indices partem de zero ate tamanho-1.Cada posicao do array e uma variavel
 */
public class cap3_arrays_tipoPrimitivos {
    public static void main(String[] args) {
        int [] numeros;
        numeros=new int[7];
        numeros[0]=6;
        numeros[1]=19;
        numeros[2]=44;
        numeros[3]=42;
        numeros[4]=10;
        numeros[5]=20;
        numeros[6]=1;
    }
}

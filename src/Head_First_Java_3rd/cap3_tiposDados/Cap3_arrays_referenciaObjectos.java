package Head_First_Java_3rd.cap3_tiposDados;


import Java_core.Cao;

public class Cap3_arrays_referenciaObjectos {
    public static void main(String[] args) {
        Cao[]pets;//criamos um array que guarda referencia do tipo Cao
        pets=new Cao[7];//incializamos a estrutura para alojar 7 referencias do tipo acima
        pets[0]=new Cao();//criamos um objecto e guardamos a referencia na primeira posicao do array
        pets[1]=new Cao();

    }
}

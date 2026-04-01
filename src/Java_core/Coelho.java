package Java_core;

public class Coelho  implements Presa {//para usar o conteudo da interface usamos a palavra: implements nome da interface
// por obrigacao a classe que implementa a interface deve criar uma assinatura para todos os metodos que constam na interface

    @Override
    public void fugir(){
        System.out.println("O coelho esta a fugir");

    }


}

package Head_First_Java_3rd.cap10_math;
/*
static import permite que acessemos a metodos e variaveis de uma classe sem necessidade de uso de um objecto ou do nome da classe.
construcao:
import static pacote.nomeclasse;
 */
import static java.lang.Math.*;
import static java.lang.System.*;
public class cap10_static_import {

    public static void main(String[] args) {
        out.println("raiz quadrada:"+sqrt(2.0));//acessamos ao metodo sqrt() da classe Math sem precisar do nome da classe e imprimimos sem precisamos do nome da classe System

    }
}

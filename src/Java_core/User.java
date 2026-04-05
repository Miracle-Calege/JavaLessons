package Java_core;

import java.io.Serializable;

public class User implements Serializable {
    String nome, password;
    private static final long serialVersionUID=1;//é boa práctica declarar e inicializar o serialVersionUID




    public void sayHello(){
        System.out.println("Olá "+nome);
    }


}

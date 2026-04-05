package Java_core;

import java.io.*;

public class Aula44_serializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /* Serialização-> é o processo de converter um objecto em bytes.Consiste em salvar o estado do objecto antes de sair do programa
        Esta sequência de bytes pode ser salva como um ficheiro ou enviada  na rede para diferentes máquinas
        Pode ser salva num ficheiro .ser que é independente de plataforma.
        Deserialização->processo inverso, conversão de uma sequência de bytes em objecto
        serialVersionUID->é um identificador único durante este processo para ver se o objecto é equivalente ao outro no processo de serializacao e deserializacao. É do tipo long
        A serialVersionUID da classe serializada deve ser igual a da classe desserializada

        Passos para serializar
----------------------------------------------------------------------------------------------
1.A minha classe objecto deve implementar a interface Serializable
2.Importar java.io.Serializable
3.FileOutputStream nome a sua escolha=new FileOutputStream(caminho onde o ficheiro deve ser criado/nome do ficheiro.ser);-> esse objecto escreve os dados no ficheiro em forma de bytes
4.ObjectOutputStream nome a sua escolha=new ObjectOutputStream(nome do objecto FileOutputStream);->converte o objecto em uma sequência de bytes
5.nome do objecto ObjectOutputStream.writeObject(nome do nosso objecto);writeObject()->escreve o objecto no ficheiro
//encerramos os recursos/objectos usados acima
6.nome do objecto ObjectOutputStream.close();
7.nome do objecto FileOutputStream.close();

         Passos para deserializar
        ----------------------------------------------
        1.Declarar um objecto (sem instanciar)
        2.A classe objecto deve implementar a interface Serializable
        3.Importar Java.io.Serializable
        3.FileInputStream nome a sua escolha=new FileInputStream(caminho onde o ficheiro deve ser buscado/nome do ficheiro.ser);-> esse objecto lê  os dados no ficheiro em forma de bytes
        4.ObjectIntputStream nome a sua escolha=new ObjectInputStream(nome do objecto FileInputStream);->converte uma sequência de bytes em objecto
        5.nome do objecto=(nome da classe) ObjectInputStream.readObject();readObject()->lê o objecto no ficheiro
        //encerramos os recursos/objectos usados acima
        6.nome do objecto ObjectInputStream.close();
        7.nome do objecto FileInputStream.close();

        NB:Se colocarmos a palavra "transient" numa variável ela não será serializada
        ex: transient string nome;-> não será serializada



         */

        /*

                   Serializacao
        ----------------------------------------------

        User user=new User();

        user.nome="Miracle Calege";
        user.password="1234";

        FileOutputStream fileout=new FileOutputStream("userInfo.ser");
        ObjectOutputStream out=new ObjectOutputStream(fileout);
        out.writeObject(user);
        out.close();
        fileout.close();

        System.out.println("Informacao do objecto salva");

         */




//                 Deserializacao
//         ---------------------------------------------------------


        User user=null;

        FileInputStream filein=new FileInputStream("/home/miracle-calege/Documents/JavaLessons/userInfo.ser");
        ObjectInputStream in=new ObjectInputStream(filein);
        user= (User) in.readObject();
        in.close();
        filein.close();

        System.out.println(user.nome);
        System.out.println(user.password);
        user.sayHello();

        long serialVersionUID=ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();//retorna o serialVerionUID
        System.out.println(serialVersionUID);







    }

}

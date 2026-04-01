package Java_core;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Aula34_escreverFicheiro {
    public static void main(String[] args) {
        /*
        As opções mais populares para escrever um ficheiro em java
        Filewriter->ideal para pequenos e médios ficheiros de texto
        BufferedWriter->melhor performance para maior quantidade de texto
        PrintWriter->melhor para dados estruturados como relatórios e logs
        FileOutputStream->melhor para ficheiros binários(imagens,ficheiro áudio,etc)
         */
        /*
        O manuseio de ficheiros pode gerar excepção do tipo IO, por isso é boa práctica colocar entre um bloco try-catch
        FileWriter nome=new FileWriter(nome do ficheiro."extensão");->criação de um objecto filewriter na pasta onde o projecto java está
        ou
        FileWriter nome=new FileWriter(path/nome do ficheiro."extensão");

        usamos o metodo write("conteudo")-> para escrever no ficheiro
         */

       try(FileWriter writer=new FileWriter("test.txt")){
           writer.write("Estou a escrever um ficheiro");
           System.out.println("Ficheiro foi escrito");

       }catch(FileNotFoundException e){
           System.out.println("Ficheiro não encontrado");
       }
       catch (IOException e){
           System.out.println("Ficheiro não pode ser escrito");

       }
    }
}

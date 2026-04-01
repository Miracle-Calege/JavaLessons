package Java_core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Aula35_lendoFicheiro {
    public static void main(String[] args) {
        /*
        As formas mais usuais de ler um ficheiro em java

        BufferedReader+FileReader->melhor para ler texto de ficheiro linha à linha
        FileInputStream-> melhor para ler ficheiro binários(ex:imagens,áudio)
        RandomAcessFile-> melhor para ler e escrever partes específicas de um texto grande
        criando:
        BufferedReader nome=new BufferedReader(new FileReader(nome do ficheiro));-> se estiver na mesma pasta do projecto
        BufferedReader nome=new BufferedReader(new FileReader(path/nome do ficheiro));-> se não estiver na mesma pasta do projecto

         */

        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
        String linha;
        while ((linha= reader.readLine())!=null){//enquanto linha for diferente de null
            System.out.println(linha);
        }

        }catch (FileNotFoundException e){
            System.out.println("Ficheiro não localizado");

        }catch (IOException e){
            System.out.println("Algo deu errado");
        }


    }
}

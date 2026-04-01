package Java_core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula33_ExceptionHandling {
    public static void main(String[] args) {


        /*
        try{
        colocamos a linha de codigo que pode geral excepção
        }catch(tipo/nome de excepção de queremos evitar  variavel ){
        instrução a ser executada caso essa excepção aconteça
        }catch(excepção variavel){//podemos ter mais de um catch depois de um  try{}

        }finally{
        instrução que é sempre executada quer aconteça ou não uma excepção
        }



         */
//        Scanner sc=new Scanner(System.in);

//        try {
//            System.out.println("Insira um número: ");
//            int num = sc.nextInt();
//            System.out.println(num);
//            // System.out.println(1/0);
//        }catch (InputMismatchException e){
//            System.out.println("A entrada fornecida não era um número");
//
//        }catch (ArithmeticException e){
//            System.out.println("Nao podes dividir por zero");
//
//        } catch (Exception e) {//Exception é usado para antecipar qualquer tipo de excepção
//            System.out.println("Algo deu errado");
//        }finally {
//            sc.close();
//        }


        //try with resources->fecha todos os recursos de forma automatica ex:scanner,writer,conexão com bd, etc.

        /*
        try(o(s) recurso(s)){
        }catch(){
        }
         */

        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Insira um número: ");
            int num = sc.nextInt();
            System.out.println(num);
            // System.out.println(1/0);
        }catch (InputMismatchException e){
            System.out.println("A entrada fornecida não era um número");

        }catch (ArithmeticException e){
            System.out.println("Nao podes dividir por zero");

        } catch (Exception e) {//Exception é usado para antecipar qualquer tipo de excepção
            System.out.println("Algo deu errado");
        }finally {
            System.out.println("Sempre executa");
        }

    }
}

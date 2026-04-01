package Java_core;

public class Aula31_wrapperClasses {
    public static void main(String[] args) {
        //wrapper classes-> permite que dados primitivos sejam usados como objectos permitindo
        //usar collections frameworks e static utility methods


        /*primitives->Objects
            int->Integer
            double->Double
            char->Character
            boolean->Boolean
         */
        //Autoboxing
        //inves de usar os tipos primitivos usamos os objects
//        Integer a=123;
//        Double b=3.14;
//        Character c='$';
//        Boolean d=true;

        //unboxing-> processo inverso ao autoboxing
//        int x=a;
//        double y=b;
//        char z=c;
//        boolean f=d;

            //Object.toString(valor)-> converte o valor em string
//        String a= Integer.toString(123);
//        String b= Double.toString(3.14);
//        String c= Character.toString('@');
//        String d= Boolean.toString(false);
//
//        System.out.println(a+b+c+d);
        //object(do tipo numero/exceccao Boolean).parseTipoPrimitivo(Nb:com inicial maiúscula)(valor)->convertem uma string para um valor numérico
//        int a= Integer.parseInt("123");
//        double b= Double.parseDouble("3.14");
//        char c= "pizza".charAt(0);
//        boolean d= Boolean.parseBoolean("true");

       char letra='b';

        System.out.println(Character.isLetter(letra));//retorno do tipo boolean-verifica se o caracter e uma letra
        System.out.println(Character.isUpperCase(letra));//retorno do tipo boolean-verifica se o caracter e uma letra maiúscula
    }
}

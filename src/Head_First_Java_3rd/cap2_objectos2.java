package Head_First_Java_3rd;
/*
Metodos:
equals(Object o)-> verifica se os objectos sao iguais(apontam para o mesmo endereco de memoria)
getClass()-> retorna o nome da classe do objecto
hashCode()->retorna o hashCode do objecto(identificador do objecto)
toString()->retorna o nome da classe e endereco na memoria
 */

public class cap2_objectos2 {
    public static void main(String[] args) {
        Cao cao=new Cao();
        cao.tamanho=40;
        cao.latir();
        System.out.println(cao.hashCode());

        //testes
        Cao dog=new Cao();
        Cao cao2=cao;

        System.out.println(cao.equals(dog));//vai retornar false
        System.out.println(cao.equals(cao2));//vai retornar true
        System.out.println(cao.hashCode());
        System.out.println(cao.getClass());
        System.out.println(cao.toString());

    }

}

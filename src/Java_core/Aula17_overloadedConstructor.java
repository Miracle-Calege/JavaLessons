package Java_core;

public class Aula17_overloadedConstructor {
    //overloaded constructors->permite que uma classe tenha varias constructores com diferentes listas de parametros,assemelha-se a overloaded methos
    public static void main(String[] args) {

        Usuario user1=new Usuario("Miracle Calege");
        Usuario user2=new Usuario("Miracle Calege","miracle@gmail.com");
        Usuario user3=new Usuario("Miracle Calege","miracle@gmail.com",22);
        Usuario user4=new Usuario();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.idade);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.idade);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.idade);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.idade);





    }
}

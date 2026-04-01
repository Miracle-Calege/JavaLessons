package Java_core;

public class Usuario {
    String username;
    String email;
    int idade;

    public Usuario(){
    }

    public Usuario(String username){
        this.username=username;
    }
    public Usuario(String username,String email){
        this.username=username;
        this.email=email;
    }

    public Usuario(String username,String email,int idade){
        this.username=username;
        this.email=email;
        this.idade=idade;
    }

}

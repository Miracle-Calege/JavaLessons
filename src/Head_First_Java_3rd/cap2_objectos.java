package Head_First_Java_3rd;

public class cap2_objectos {
    public static void main(String[] args) {
        //Criando um objecto do tipo filme:Nome da classe nome do objecto(ao seu gosto)=new Nome da classe();
        Filme filme1=new Filme();
        //acessando a uma variavel de instancia
        filme1.titulo="Rocky";
        filme1.genero="Accao";
        filme1.classificacao=-2;
        //criando outro objecto
        Filme filme2=new Filme();
        filme2.titulo="Jumanji";
        filme2.genero="Comedia";
        filme2.classificacao=5;
        //invocando/chamando o metodo
        filme2.reproduzir();

    }
}

/*Quando um objecto e criado em java ele vai para memoria heap, quando o objecto nao esta mais a ser usado a jvm automaticamente liberta aquela alocacao de memoria que estava a ser usada pelo objecto

 */

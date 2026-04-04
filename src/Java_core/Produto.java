package Java_core;

public class Produto <T,U>{
    T item;
    U preco;

    Produto(T item, U preco){
        this.item=item;
        this.preco=preco;
    }



    public T getItem() {
        return item;
    }
    public U getPreco(){
        return preco;
    }
}

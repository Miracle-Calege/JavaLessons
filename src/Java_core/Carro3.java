package Java_core;

public class Carro3 {
    private String modelo,cor;
    private int preco;

    Carro3(String modelo,String cor,int preco){
        this.modelo=modelo;
        this.cor=cor;
        this.preco=preco;
    }
    //como os atributos sao privador criamos metodos que nos retornem os atributos(getters) e que nos permitam editar/mudar os mesmos(setters)
    //por convencao a nomenclatura e getAtributo, setAtributo
    public String getModelo(){
        return this.modelo;
    }
    public String getCor(){
        return this.cor;
    }
    public int getPreco() {
    return this.preco;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setCor(String cor){
        this.cor=cor;
    }
    public void setPreco(int preco){
        this.preco=preco;
    }

    }

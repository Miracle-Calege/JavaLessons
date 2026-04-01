package Java_core;

public class Car {
    String marca,modelo,cor;
    int ano;

    Car(String marca,String modelo, int ano,String cor) {
    this.marca=marca;
    this.modelo=modelo;
    this.ano=ano;
    this.cor=cor;
    }

    /* por isso que antes de ser modificado ele exibe um hashcode
    public String toString() {
      return getClass().getName()+"@"+Integer.toHexString(hashCode());
}
     */

    @Override
    public String toString(){
        return this.cor +" "+this.ano+" "+this.ano+" "+this.modelo;
    }

}

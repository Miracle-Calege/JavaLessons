package Java_core;

public enum Dias {
        //Por convenção os enum são nomeados com letras maiúsculas e ter um valor associado
    //ex: NOME DO ENUM(Valor);
    DOMINGO(1),SEGUNDA(2),TERCA(3),QUARTA(4),QUINTA(5),SEXTA(6),SABADO(7);

    private final int dayNum;

    Dias(int dayNum){
        this.dayNum=dayNum;
    }

    public int getDayNum(){
        return this.dayNum;
    }

}

package Head_First_Java_3rd;

class cap4_metodos{
    public static void main(String[] args) {
       Snop um=new Snop();
        um.tamanho=70;
        Snop dois=new Snop();
        dois.tamanho=8;
        Snop tres=new Snop();
        tres.tamanho=35;
//        um.latir();//output:woof
//        dois.latir();//output:ruff
//        tres.latir();//output:yip
        um.bark(3);//argumento
        dois.bark(3);
        tres.bark(3);
    }
}

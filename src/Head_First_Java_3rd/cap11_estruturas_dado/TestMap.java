package Head_First_Java_3rd.cap11_estruturas_dado;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();//temos 2 parametros, um para chave e outro para o valor
        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);
        System.out.println(scores);
        System.out.println(scores.get("Bert"));//este metodo pega a chave e retorna o valor
    }
}

//NB:Podemos evitar que uma estrutura seja modificada usando Collections.unmodiafiableTipoEstrutura(estrutura)

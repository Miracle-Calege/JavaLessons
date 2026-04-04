package Java_core;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Aula36_date_time {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();//retorna a data actual
        System.out.println(date);
        LocalTime time= LocalTime.now();//retorna a hora,minutos, segundos actuais
        System.out.println(time);
        LocalDateTime dateTime=LocalDateTime.now();//retorna a data e a hora com um "T" separando a data da hora
        System.out.println(dateTime);

        Instant instant=Instant.now();//retorna o tempo em UTC
        System.out.println(instant);

        //********************Formatando data********************************//

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");//responsavel por formatar a hora
        String newDateTime= dateTime.format(formatter);//formata o retorno do datetime como uma string
        System.out.println(newDateTime);

        //********************************Criando data*********************************//
        LocalDate data=LocalDate.of(2025,04,04);// os argumentos do metodo sao respectivamente ano,mes e dia
        System.out.println(data);
        LocalDateTime dataTempo=LocalDateTime.of(2025,04,04,15,00,00);
        System.out.println(dataTempo);
        LocalDateTime dataTempo2=LocalDateTime.of(2024,04,04,15,00,00);

        //*******************************Comparando data****************************//
        if(dataTempo2.isBefore(dataTempo)){//verifica se uma data foi antes de outra
            System.out.println(dataTempo2 +" "+" esta antes do dia "+dataTempo);
        }else if(dataTempo2.isAfter(dataTempo)){//verifica se uma data foi depois de outra
            System.out.println(dataTempo2 +" "+" esta depois do dia "+dataTempo);
        }else if(dataTempo2.isEqual(dataTempo)){//verifica se uma data e igual a outra
            System.out.println(dataTempo2 +" "+" e igual "+dataTempo);
        }




    }
}

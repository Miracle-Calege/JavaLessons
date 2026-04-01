package JavaSwing;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;

public class Aula26_JFreeChartPieChart extends JFrame {
        DefaultPieDataset<String> dataset;//criamos a  variavel da estrutura que vai armazenar os dados do grafico
        JFreeChart chart;// criamos a variavel responsavel por construir o grafico
        ChartPanel chartPanel;//o painel proprio onde o grafico ficara

        public Aula26_JFreeChartPieChart(){
            setTitle("Grafico");
            setSize(800,600);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            dataset = new DefaultPieDataset<>();//inicializamos a estrutura
            dataset.setValue("Janeiro",208);//colocamos uma String e um quantidade
            dataset.setValue("Fevereiro",150);
            dataset.setValue("Marco",180);
            //titulo do grafico,estrutura de dados,boolean(incluir legenda),boolean(gerar toolTips),boolean(geral url)
            JFreeChart chart = ChartFactory.createPieChart("Vendas mensais",dataset,true,true,false);
            chartPanel=new ChartPanel(chart);//inicializamos o charPanel que levara o chart(grafico) como parametro
            setContentPane(chartPanel);//usamos este metodo para que o painel esta visivel na frame
            setVisible(true);
            /*
            esse diferencia-se dos outros por inves de DefaultCategoryDataset usa  DefaultPieDataset<String>
            hartFactory.createPieChart() e os parametros serem (String,boolean,boolean,boolean,boolean)
             */

        }

    public static void main(String[] args) {
        new Aula26_JFreeChartPieChart();
    }
}

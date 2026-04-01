package JavaSwing;

import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;


public class Aula26_JFreeChartLineChart extends JFrame{
    DefaultCategoryDataset dataset;//criamos a  variavel da estrutura que vai armazenar os dados do grafico
    JFreeChart chart;// criamos a variavel responsavel por construir o grafico
    ChartPanel chartPanel;//o painel proprio onde o grafico ficara

    public Aula26_JFreeChartLineChart(){
        setTitle("Grafico");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        dataset = new DefaultCategoryDataset();//inicializamos a estrutura
        dataset.addValue(200, "Vendas", "Janeio");//adicionamos os valores a estrutura(valor,identificaor da linha,identificador da coluna)
        dataset.addValue(150, "Vendas", "Fevereiro");
        dataset.addValue(180, "Vendas", "Marco");
        dataset.addValue(260, "Vendas", "Abril");
        dataset.addValue(300, "Vendas", "Maio");
        //titulo do grafico,nome do eixo x, nome do eixdo y, estrutura de dados
        JFreeChart chart = ChartFactory.createLineChart("Vendas mensais","Mes","Vendas",dataset);
        chartPanel=new ChartPanel(chart);//inicializamos o charPanel que levara o chart(grafico) como parametro
        setContentPane(chartPanel);//usamos este metodo para que o painel esta visivel na frame
        setVisible(true);

    }

    public static void main(String[] args) {
        new Aula26_JFreeChartLineChart();
    }




}

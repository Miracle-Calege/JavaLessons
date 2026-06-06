package Swing_A_beginners_guide;

/*
Os componentes que veremos neste modulo derivam do JTextComponent e tem metodos comuns.Estes componentes tem uma forte relacao com o cursor que e tratado de caret.
Metodos:
getSelectedText()-> retorna a selecao actual
copy()-> copia para clipboard o texto actualmente selecionado
cut()->copia para clipboard o texto actualmente selecionado e apaga o texto/area do texto selecionada
getCaretPosition()->retorna a posicao do caret(cursor).Retorna o numero de caracteres que o caret esta do inicioo do texto
getDocument()-> retorna o model do documento
getMargin()-> retorna um objecto do tipo Insets com os espacamentos de margem
getSelectionEnd()->retorna a posicao do ultimo caracter selecionado.O valor representa o numero de caracteres que o caracter esta do inicio do texto
getSelectionStart()->retorna a posicao do primeiro caracter selecionado.O valor representa o numero de caracteres que o caracter esta do inicio do texto
geText()-> retorna todo o texto contido no componente
getText(int inicio,int fim)->retorna o texto entre o intervalo dado de caracteres
isEditable()-> retorna true se o texto puder ser editado e false caso contrario
moveCaretPosition(int loc)-> coloca o caret na nova posicao, especificado considerando o numero de caracteres do inicio do texto.O texto entre a posicao actual e a nova posicao sera selecionado
paste()->copia o conteudo do clipboard para o componente.Se o texto no componente tiver sido selecionado entao o conteudo da clipboard  vai substituir o texto selecionad caso contrario o conteudo da clipboard sera inserida imediatamente antes do caret
read(Reader input,Object what)->copia data do input para o componente.O valor do "what" descreve o input stream
select(int inicio, int fim)->seleciona o texto entre o inicio e o fim.
selectAll()->selecionado todo o texto no componente
setCaretPosition(int loc)-> coloca o caret  na posicao loc
setEditable(boolean val)-> determinar se o texto e editavel(true) ou legivel apenas(false)
setMargin(instets margens)-> coloca margens no texto
setText(String texto)->coloca a texto no componente
write(Writer output)->converte o conteudo do componente no stream especificado.
getDot()->retorna a posicao actual do caret
getMark()-> retorna o ponto inicial da selecao
O gestor de eventos e:
addCaretListener(CaretListener cl)->adiciona listener ao caret


********************************JTextField*********************************
Constructores:
JTextField()->cria um textfield vazio
JTextField(int colunas)-> cria um textfield vazio com a largura especificada
JTextField(String str)-> cria um textfield com a texto(NB:Vai cria um textfield com a largura correspondente a do texto)
JTextField(String str, int colunas)-> cria um textfield com o texto e a largura especificada
JTextField(Document model,String str,int colunas)->cria o textfield que usa o modelo especificado pelo model,coloca a string e determina a largura

O JTextField implementa o ActionLister.

Metodo:

setFont(Font font)->determina a fonte usado no texto
getFont()-> retorna a fonte do texto

Criacao de uma fonte:
Font(String nomeFonte,int estiloFonte,int tamanho);
estilo de fonte pode ser: Font.PLAIN, Font.BOLD, Font.ITALIC



 */


import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modulo6_JTextField {
    JLabel labAll,labSelected;
    JTextField jtf;
    JButton cut,paste;

    public Modulo6_JTextField(){
        JFrame jf=new JFrame("JTextField");
        jf.setLayout(new FlowLayout());
        jf.setSize(200,150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labAll=new JLabel("Todo texto:");
        labSelected=new JLabel("Selected text: ");
        jtf=new JTextField("Este e o texto.", 15);//criamos um textfield com o texto especificado e o numero de coluna(tamanho)
        jtf.setFont(new Font("monospaced",Font.PLAIN,20));//determinamos a fonte do texto que sera colocado no JTextField
        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labAll.setText("Todo texto: "+jtf.getText());//quando o enter for pressionado com o cursor na field o label vai ter o texto que estava na field
                labSelected.setText("Texto Selecionado:"+jtf.getSelectedText());//quando o enter for pressionado o texto selecionado vai tambem estar na label
            }
        });
        cut=new JButton("cut");
        paste=new JButton("Paste");
        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtf.cut();//vai "cortar" o texto selecionado
                labAll.setText("Todo texto: "+jtf.getText());
                labSelected.setText("Texto selecionado: "+jtf.getSelectedText());
            }
        });

        paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtf.paste();//coloca no componente o texto do clipboard
            }
        });
        jtf.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {//sempre o caret mudar de posicao as instrucoes abaixo vao ser executada
                labAll.setText("Todo texto: "+jtf.getText());
                labSelected.setText("O texto selecionado :"+jtf.getSelectedText());
            }
        });
        jf.add(jtf);
        jf.add(cut);
        jf.add(paste);
        jf.add(labAll);
        jf.add(labSelected);
    jtf.setCaretPosition(5);//coloca o caret no 5 caracter
    jtf.moveCaretPosition(7);//move o caret para o 7 caracter .Seleciona o texto entre o 5 e 7 caracter
    jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo6_JTextField();
            }
        });
    }

}

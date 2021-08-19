import javax.swing.JOptionPane;

public class IfSimples {
    public static void main (String[]args){
        //cada primitivo tem uma classe empacotadora associada
        //byte: Byte
        //int: Integer
        //short: Short
        //long: Long
        //char: Character
        //float: Float
        //double: Doublec

        //System.out.println ("Hello, World!");
        //float nota;
        float nota;
        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite uma nota:"));
        if (nota >= 70)
            JOptionPane.showMessageDialog(null, "Aprovado");
        else
            JOptionPane.showMessageDialog(null, "Reprovado");
        
        
    }

}

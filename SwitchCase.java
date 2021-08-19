import javax.swing.JOptionPane;

public class SwitchCase {
    
    public static void main(String[] args) {
        String conceito;
        conceito = JOptionPane.showInputDialog("Qual foi o seu conceito?");
        
        switch (conceito){

            case "A":
                JOptionPane.showMessageDialog(null, "Excelente!");
                break;
            case "B":
                JOptionPane.showMessageDialog(null, "Muito bom!");
                break;
            case "C":
                JOptionPane.showMessageDialog(null, "Regular!");
            case "R":
                JOptionPane.showMessageDialog(null, "Tente novamente!");
            default:
                JOptionPane.showMessageDialog(null, "Conceito inválido!");
        }
    }
}

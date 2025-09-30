package exercicis;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


  

public class VentanaPersonalizada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float preuHora=10.50f;
		
		JFrame ventana=new JFrame("Ventana personalizada");
			ventana.setSize(800, 500); 
	        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	        ventana.setLocationRelativeTo(null); 

        JPanel panel=new JPanel();
        	panel.setBackground(Color.CYAN); 
        	panel.setLayout(null); 

        JLabel dies=new JLabel("Dies treballat:");
        	dies.setFont(new Font("Arial", Font.BOLD, 30));
        	dies.setBounds(100, 100, 200, 30);
        JTextField campoTexto=new JTextField();
        	campoTexto.setColumns(5);
        	campoTexto.setBounds(450, 100, 200, 30);
        	
        JLabel hores=new JLabel("Hores treballades?");
        	hores.setFont(new Font("Arial", Font.BOLD, 30));
        	hores.setBounds(100, 200, 300, 30);
        JTextField campoTexto2=new JTextField();
        	campoTexto2.setColumns(5);
        	campoTexto2.setBounds(450, 200, 200, 30);
        	
        JButton boton=new JButton("Sou");
        	boton.setBounds(450, 300, 200, 30);
        	boton.setFont(new Font("Arial", Font.BOLD, 15));
        	boton.addActionListener(e -> {
        		try {
        			int diesTreballat=Integer.parseInt(campoTexto.getText());
        			int horesPerDia=Integer.parseInt(campoTexto2.getText());
        			float sou=preuHora*diesTreballat*horesPerDia;
        			JOptionPane.showMessageDialog(null, "Sou total: "+sou+" €");
        	        System.out.println("Sou calculat: "+sou+" €");
        		 } catch (NumberFormatException ex){
        			 JOptionPane.showMessageDialog(null, "Si us plau introdueix números vàlids.", null, JOptionPane.ERROR_MESSAGE);
        		   }
        	});
        	
        panel.add(dies);
        panel.add(boton);
        panel.add(hores);
        panel.add(campoTexto);
        panel.add(campoTexto2);
        ventana.add(panel);
        ventana.setVisible(true);
    }
}
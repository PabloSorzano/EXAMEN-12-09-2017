/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_app_apm_sorzanotorrespablo_5im6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Alumno
 */
public final class examen1_App_Apm_SorzanoTorresPablo_5IM6 extends JFrame implements ActionListener {
    JTextField numero;
    float resultado;
    JPanel numeros, botones;
    JButton uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, punto, ce, convertir;
    
    /**
     *
     */
    public examen1_App_Apm_SorzanoTorresPablo_5IM6(){
        iniciarVentana();
        Convertidor();
    }

    /**
     *
     */
    public void iniciarVentana(){
        this.setSize(500, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
     }
     
    /**
     *
     */
    public void Convertidor(){
         numero =  new JTextField();
         numero.setBounds(0, 0, 500, 100);
         numero.addActionListener(this);
         numero.setVisible(true);
         numero.setFocusable(false);
         this.add(numero);
         
         nueve = new JButton("9");
         nueve.setBounds(0, 110, 70, 70);
         nueve.addActionListener(this);
         nueve.setVisible(true);
         this.add(nueve);
         
         ocho = new JButton("8");
         ocho.setBounds(70, 110, 70, 70);
         ocho.addActionListener(this);
         ocho.setVisible(true);
         this.add(ocho);
         
         siete = new JButton("7");
         siete.setBounds(140, 110, 70, 70);
         siete.addActionListener(this);
         siete.setVisible(true);
         this.add(siete);
         
         seis = new JButton("6");
         seis.setBounds(0, 180, 70, 70);
         seis.addActionListener(this);
         seis.setVisible(true);
         this.add(seis);
         
         cinco = new JButton("5");
         cinco.setBounds(70, 180, 70, 70);
         cinco.addActionListener(this);
         cinco.setVisible(true);
         this.add(cinco);
         
         cuatro = new JButton("4");
         cuatro.setBounds(140, 180, 70, 70);
         cuatro.addActionListener(this);
         cuatro.setVisible(true);
         this.add(cuatro);
         
         tres = new JButton("3");
         tres.setBounds(0, 250, 70, 70);
         tres.addActionListener(this);
         tres.setVisible(true);
         this.add(tres);
         
         dos = new JButton("2");
         dos.setBounds(70, 250, 70, 70);
         dos.addActionListener(this);
         dos.setVisible(true);
         this.add(dos);
         
         uno = new JButton("1");
         uno.setBounds(140, 250, 70, 70);
         uno.addActionListener(this);
         uno.setVisible(true);
         this.add(uno);
         
         cero = new JButton("0");
         cero.setBounds(0, 320, 70, 70);
         cero.addActionListener(this);
         cero.setVisible(true);
         this.add(cero);
         
         punto = new JButton(".");
         punto.setBounds(70, 320, 70, 70);
         punto.addActionListener(this);
         punto.setVisible(true);
         this.add(punto);
         
         ce = new JButton("CE");
         ce.setBounds(280, 110, 150, 150);
         ce.addActionListener(this);
         ce.setVisible(true);
         this.add(ce);
         
         convertir = new JButton("Convertir");
         convertir.setBounds(280, 250, 150, 150);
         convertir.addActionListener(this);
         convertir.setVisible(true);
         this.add(convertir);
     }
    /**
     * 
     * 
     * @param e
     */
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==convertir){
            if(numero.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Ingrese un numero por favor");
            }else{
                resultado= Float.parseFloat(numero.getText())/19;
                numero.setText("");
                numero.setText(" $ "+resultado);
            }
        }else if(e.getSource()==uno){
            numero.setText(numero.getText()+uno.getText());
        }else if(e.getSource()==dos){
            numero.setText(numero.getText()+dos.getText());
        }else if(e.getSource()==tres){
            numero.setText(numero.getText()+tres.getText());
        }else if(e.getSource()==cuatro){
            numero.setText(numero.getText()+cuatro.getText());
        }else if(e.getSource()==cinco){
            numero.setText(numero.getText()+cinco.getText());
        }else if(e.getSource()==seis){
            numero.setText(numero.getText()+seis.getText());
        }else if(e.getSource()==siete){
            numero.setText(numero.getText()+siete.getText());
        }else if(e.getSource()==ocho){
            numero.setText(numero.getText()+ocho.getText());
        }else if(e.getSource()==nueve){
            numero.setText(numero.getText()+nueve.getText());
        }else if(e.getSource()==cero){
            numero.setText(numero.getText()+cero.getText());
        }else if(e.getSource()==punto){
            numero.setText(numero.getText()+punto.getText());
        }else if(e.getSource()==ce){
            
            numero.setText("");
            
        }
    }
    
}

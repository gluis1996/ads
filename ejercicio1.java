package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class ejercicio1 {

    public static void main(String[] args) {
        double nota1,nota2,nota3;
        double promedio;
        String estado;
        nota1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota"));
        nota2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota"));
        nota3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota"));
        promedio=(nota1+nota2+nota3)/3;
        
       if(promedio>15)
       {
           promedio=promedio+2;
       }
       
       if(promedio>13)
       {
           estado="APROBADO";
       } 
       
       else
       {
               estado="DESAPROBADO";
       }
       
       JOptionPane.showMessageDialog(null,"El promedio del alumno es "+promedio);
       JOptionPane.showMessageDialog(null,"El estado del alumno es "+estado);
    }
}

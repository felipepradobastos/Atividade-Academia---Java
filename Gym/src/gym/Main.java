/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Atlete felipe = new Atlete();
        Plan standart = new Plan();
        Plan advanced = new Plan();
        Plan ultra = new Plan();
        advanced.setDays(180);
        advanced.setPeriod("Initerrupto");
        advanced.setPrice(380);
        ultra.setDays(360);
        ultra.setPeriod("Initerrupto");
        ultra.setPrice(550);
        standart.setDays(30);
        standart.setPeriod("Matinal");
        standart.setPrice(70);
        
        felipe.setAge(18);
        felipe.setCpf("123456789");
        felipe.setDeficience(false);
        felipe.setName("Felipe Prado Bastos");
        //Escolha do plano:
        Object [] opcoes = {"Plano Mensal","Plano Trimestral","Plano Anual"};
        String option = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Plano", JOptionPane.PLAIN_MESSAGE, null, opcoes, "Plano Mensal");
        
        if(option.equals("Plano Mensal")){
            felipe.setPlan(standart);
        }
        if(option.equals("Plano Trimestral")){
            felipe.setPlan(advanced);
        }
        if(option.equals("Plano Anual")){
            felipe.setPlan(ultra);
        }
        System.out.println("Plano de "+felipe.getName()+":\nDuração:"+felipe.getPlan().getDays()+"\nPeriodo:"+felipe.getPlan().getPeriod()+"\nPreço:"+felipe.getPlan().getPrice());
        
        
    }
    
}

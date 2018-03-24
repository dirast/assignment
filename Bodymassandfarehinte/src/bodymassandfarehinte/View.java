/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bodymassandfarehinte;

/**
 *
 * @author Hp
 */
import java.awt.event.ActionListener;
import javax.swing.*;
  


public class View extends JFrame {
    private JTextField weight = new JTextField(10);
    
    private JTextField height = new JTextField(10);
    private JLabel calcSolution = new JLabel("");
    private JButton calculateButton = new JButton("Bodymass Index");
    private JLabel WeightText = new JLabel("weight");
    private JLabel HeightText = new JLabel("height");
     
  public  View(){
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);
         calcPanel.add(WeightText);
        calcPanel.add(weight);
         calcPanel.add(HeightText);
       
        calcPanel.add(height);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
       
        this.add(calcPanel);
        
        
       
    }
    public int getFirstNumber(){
        return Integer.parseInt(weight.getText());
        
    }
    public int getSecondNumber(){
        return Integer.parseInt(height.getText());
        
    }
    public int getCalcSolution(){
        return Integer.parseInt(calcSolution.getText());
        
    }
    public void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
        
    }
    void addCalculationListener(ActionListener listenerForCalcButton){
        calculateButton.addActionListener(listenerForCalcButton);
    
}
     
    
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }

   
}

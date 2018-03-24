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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Controller  {
    private View theView;
    private Model theModel;
    public Controller( View theView, Model theModel){
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculationListener(new CalculateListener());
       
        
    }

    class CalculateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int weight, height=0;
            try{
                weight = theView.getFirstNumber();
                height = theView.getSecondNumber();
                theModel.Bodymass(weight, height);
                
               theView.setCalcSolution(theModel.getCalculationValue());
            }
            catch(NumberFormatException ex){
                    theView.displayErrorMessage("you need to enter a number");
                    }
           
       

    }
    }
}
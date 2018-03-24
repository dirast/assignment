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
public class Model {
     private int calculationValue;
    
    public void Bodymass(int weight, int height){
        calculationValue = weight/ (height*height);
    }
    public int getCalculationValue(){
        return calculationValue;
    }
    public void subTwoNumbers(int firstNumber,int secondNumber){
        calculationValue =firstNumber - secondNumber;
    }
    
}

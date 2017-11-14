/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author all
 */
public class ModelDesigner extends ModelEmployee {

    int bonus;

    public ModelDesigner() {
        this.bonus=50000;
    }

    public void bonusDesigner() {
        System.out.println("Salary Employee Designer = " + super.salary);
        System.out.println("Bonus Designer = "+bonus);
    }
}

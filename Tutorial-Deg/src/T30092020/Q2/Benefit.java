/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T30092020.Q2;

/**
 *
 * @author CCK
 */
public class Benefit {

    String healthInsurance;
    Double lifeInsurance;
    int vacation;

    public Benefit() {
    }

    public Benefit(String healthInsurance, Double lifeInsurance, int vacation) {
        this.healthInsurance = healthInsurance;
        this.lifeInsurance = lifeInsurance;
        this.vacation = vacation;
    }

    public String getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(String healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public Double getLifeInsurance() {
        return lifeInsurance;
    }

    public void setLifeInsurance(Double lifeInsurance) {
        this.lifeInsurance = lifeInsurance;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    public void displayBenefit() {
        System.out.println(
                "Life Insurance :" + this.lifeInsurance
                + " Health Insurance : " + this.healthInsurance
                + " Vacation :" + this.vacation
        );
    }

}

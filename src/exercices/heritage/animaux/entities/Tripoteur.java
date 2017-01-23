/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage.animaux.entities;

/**
 *
 * @author francois-flachet
 */
public class Tripoteur {

    public void tripote(Animal animal) {

        System.out.println(this.getClass().getSimpleName() + " "
                + this.getClass().getDeclaredMethods()[0].getName() + " "
                + animal.getClass().getSimpleName());
        animal.emettreSon();
        System.out.println(this.getClass().getSimpleName() + " Force "
                + animal.getClass().getSimpleName());
        animal.son = "hurle";
    }
}

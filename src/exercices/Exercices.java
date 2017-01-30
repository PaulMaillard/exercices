/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import exercices.core.Application;
import exercices.recursivité.suites.fibonacci.SuiteFibo;

/**
 *
 * @author francois-flachet
 */
public class Exercices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application exo1 = new SuiteFibo();
        exo1.start();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.recursivité.suites.entier;

import exercices.core.Application;
import exercices.recursivité.suites.interfaces.SuitesInterface;

/**
 *
 * @author paul-maillard
 */
public class SuiteEntier extends Application implements SuitesInterface{

    @Override
    public void start() {
        suite(0);
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int suite(int n) {
        System.out.println(n);
        if(n < 300){
            suite(n+1);
        
        }
        return 0;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.recursivité.suites.fibonacci;

import exercices.core.Application;
import exercices.recursivité.suites.interfaces.SuitesInterface;

/**
 *
 * @author paul-maillard
 */
public class SuiteFibo extends Application implements SuitesInterface {
    public int max = 23;
    public int prc = 0;
    @Override
    public void start() {
        suite(1);
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int suite(int n){
        max--;
        System.out.println(prc);
        
        if(max > 0){
            int tmp = n + prc;
        prc = n;
            suite(tmp);
        }
        return 0;
    }
}
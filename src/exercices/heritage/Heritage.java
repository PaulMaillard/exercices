/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage;

import exercices.core.Application;
import exercices.heritage.animaux.entities.Animal;
import exercices.heritage.heritage.animaux.impl.Chat;
import exercices.heritage.heritage.animaux.impl.Chien;

/**
 *
 * @author francois-flachet
 */
public class Heritage extends Application {

    @Override
    public void start() {
        Animal dog = new Chien(); 
        Animal cat = new Chat();
        
        dog.emettreSon();
        cat.emettreSon();
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

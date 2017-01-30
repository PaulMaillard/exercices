/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage;

import exercices.core.Application;
import exercices.heritage.animaux.entities.Animal;
import exercices.heritage.animaux.entities.Tripoteur;
import exercices.heritage.animaux.entities.impl.Chat;
import exercices.heritage.animaux.entities.impl.Chien;
import exercices.heritage.meubles.entities.Meuble;
import exercices.heritage.meubles.entities.impl.Table;

/**
 *
 * @author paul-personne
 * 
 * Une classe est un modèle sur lequel on va se baser pour créer des objets.
 * Cette classe correspond à l'exercice héritage. Elle étend la classe 
 * Application qui nous oblige à implémenter les méthodes abstraites.
 */
public class Heritage extends Application {

    /** La méthode start() a été implémentée à partir de la méthode abstraite 
     * définie dans Application. On a écrit ce que la méthode start() doit faire */
    @Override
    public void start() {
        // On instancie deux animaux, un meuble et un tripoteur
        Animal dog = new Chien();
        Animal cat = new Chat();
        Meuble table1 = new Table();
        Tripoteur loic = new Tripoteur();
        //On invoque la méthode tripote() sur le tripoteur en passant en argument nos instances
        loic.tripote(dog);
        loic.tripote(cat);
        loic.tripote(table1);
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

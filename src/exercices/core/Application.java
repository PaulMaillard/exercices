/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.core;

/**
 *
 * @author paul-personne
 * 
 * La classe est abstraite, on ne pourra pas créer d'objet à partir d'elle uniquement.
 * Elle implémente ApplicationInterface qui nous oblige a utiliser les méthodes abstraites.
 * Puisque on ne peut pas instancier cette classe, on a pas besoin d'implémenter la méthode.
 * On va laisser le soin aux classes concrêtes de les implémenter.
 */
public abstract class Application implements ApplicationInterface {
    
}

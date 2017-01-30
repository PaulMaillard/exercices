/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.core;

/**
 * L'interface est un contrat sur lequel s'appuie un objet. Dans une interface
 * nous ne déclarons que des méthodes abstraites, il n'y a aucune propritété
 * dans une interface, ce n'est pas un objet.
 * Nous pouvons typer des objets avec les interfaces.
 * @author paul-personne
 */
public interface ApplicationInterface {
    /** Nous permet de lancer l'exercice. Cette méthode selon l'exercice 
     * ne se déroule pas de la même façon. Nous avons besoin de la redéfinir.
     */
    public void start();
    public void create();
}

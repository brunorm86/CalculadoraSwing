/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612;

import javax.swing.JFrame;

/**
 *
 * @author martin.vigil
 */
public class Moldura extends JFrame {
    public Moldura(){
        super();
        Controle controle = new Controle();
        this.add(new Painel(controle));
        this.pack();
        this.show();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import java.text.ParseException;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
        } catch (ParseException | UnsupportedLookAndFeelException e) {
        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Masuk msk = new Masuk();
                msk.setVisible(true);
            }
        });
    }

}

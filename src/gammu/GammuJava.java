/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gammu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Babeu
 */
public class GammuJava {
    public static void eksekusi(String perintah){
        
        System.out.println(perintah);
        Runtime run = Runtime.getRuntime();
        Process pr = null;
        try {
            pr = run.exec(perintah);
            pr.waitFor();
            
        } catch (IOException ioe){
            ioe.printStackTrace();
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        
        BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line = "";
        try {
            while ( (line = buf.readLine()) !=null){
                System.out.println(line);
            }
        } catch (IOException ioe ){
            ioe.printStackTrace();
        }
    }
    
}

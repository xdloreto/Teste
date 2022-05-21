/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_poo_ifg;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 *
 * @author Gustavo Loreto
 */
public class LerArquivos {
    private static String str = null;
    
    public static String Ler(String path) {
        Path diretorio = Paths.get(path);
        try {
         byte[] leitura = Files.readAllBytes(diretorio);
         str = new String(leitura);
         
            
         /*JOptionPane.showMessageDialog(null, str);*/
        } catch (Exception erro) {
        }
        return str;
        
    }
}
      
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.Archivos;
import examen.Preguntas;
import java.io.Serializable;   
import java.io.File;              // |-> Opcional
import java.io.FileInputStream;   // |\  Esto es
import java.io.IOException;
import java.io.ObjectInputStream; // |/  Obligatorio
import java.util.ArrayList;
/**
 *
 * @author eder0
 */
public class ler implements Serializable {
    private  ArrayList<Preguntas> o;
    



public ArrayList<Preguntas> leer(File m){
    ObjectInputStream ois;
    
    try{
        ois=new ObjectInputStream(new FileInputStream(m));
        o=(ArrayList<Preguntas>)ois.readObject();
        

    }catch(ClassNotFoundException a){    
    }catch(IOException a){
    }
     return o;
}
}
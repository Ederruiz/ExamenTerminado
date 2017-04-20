/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.Archivos;

import examen.Preguntas;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author eder0
 */
public class Guardar {
    private Preguntas m;
    private File archivo;
    
    public void guardar( ArrayList<Preguntas> a ){
    
    ObjectOutputStream oos;
    
        setArchivo(new File("Preguntas"));
    
    try{
        oos=new ObjectOutputStream(new FileOutputStream(getArchivo()));
        oos.writeObject(a);
        oos.close();
        
    }catch(IOException e){   
    }
    
    
  
}

    /**
     * @return the m
     */
    public Preguntas getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(Preguntas m) {
        this.m = m;
    }

    /**
     * @return the archivo
     */
    public File getArchivo() {
        return archivo;
    }

    /**
     * @param archivo the archivo to set
     */
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
}


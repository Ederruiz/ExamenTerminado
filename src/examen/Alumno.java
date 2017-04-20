/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author eder0
 */
public class Alumno {
    private String nom;
    private String matri;
    private String materia;
    public Alumno(String a,String b,String c){
        nom=a;
        matri=b;
        materia=c;
    }

    /**
     * @return the nom
     */
    @Override
    public String toString(){
        return nom+" "+matri+" "+materia;
    }
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the matri
     */
    public String getMatri() {
        return matri;
    }

    /**
     * @param matri the matri to set
     */
    public void setMatri(String matri) {
        this.matri = matri;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
}

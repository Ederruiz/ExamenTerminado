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
public class Examen {
    private String materia;
    private String tipodeexamen;
    private String carrera;
    private Integer totalpregun;
    private Integer pregapli;
    Examen() {
         
    }
   

    /**
     * @param args the command line arguments
     */
    

    
    

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

    /**
     * @return the tipodeexamen
     */
    public String getTipodeexamen() {
        return tipodeexamen;
    }

    /**
     * @param tipodeexamen the tipodeexamen to set
     */
    public void setTipodeexamen(String tipodeexamen) {
        this.tipodeexamen = tipodeexamen;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the totalpregun
     */
    public Integer getTotalpregun() {
        return totalpregun;
    }

    /**
     * @param totalpregun the totalpregun to set
     */
    public void setTotalpregun(Integer totalpregun) {
        this.totalpregun = totalpregun;
    }

    /**
     * @return the pregapli
     */
    public Integer getPregapli() {
        return pregapli;
    }

    /**
     * @param pregapli the pregapli to set
     */
    public void setPregapli(Integer pregapli) {
        this.pregapli = pregapli;
    }
    
    @Override
        public String toString(){
        
        
        return materia+" "+tipodeexamen+" "+ carrera +" "+ totalpregun+" "+ pregapli;
    }
    
}

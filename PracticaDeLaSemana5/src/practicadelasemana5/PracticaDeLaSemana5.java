/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicadelasemana5;

/**
 *
 * @author sazaf
 */
public class PracticaDeLaSemana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carro Mercedes = new Carro();
        Carro Toyota = new Carro();
        Carro BMW = new Carro();
        Chofer IDOLO = new Chofer();
        
        Mercedes.marca = "Mercedes Benz";
        Mercedes.Tipodeconsumo= "Gasolina";
        Mercedes.modelo = "MERCEDES-BENZ C 43 AMG";
        
        Toyota.marca = "Toyota porque papi es papi";
        Toyota.Tipodeconsumo= "Electrico";
        Toyota.modelo = "BZ4X";
        
        BMW.marca = "BMW";
        BMW.Tipodeconsumo= "Hibrido";
        BMW.modelo = "sedán 330e";
        
        IDOLO.Nombre= "Roberto";
        IDOLO.Sexo= "Hombre";
        IDOLO.TipodeTrabajador= "Publico pero saber manejar cualquier carro";
        IDOLO.edad= 50;
        
        
     
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author javie
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        adminHotel AH = new adminHotel();
        AH.CrearHabitaciones();
        AH.PaquetesPredeterminados();
        AH.menu();
    }
    
}

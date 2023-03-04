/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ambitosyvisibilidad;

/**
 *
 * @author skril
 */
public class CocheCambioManual extends Coche {

    //Debemos crear un constructor que llame al constructor de la superclase
    public CocheCambioManual(String matricula) {
        super(matricula);
    }

    public void cambiarMarcha(int marcha) throws Exception {
        if (marcha < 0) {
            throw new Exception("La marcha no puede ser negativa");
        } else {
            this.marcha = marcha;
        }

    }
}

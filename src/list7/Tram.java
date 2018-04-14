/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list7;

/**
 *
 * @author MJOdorczuk
 */
public class Tram extends Vehicle{
    
    public Tram(Double power, Integer seats, String plate) {
        super(power, seats, plate);
    }
    
    @Override
    public String toString()
    {
        return "Dut! Duut! Rrring!";
    }
    
}

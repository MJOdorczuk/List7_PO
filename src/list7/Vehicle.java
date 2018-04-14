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
public class Vehicle {
    
    private Double power;
    private Integer seats;
    private String plate;

    public Vehicle(Double power, Integer seats, String plate) {
        this.power = power;
        this.seats = seats;
        this.plate = plate;
    }

    public Double getPower() {
        return power;
    }

    public Integer getSeats() {
        return seats;
    }

    public String getPlate() {
        return plate;
    }
    
    public void reregister(String plate)
    {
        this.plate = plate;
    }
    
    public void tune(Double scale)
    {
        this.power *= scale;
    }
    
    @Override
    public String toString()
    {
        return "Vehicle";
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
    
}

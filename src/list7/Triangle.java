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
public class Triangle extends Figure{
    
    public Triangle(Double x, Double y, Double z, Double size) {
        super(x, y, z, size);
    }
    
    @Override
    public String toString()
    {
        return "Triangle";
    }
    
}

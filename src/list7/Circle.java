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
public class Circle extends Figure{
    
    public Circle(Double x, Double y, Double z, Double size) {
        super(x, y, z, size);
    }
    
    @Override
    public String toString()
    {
        return "Circle";
    }
    
}

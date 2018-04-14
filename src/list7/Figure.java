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
public class Figure{

    
    private Double x, y, z;
    private Double size;

    public Figure(Double x, Double y, Double z, Double size) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.size = size;
    }
    
    public void translate(Double x, Double y, Double z)
    {
        this.x+=x;
        this.y+=y;
        this.z+=z;
    }
    
    public void resize(Double scale)
    {
        this.size*=scale;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Double getZ() {
        return z;
    }

    public Double getSize() {
        return size;
    }
    
    @Override
    public String toString()
    {
        return "Figure";
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public void setSize(Double size) {
        this.size = size;
    }
    
}

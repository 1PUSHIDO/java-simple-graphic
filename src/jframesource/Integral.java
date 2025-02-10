/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframesource;

/**
 *
 * @author user
 */
public class Integral {
    private double result = 0.0;
    
    public Integral() { }
   
    public double GetResult(double low, double high, double step) {
        result = 0.0;
        
        for (double x = low; x < high; x += step)
            result += Math.exp(-x) * step;
        
        return result;
    }
}

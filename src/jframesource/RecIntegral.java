/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframesource;

/**
 *
 * @author user
 */
public class RecIntegral {
    private double result = 0.0, low = 0.0, high = 0.0, step = 0.0;
    
    public RecIntegral() { }
    
    public RecIntegral(double low, double high, double step) throws NewException {
        // Проверка на вхождение в разрешенный диапазон
        if (low >= 0.000001 && low <= 1000000 ||
                high >= 0.000001 && high <= 1000000 ||
                step >= 0.000001 && low <= 1000000) {
            this.low = low;
            this.high = high;
            this.step = step;
            this.result = 0.0;
        }
        else
            // Исключение
            throw new NewException("Одно из чисел находится вне разрешенного диапазона [0.000001;1000000]");
    }
   
    public double CalculateResult() {
        result = 0.0;
        
        for (double x = low; x < high; x += step)
            result += Math.exp(-x) * step;
        
        return result;
    }
}

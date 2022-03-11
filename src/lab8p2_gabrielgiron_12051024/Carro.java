/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_gabrielgiron_12051024;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Galex
 */
public class Carro implements Serializable{
    private int NumID;
    private String Corredor;
    private Color color;
    private int Distancia = 0;

    public Carro(int NumID, String Corredor, Color color) {
        this.NumID = NumID;
        this.Corredor = Corredor;
        this.color = color;
    }

    public int getNumID() {
        return NumID;
    }

    public void setNumID(int NumID) {
        this.NumID = NumID;
    }

    public String getCorredor() {
        return Corredor;
    }

    public void setCorredor(String Corredor) {
        this.Corredor = Corredor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    @Override
    public String toString() {
        return NumID+"";
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author jgc_
 */
public class Rebel {
    private String planet;
    private String name;
    private Date date;
    
    public Rebel() {
    }

    public Rebel(String name, String planet) {
        this.planet = planet;
        this.name = name;
        this.date = new Date();
    }
    
    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Rebeld{" + "planet=" + planet + ", name=" + name + ", date=" + date + '}';
    }
    
}

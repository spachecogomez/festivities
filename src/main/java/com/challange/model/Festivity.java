/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.challange.model;

import java.util.Date;

/**
 *
 * Class used to represent a festivity 
 * 
 * @author sebpache
 * @version 1.0
 * @since Oct 28 , 2015
 */
public class Festivity {
    
    private String name;
    
    private Date startDate;
    
    private Date endDate;
    
    private String placeCelebrated;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the placeCelebrated
     */
    public String getPlaceCelebrated() {
        return placeCelebrated;
    }

    /**
     * @param placeCelebrated the placeCelebrated to set
     */
    public void setPlaceCelebrated(String placeCelebrated) {
        this.placeCelebrated = placeCelebrated;
    }  
    
}

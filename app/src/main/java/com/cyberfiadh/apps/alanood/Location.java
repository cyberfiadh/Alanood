package com.cyberfiadh.apps.alanood;

/**
 * Created by fiadh on 3/2/15.
 */
public class Location {
    private String strID;
    private String strName;
    private String strDescription;
    private String strAddress;
    private int intLong;
    private int intLat;

    public int getIntLat() {
        return intLat;
    }

    public void setIntLat(int intLat) {
        this.intLat = intLat;
    }

    public int getIntLong() {
        return intLong;
    }

    public void setIntLong(int intLong) {
        this.intLong = intLong;
    }

    public String getStrAddress() {
        return strAddress;
    }

    public void setStrAddress(String strAddress) {
        this.strAddress = strAddress;
    }

    public String getStrDescription() {
        return strDescription;
    }

    public void setStrDescription(String strDescription) {
        this.strDescription = strDescription;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrID() {
        return strID;
    }

    public void setStrID(String strID) {
        this.strID = strID;
    }
}

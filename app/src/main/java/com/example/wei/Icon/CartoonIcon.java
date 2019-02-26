package com.example.wei.Icon;

/**
 * Created by wei on 2019/1/7.
 */

public class CartoonIcon {

    private int iId;
    private String iName;
    public CartoonIcon(int iId, String iName){
        setiId(iId);
        setiName(iName);
    }

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }
}

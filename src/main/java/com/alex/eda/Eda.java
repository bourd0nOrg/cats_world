package com.alex.eda;

/**
 * Created by Студент on 20.04.2016.
 */
public class Eda implements Est {

    protected boolean isEst;

    public Eda() {this.isEst = true;}

    public void netu(){this.isEst = false;}

    public boolean isEst() {return isEst; }
}

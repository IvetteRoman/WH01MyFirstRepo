/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author User
 */
public class AntEater {
    private Cell position;
    private int antEaterCounter;
    private int runCounter;
    private enum state{hunry,asleep};

    public void run(){
        
    }

    /**
     * @return the position
     */
    public Cell getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Cell position) {
        this.position = position;
    }

    /**
     * @return the antEaterCounter
     */
    public int getAntEaterCounter() {
        return antEaterCounter;
    }

    /**
     * @param antEaterCounter the antEaterCounter to set
     */
    public void setAntEaterCounter(int antEaterCounter) {
        this.antEaterCounter = antEaterCounter;
    }

    /**
     * @return the runCounter
     */
    public int getRunCounter() {
        return runCounter;
    }

    /**
     * @param runCounter the runCounter to set
     */
    public void setRunCounter(int runCounter) {
        this.runCounter = runCounter;
    }

    @Override
    public String toString() {
        return "AntEater{" + "position=" + position + ", antEaterCounter=" + antEaterCounter + ", runCounter=" + runCounter + '}';
    }

}

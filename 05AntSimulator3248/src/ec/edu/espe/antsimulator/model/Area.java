/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class Area {

    private int height;
    private int width;
    private int initNumberOfFoodFiles;
    private int tickDuration;
    private String name;
    private boolean busy;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    void setup() {

    }

    void add(Colony colony) {

    }

    void add(AntEater anteater) {

    }

    boolean isAnyFoodRemaining() {

        return true;
    }

    Cell getCell(int row, int col) {
        Cell cell = new Cell();
        return cell;

    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the initNumberOfFoodFiles
     */
    public int getInitNumberOfFoodFiles() {
        return initNumberOfFoodFiles;
    }

    /**
     * @param initNumberOfFoodFiles the initNumberOfFoodFiles to set
     */
    public void setInitNumberOfFoodFiles(int initNumberOfFoodFiles) {
        this.initNumberOfFoodFiles = initNumberOfFoodFiles;
    }

    /**
     * @return the tickDuration
     */
    public int getTickDuration() {
        return tickDuration;
    }

    /**
     * @param tickDuration the tickDuration to set
     */
    public void setTickDuration(int tickDuration) {
        this.tickDuration = tickDuration;
    }

    @Override
    public String toString() {
        return "Area{" + "height=" + height + ", width=" + width + ", initNumberOfFoodFiles=" + initNumberOfFoodFiles + ", tickDuration=" + tickDuration + ", name=" + name + ", busy=" + busy + '}';
    }

    public Area() {
        width = 20;
        height = 20;        
        initNumberOfFoodFiles = 1;
        tickDuration = 1000;
        name = "Area 01";
        busy = true;
    }

    public Area(int height, int width, int initNumberOfFoodFiles, int tickDuration, String name, boolean busy) {
        this.height = height;
        this.width = width;
        this.initNumberOfFoodFiles = initNumberOfFoodFiles;
        this.tickDuration = tickDuration;
        this.name = name;
        this.busy = busy;
    }
    
}

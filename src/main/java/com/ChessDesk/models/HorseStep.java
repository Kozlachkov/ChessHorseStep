package com.ChessDesk.models;

public class HorseStep {
    private Byte x;
    private Byte y;

    public HorseStep(Byte x, Byte y) {
        this.x = x;
        this.y = y;
    }

    public Byte getX() {return x; }
    public void setX(Byte x) {this.x = x; }
    public Byte getY() {return y; }
    public void setY(Byte y) {   this.y = y;    }
}

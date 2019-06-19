package com.roguelike.softwaredesign.au2019.model.Internal.GameObject;

import com.roguelike.softwaredesign.au2019.model.Towards;


// класс-родитель всех объектов карты
public abstract class GameObject {
    private int row;
    private int column;

    public GameObject(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public Boolean isHero() { return false; }

    public Boolean isSpace() {
        return false;
    }

    public Boolean isBorder() {
        return false;
    }

    public Boolean isMob() {
        return false;
    }

    public Boolean isArtifact() {
        return false;
    }

    abstract public char toChar();

    public GameObject move(String toward) {
        row += Towards.getDeltaRow(toward);
        column += Towards.getDeltaColumn(toward);
        return this;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

}

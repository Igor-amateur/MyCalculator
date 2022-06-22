package com.example.mycalculator;

public class MyState {
    public String lastString;
    public boolean pointIsUsed;
    public boolean pointUseIsUsed;
    public boolean lastIsPi;
    public boolean lastIsLeftBr;
    public boolean lastIsRightBr;
    public int leftBrCount;
    public int rightBrCount;
    public boolean lastIsOperation;


    public  MyState(MyState item)
    {
        this.lastString = item.lastString;
        this.pointIsUsed = item.pointIsUsed;
        this.pointUseIsUsed=item.pointUseIsUsed;
        this.lastIsPi = item.lastIsPi;
        this.lastIsLeftBr = item.lastIsLeftBr;
        this.lastIsRightBr = item.lastIsRightBr;
        this.leftBrCount=item.leftBrCount;
        this.rightBrCount=item.rightBrCount;
        this.lastIsOperation = item.lastIsOperation;
    }

    public  MyState()
    {
        lastString = new String("");
        pointIsUsed=true;
        pointUseIsUsed=false;
        lastIsPi=false;
        lastIsLeftBr=false;
        lastIsRightBr=false;
        leftBrCount = 0;
        rightBrCount = 0;
        lastIsOperation = true;
    }
}

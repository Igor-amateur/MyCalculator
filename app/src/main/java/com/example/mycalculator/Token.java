package com.example.mycalculator;

public class Token {
    public Token() {
        this.type='0';
        this.value=0.0;
    }
    public Token(char type, double value) {
        this.type=type;
        this.value=value;
    }
    public char type; // 0 dla liczb, "+" dla dodawania itd.
    public double value; //Wartość (tylko dla liczb). Operacje zawsze mają wartość „0”
}

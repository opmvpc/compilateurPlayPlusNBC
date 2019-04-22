package be.unamur.info.b314.compiler.main.symboltable.Helpers;

import java.util.ArrayList;

public class Errors
{
    public ArrayList<String> symbolNotFound;
    public ArrayList<String> mapError;
    public ArrayList<String> badNameError;
    public ArrayList<String> badTypeError;

    public Errors() {
        this.symbolNotFound = new ArrayList<>();
        this.mapError = new ArrayList<>();
        this.badNameError = new ArrayList<>();
        this.badTypeError = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Errors{" +
                "symbolNotFound=" + symbolNotFound +
                ", mapError=" + mapError +
                ", badNameError=" + badNameError +
                ", badTypeError=" + badTypeError +
                '}';
    }
}

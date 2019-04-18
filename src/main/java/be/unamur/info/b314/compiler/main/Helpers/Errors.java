package be.unamur.info.b314.compiler.main.Helpers;

import java.util.ArrayList;

public class Errors
{
    public ArrayList<String> symbolNotFound;
    public ArrayList<String> mapError;

    public Errors() {
        this.symbolNotFound = new ArrayList<>();
        this.mapError = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Errors{" +
                "symbolNotFound=" + symbolNotFound +
                ", mapError=" + mapError +
                '}';
    }
}
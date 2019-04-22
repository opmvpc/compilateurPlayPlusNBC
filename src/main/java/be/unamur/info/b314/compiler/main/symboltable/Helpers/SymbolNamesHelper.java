package be.unamur.info.b314.compiler.main.symboltable.Helpers;

import org.apache.commons.lang3.StringUtils;

public  class SymbolNamesHelper {
    public static String generateName(String symbolType,String name){
       return name + "_" + symbolType;
    }

    public static String generateNiceName(String name){
        return StringUtils.substringBefore(name,"_");
    }

}

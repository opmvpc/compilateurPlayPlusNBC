package be.unamur.info.b314.compiler.main.symboltable.Helpers;

import org.apache.commons.lang3.StringUtils;

/**
 *  Classe d'aide pour gérer les noms des symboles
 */
public  class SymbolNamesHelper {
    /**
     *
     * @param symbolType le type du symbole
     * @param name le nom du symbole
     * @return Concaténation entre le nom du symbole et son type
     */
    public static String generateName(String symbolType,String name){
       return name + "_" + symbolType;
    }

    /**
     *
     * @param name le nom complet du symbole
     * @return le nom du symbol sans la concaténation avec son type
     */
    public static String generateNiceName(String name){
        return StringUtils.substringBefore(name,"_");
    }

    /**
     *
     * @param name le nom du symbole
     * @return concaténation entre le nom de la structure et son type (StructSymbol)
     */
    public static String genStructName(String name) {
        return generateName("StructSymbol", name);
    }

    /**
     *
     * @param name le nom du symbole
     * @return concaténation entre le nom de la variable et son type (VariableSymbol)
     */
    public static String genVarName(String name) {
        return generateName("VariableSymbol", name);
    }
}

package com.example.demo.enums;

import java.util.HashMap;
import java.util.Map;

public class TablaRomanos {

    private static final Map<Byte, String> tablaCentenas = new HashMap<Byte, String>()
    {
        {
            put(Byte.valueOf("4"), "CD");
            put(Byte.valueOf("5"), "D");
            put(Byte.valueOf("9"), "CM");
        };
    };
    private static final Map<Byte, String> tablaDecenas = new HashMap<Byte, String>()
    {
        {
            put(Byte.valueOf("4"), "XL");
            put(Byte.valueOf("5"), "L");
            put(Byte.valueOf("9"), "XC");
        };
    };
    private static final Map<Byte, String> tablaUnidades = new HashMap<Byte, String>()
    {
        {
            put(Byte.valueOf("4"), "M");
            put(Byte.valueOf("5"), "MM");
            put(Byte.valueOf("9"), "MMM");
        };
    };

    public static Map<Byte, String> getTablaCentenas() {
        return tablaCentenas;
    }

    public static Map<Byte, String> getTablaDecenas() {
        return tablaDecenas;
    }

    public static Map<Byte, String> getTablaUnidades() {
        return tablaUnidades;
    }
}

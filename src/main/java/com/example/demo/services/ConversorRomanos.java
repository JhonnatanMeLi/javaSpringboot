package com.example.demo.services;

import com.example.demo.enums.TablaRomanos;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ConversorRomanos {

    public String convertirARomano(int numero) {
        String response = "";
        if (numero > 3999 || numero <= 0)
            response = "El numero enviado no es valido";
        else
            response = traducirNumero(numero);
        return response;
    }

    private String traducirNumero(int numero) {
        return String.valueOf(new char[numero]).replace('\0', 'I')
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");
    }

    public Integer convertirANumero(String romano) {
        Integer response = 0;
        romano.toUpperCase();
        Pattern pat = Pattern.compile("[IVXLCDM]*");
        Matcher mat = pat.matcher(romano);
        if (!mat.matches())
            response = -1;
        else
            response = traducirRomano(romano);
        return response;
    }

    private int traducirRomano(String romano) {
        return romano.replace("CM", "DCD")
                .replace("M", "DD")
                .replace("CD", "CCCC")
                .replace("D", "CCCCC")
                .replace("XC", "LXL")
                .replace("C", "LL")
                .replace("XL", "XXXX")
                .replace("L", "XXXXX")
                .replace("IX", "VIV")
                .replace("X", "VV")
                .replace("IV", "IIII")
                .replace("V", "IIIII").length();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author ESTUDIANTE
 */

public class Parcial2 {
    public static final String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String Desencriptar(String e){
        int cnum=0;
        String p="";
        for(int i=0;i<e.length();i++){
            char c = e.charAt(i);
            
            for(int j=0;j<26;j++){
                if(c==abc.charAt(j)){
                    cnum=j;
                    break;
                }
            }
            cnum = (cnum-3)%26;
            if(cnum <0){
                cnum+=26;
            }
            p+= abc.charAt(cnum);
        }
        return p;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prueba = "BDFLPLHQWR";
        System.out.println(Desencriptar(prueba));
    }
    
}
;
package com.anmol;

public class SearchInStrings {
    public static void main(String[] args) {
        String inp = "Anmol";
        char target = 'n';
        System.out.println(search(inp,target));
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == target) {
//                return true;
//            }
//        }

        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}

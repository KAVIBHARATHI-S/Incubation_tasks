package myTask111;

import java.util.*;
public class algebric
{
    static void mapCoeffientsWithNumbers(HashMap<String,Integer> map){
        
        for (Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getValue()>0){
              System.out.print("+");  
            }
              System.out.print(e.getValue()+e.getKey()); 
        }
        
}
    
    static void multiply(ArrayList<String> expressionOne,ArrayList<String> expressionTwo,ArrayList<String> expressionOneCoefficients,ArrayList<String> expressionTwoCoefficients){
          HashMap<String,Integer> result = new HashMap<String,Integer> ();
          for(int i =0;i< expressionOne.size();i++){
              for(int j = 0; j<expressionTwo.size();j++){
                  String t = charaterMapping(expressionOneCoefficients.get(i) + expressionTwoCoefficients.get(j));
                  result.put(t,result.containsKey(t) ? result.get(t) + Integer.parseInt(expressionOne.get(i)) * Integer.parseInt(expressionTwo.get(j)) : Integer.parseInt(expressionOne.get(i)) * Integer.parseInt(expressionTwo.get(j)));
               }
          }
          mapCoeffientsWithNumbers(result);
		  			
    }
    
    
    static String charaterMapping(String a){
         HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        char[] ch = a.toCharArray();
        StringBuilder sb=new StringBuilder();  
        for (char key : ch) {
            map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
        }
       for (Map.Entry<Character, Integer> e : map.entrySet()){
         sb.append(e.getKey());
             if(e.getValue() > 1){
                 sb.append("^"+e.getValue());
             }  
       }
            return sb.toString();
    }
    
    	private static ArrayList<ArrayList<String>> processExpression(String expression) {
	    String str = expression;
        int length = str.length();
        
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        ArrayList<String> numberList = new ArrayList<>();
        ArrayList<String> lettersList = new ArrayList<>();
        

        String[] arr = str.split("[+]");

        for(String a: arr) {
            String[] b = a.split("[-]");
            if (b.length == 1) {
                numberList.add(String.valueOf(getNumber(b[0])));
                lettersList.add(processString(getString(b[0])));
            } else {
                numberList.add(String.valueOf(getNumber(b[0])));
                lettersList.add(processString(getString(b[0])));
                for(int i = 1; i < b.length; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("-");
                    sb.append(b[i]);
                    numberList.add(String.valueOf(getNumber(sb.toString())));
                    lettersList.add(processString(getString(sb.toString())));
                }
            }
        }
        
        
        list.add(numberList);
        list.add(lettersList);
        
        return list;
}
	
	private static int getNumber(String str) {
	    boolean negativeNumber = false;
	    int num = 0;
	    
	    for(int i = 0; i < str.length(); i++) {
	        if (i == 0 && str.charAt(i) == '-') {
	            negativeNumber = true;
	        } else if (isDigit(str.charAt(i))) {
	            num = num * 10 + Character.getNumericValue(str.charAt(i));
	        } else {
	            break;
	        }
	    }
	    
	    if (num == 0) num++;
	    
	    if (negativeNumber) {
	        return num * -1;
	    } else {
	        return num;
	    }
	}
	
	private static String getString(String str) { //3x^2y^2
	    boolean stringStarted = false;
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i = 0; i < str.length(); i++) {
	        if (stringStarted) {
	            sb.append(str.charAt(i));
	        } else if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
	            sb.append(str.charAt(i));
	            stringStarted = true;
	        }
	    }
	    
	    return sb.toString();
	}
	
	private static Boolean isDigit(char a) {
	    if (a >= 48 && a<=57) 
	        return true;
	    else 
	        return false;
	}
	
	private static String processString(String str) { //x^2y^2
	    String[] strArr = str.split("['^']");
	    
	    if (strArr.length == 1) {
	        return str;
	    } else {
	        StringBuilder sb = new StringBuilder();
	        sb.append(strArr[0]);
	        
	        for(int i = 1; i < strArr.length; i++) {
	            int num = getNumber(strArr[i]);
	            String sss = getString(strArr[i]);
	            sb.append(makeCharacterToString(getLastCharacter(sb.toString()), num));
	            sb.append(sss);
	        }
	        
	        return sb.toString();
	    }
	}
	
	private static char getLastCharacter(String str) {
	    return str.charAt(str.length() - 1);
	} 
	
	private static String makeCharacterToString(char c, int a) {
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < a - 1; i++) {
	        sb.append(c);
	    }
	    
	    return sb.toString();
	}
	public static void main(String[] args) {
	    ArrayList<ArrayList<String>> exp1 = processExpression("2xy+4x^2y");
	    ArrayList<ArrayList<String>> exp2 = processExpression("2x^2y+6xy");
        multiply(exp1.get(0),exp2.get(0),exp1.get(1),exp2.get(1));
   
	}
}
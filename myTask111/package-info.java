import java.util.*;
public class Main
{
    static void mapCoeffientsWithNumbers(HashMap<String,Integer> map){
       
        for (Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getValue()>0){
              System.out.print("+");  
            }
              System.out.print(e.getValue()+e.getKey());
        }
       
}
   
    static void multiply(int expressionOne[],int expressionTwo[],String expressionOneCoefficients[],String expressionTwoCoefficients[] ){
          HashMap<String,Integer> result = new HashMap<String,Integer> ();
          for(int i =0;i< expressionOne.length;i++){
              for(int j = 0; j<expressionTwo.length;j++){
                  String t = charaterMapping(expressionOneCoefficients[i] + expressionTwoCoefficients[j]);
                  result.put(t,result.containsKey(t) ? result.get(t) + expressionOne[i] * expressionTwo[j] : expressionOne[i] * expressionTwo[j] );
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
   
   
public static void main(String[] args) {
      int expressionOne[] = {2,3,-1};
      String expressionOneCoefficients[] ={"xxy","xyyz","xzzz"};
      int expressionTwo[] ={5,3,-2};
      String expressionTwoCoefficients[] = {"xyz","yyz","z"};
           multiply(expressionOne,expressionTwo,expressionOneCoefficients,expressionTwoCoefficients);
 
}
}

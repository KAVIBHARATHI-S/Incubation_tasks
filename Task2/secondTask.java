package myTask;
import java.util.*;

class Strings {
  char[] st;
  String str;
  Strings(char[] str) {
    this.st = str;
  }
  
  Strings(String str) {
	this.str=str;
    this.st = str.toCharArray();
  }
  
  char charAt(int i) throws Exception {
    if(i<0 || i >= this.st.length) {    	
      throw new Exception("Array Index out of Bounds.");
    }
    return this.st[i];
  }
  
  boolean contains(String val) {
    char[] cmp = val.toCharArray();
    for(int i=0;i<this.st.length;) {
      if(this.st[i] == cmp[0]) {
        int len = 0;
      	while(i<st.length && len < cmp.length && this.st[i] == cmp[len]) {
      	  len++;
          i++;
      	}
      	if(len == cmp.length) {
      	  return true;
      	}
      }
      i++;
    }
    return false;
  }

  String toUpperCase() {
	  
	  for (int i = 0; i < this.st.length; i++) {
          if (st[i] >= 'a' && st[i] <= 'z') {
                 this.st[i] = (char) ((int) this.st[i] - 32);
          }
	  }
      return new String(this.st);
  }
    
  String toLowerCase() {
	  
	  for (int i = 0; i < this.st.length; i++) {
          if (st[i] >= 'a' && st[i] <= 'z') {
                 this.st[i] = (char) ((int) this.st[i] +32);
          }
	  }
      return new String(this.st);
  }
  String trim() {
	 
	  int i, index=0;

	    int len = this.st.length;
	    for(i=0; i<len; i++)
	    {
	       if(this.st[i]==' ')
	          continue;
	       else
	       {
	          index = i;
	          break;
	       }
	    }
	    String newstr="";
	    for(i=index; i<len; i++)
	       newstr += this.st[i];
	    
	    int lenTemp = newstr.length();
	    for(i=(lenTemp-1); i>=0; i--)
	    {
	       if(newstr.charAt(i)==' ')
	          continue;
	       else
	       {
	          index = i;
	          break;
	       }
	    }
	    String r = "";
	    for(i=0; i<=index; i++)
	       r += newstr.charAt(i);
	    	  
	    return r;
		}


  boolean startsWith(String s) {
    char[] val = s.toCharArray();
    
    int i = 0;
    while(i<val.length && this.st[i] == val[i]) {
      i++;
    }
    return (i == val.length) ? true : false;
  }

  public boolean endsWith(String checkString) {
	   char[] checkArray = checkString.toCharArray();
	   int startLength = this.st.length - checkArray.length, checkIndex = 0;
	   while(startLength<this.st.length && this.st[startLength] == checkArray[checkIndex]) {
	     startLength++;
	     checkIndex++;
	   }
	   return (checkIndex == checkArray.length) ? true : false;  
	}

  boolean equalsIgnoreCase(String s) {
    char[] val = s.toCharArray();
    if(val.length != this.st.length) {
      return false;
    }
    for(int i=0;i<this.st.length;i++) {
      char ch = this.st[i];
      if(Character.toLowerCase(val[i]) != Character.toLowerCase(ch)) {
        return false;
      }
    }
    return true;
  }
  
  
  
  boolean isEmpty() {
	
	
	if (st.length == 0)
	{
		return true;
	}
	else
	{
		return false;
	}
}



boolean equals(String s) {
	  char[] val = s.toCharArray();
	    if(val.length != this.st.length) {
	      return false;
	    }
	    for(int i=0;i<this.st.length;i++) {
	        if(val[i] != this.st[i]) {
	          return false;
	        }
	      }
		return true;
		
	}


String concat(String s) {
	return  this.st+s;
}
public int codePointAt(int index)
{
    int val =  this.st[index];
   return val;
}

public int codePointBefore(int index)
{
    int val =  this.st[index-1];
   return val;
}
public  int compareTo(String s) {

    char[] str1 = this.st;
    char[] str2 = s.toCharArray();
    int minlength = Math.min(this.st.length, s.length());
     int i = 0;
    int res = 0;
    while (i < minlength) {
        if (str1[i] != str2[i]) {
            res= str1[i] - str2[i];
            return res;
        }
        i++;
    }
    return res;
}
public int indexOf(char a) {
    
    for (int i=0; i<this.st.length; i++) {
        if(this.st[i] == a) {
            return i;
        }
    }
    return 0;
}

  
}



public class secondTask {
	public static void main(String[] args) {
		Strings obj=new Strings("kavibharathi");
//		System.out.println("CharAt : "+obj.charAt(3));     
//		String str = new String("kavibharathi");
//		System.out.println("Contains : "+obj.contains(str));
//		System.out.println("toUpperCase : "+obj.toUpperCase());
//		System.out.println("toLowerCase : "+obj.toLowerCase());
//		System.out.println("trim : "+obj.trim());           
//		System.out.println("startsWith : "+obj.startsWith("kavi"));
		System.out.println("endsWith : "+obj.endsWith("kavibharathi"));   
//		System.out.println("equalsIgnoreCase : "+obj.equalsIgnoreCase("kavi java Developer"));
//		System.out.println("isEmpty : "+obj.isEmpty());
//		System.out.println("equals : "+obj.equals("Java Developer"));
//		System.out.println("concat : "+obj.concat(" in zoho"));
//		System.out.println("CodePointAt : "+obj.codePointAt(3));
//		System.out.println("CodePointBefore : "+obj.codePointBefore(7));
//		System.out.println("compareTo : "+obj.compareTo("Java Developer"));
//		System.out.println("indexOf : "+obj.indexOf("J"));
		
	}
	
}
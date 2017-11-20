import java.util.*;  
class TestCollection13
{  
 public static void main(String args[]){  
  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
  hm.put(100,"Lipton");  
  hm.put(101,"Tea");  
  hm.put(102,"Soup");  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  

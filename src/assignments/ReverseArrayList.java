package assignments;

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        
        ArrayList<StringBuilder> aL = new ArrayList();
        
        aL.add(new StringBuilder("Hi"));
        aL.add(new StringBuilder("Everyone"));
        aL.add(new StringBuilder("Welcome"));

          aL.forEach((sb) -> {
        	  //providing implementation to accept method which is present in Consumer interface
        	  (sb).reverse();
        	  System.out.println(sb);
          });
          
          //  aL.forEach(sb -> System.out.println(((StringBuilder) sb).reverse()));
    }
}

// forEach is used when we need to iterate through a collection and perform actions on its elements
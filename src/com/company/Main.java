package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


     public static void main(String[] args) {

         List<Integer> Listka = new ArrayList<Integer>();
         try {
             Listka.add(1);
             Listka.add(2);
             Listka.add(3);
             Listka.add(1);
             Listka.add(2);
             Listka.add(3);


             if(Listka.size()<5)
             {
                 throw new VerifyError();
             }

         }

         catch (VerifyError xxx)
         {
             System.out.println(xxx.toString());
         }
         catch (IllegalArgumentException ekh)
         {

         }

         catch (Exception e) {
             e.printStackTrace();
         } finally {
             System.out.println("Warunek sprawdzony");
         }


         int [][] dupa ;


     }
}

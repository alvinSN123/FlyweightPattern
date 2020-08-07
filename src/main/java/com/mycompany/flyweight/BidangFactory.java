/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flyweight;
import java.util.HashMap;

/**
 *
 * @author USER
 */
public class BidangFactory {
     private static final HashMap bulatMap = new HashMap();

   public static Bidang getBulat(String color) {
       
       
      Bulat bulat = (Bulat)bulatMap.get(color);

      if(bulat == null) {
         bulat = new Bulat(color);
         bulatMap.put(color, bulat);
         System.out.println("Creating circle of color : " + color);
      }
      return bulat;
    
}
}

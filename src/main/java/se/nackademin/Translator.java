/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;
import java.util.ArrayList;

/**
 *
 * @author testautomatisering  av Ayesha
 */
public class Translator 
{
   public ArrayList<String> arrayOfAdjectives = new ArrayList<String>();
   public ArrayList<String> arrayOfSubstantive = new ArrayList<String>();
   public ArrayList<String> arrayOfVerbs=new ArrayList<String>();
   
   
  //constructor
   public Translator()
   {
       ListarrayOfAdjectives();
       listarrayOfSubstantive();
       ListarrayOfVerbs();
   }
   


//adding informations/list to this Arraylist
public void ListarrayOfAdjectives()
{
    this.arrayOfAdjectives.add("stor");
    this.arrayOfAdjectives.add("Liten");
    this.arrayOfAdjectives.add("stark");
    this.arrayOfAdjectives.add("svag");
    this.arrayOfAdjectives.add("mjuk");
    this.arrayOfAdjectives.add("hård");
    this.arrayOfAdjectives.add("snabb");
    this.arrayOfAdjectives.add("vacker");
    this.arrayOfAdjectives.add("ljus");
    this.arrayOfAdjectives.add("mörk");
}


public void listarrayOfSubstantive()
{
    this.arrayOfSubstantive.add("en lönehöjning");
    this.arrayOfSubstantive.add("en en lönesänkning");
    this.arrayOfSubstantive.add("en fotboja");
    this.arrayOfSubstantive.add("en katt");
    this.arrayOfSubstantive.add("en hund");
    this.arrayOfSubstantive.add("en hus");
    this.arrayOfSubstantive.add("en barn");
    this.arrayOfSubstantive.add("en elstängsel");
    this.arrayOfSubstantive.add("en dator");
    this.arrayOfSubstantive.add("en golv");
    
}

public void ListarrayOfVerbs()
{
    this.arrayOfVerbs.add("Springa");
    this.arrayOfVerbs.add("ljuga");
    this.arrayOfVerbs.add("flyga");
    this.arrayOfVerbs.add("se");
    this.arrayOfVerbs.add("vara");
    this.arrayOfVerbs.add("äta");
    this.arrayOfVerbs.add("mäta");
    this.arrayOfVerbs.add("röra");
    this.arrayOfVerbs.add("resa");
    
}


public String returnArrayOfAdjectives(int num)
{
    String result = this.arrayOfAdjectives.get(num);
    return result;
}




public String returnArrayOfSubstantive(int num)
{
  String result = this.arrayOfSubstantive.get(num);
  return result;
}



public String returnArrayOfVerbs(int num)
{
    String result = this.arrayOfVerbs.get(num);
    return result;
}

}// ends class

package org.example;


import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] forms = new String[]{"circle", "square", "oval", "triangle", "star"};
        //for (int i = 0; i < forms.length; i++) {
         //  if (forms[i] == "star") ;
        for (String form : forms){
            if (form == "square");
                System.out.println(true);
            if (form == "square"){
               break;
            }
            }

        ArrayList<String> dogs = new ArrayList<>();
        dogs.add("very small");
        dogs.add("big");
        dogs.add("big");
        dogs.add("midl");
        HashSet<String> listDogs = new HashSet<>();
        listDogs.addAll(dogs);
        System.out.println(listDogs);
        }
    }

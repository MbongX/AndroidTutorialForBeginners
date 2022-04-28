package javaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class arrayStrings {
    public static void main(String[] args){
        System.out.println("Some string Methods");
        String name = "My name is Mbongeni Mahlangu PERIOD";
        
        //.length(returns the number of chars in the string array)
        int strLength  = name.length();
        
        //toUpperCase()/toLowerCase() (Changes caps to upper or lower resopectively)
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        
        //substring() (Used to extract a substring[section within a string array] ->this method requires one or more qrgs to work )
        String firstSub = name.substring(5);    // this will begin extracting from index value 6 till the end of the string array
        String secondSub = name.substring(2, 13); // this will extract from index value 2 and stop at 13(but doesn't brint the value at 13{it's never included})
        
        //charA() //Returns the char at a specified index value ::NOTE IT ONLY WORKS WITH CHAR DATATYPES::
        char nameChar = name.charAt(15);
        
        //equals() //This method is used to compare if 2 strings are identical or not returns a boolean datatype therefrore it is a boolean datatype
        String a = "Hello World";
        String b = "System Hello";
        String c = "Hello World";

        boolean aEqualB = a.equals(b);  //prints false
        boolean bEqualC = b.equals(c);  //prints false
        boolean cEqualA = c.equals(a);  //prints trues

        //split() //Splits a string into substrings based on "user-defined seperator"(Delimiter), after spliting the string the method returns an array that contains the resulting substrings
        String splitNames = "Ace, Base, Cat, Dog, Eagle"; 
        String[] splittedNames = splitNames.split(", "); // in this case the delimiter is the comma and space (", ") and the data type is a string array
        // the above code returns  :: {"Ace", "Base", "Cat", "Dog", "Eagle"}

        System.out.println("Array And Array Methods using the \"java.util.Arrays\" class ");
        //There are 2 declaration standards of arrays:
        //1. int[] example;     -> Java Standard
        //2. int examples[];    -> C++ Standard (hardly used as it is not the preferred syntax but it works ^_^ )

        //declaring an array and initialising it later 
        int[] example;
        example = new int[] {10,20,30,40,50,60,70,80,90}; // In this case the computer determines the arraySize but the values in the array...NOTE that the size of an array cannot be changed once it has been declared
    
        //declare and initialize on the same line
        int[] example2 = {10,20,30,40,50,60,70,80,90}; 

        //specifying the arraysize apon declaration without assigning values into the array
        int[] example3 = new int[12]; //the  size of the array is 12 value but the index value ends up too 11

        //equals() //used to determine if 2 arrays are equal to each other, Returns true if they equal and false otherwise,
        // In this case arrays are considered eqaul if the have the same number of elements and the elemets are arranged in the same order
        boolean arrResult = Arrays.equals(example, example2); //syntax defined:All methods in the array class are "STATIC" therefore to call a static method, you have to add the name of the classs in front
        System.out.println(arrResult);
        //unlike the strings method equals() this one requires 2 args (base array, array to compare to);

        //copyOfRange   this method allows you to copy the contents of one array into another, It requires three args: 1. Arrays to copy, 2.starting index, 3. ending index i.e Arrays.copyOfRange("arrayname",start,end);
        int[] x3 ={0,3,6,9,12,15,18,21,24,27,30};
        //copy this array onto a new array calledx3Copy
        int[] x3Copy = Arrays.copyOfRange(x3,0,10); // ending is because element at index is not copied plus not in the array in this case

        //toString() //returns a string to represent the content of an array
        int[] numbers ={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numbers));   // this will display the following :  [1,2,3,4,5,6,7,8,9]

        //sort //this method is used to sort out arrays(in assecnding order)
        int[] arrSort = {0,2,4,5,3,6,9,8,5,7,1,2,5,3,65,-55};
        //you can sort this array by doing the following 
        Arrays.sort(arrSort); //-> There's no need to create a variable to store the sorted array
        System.out.println(Arrays.toString(arrSort)); // -> output: [-55, 0, 1, 2, 2, 3, 3, 4, 5, 5, 5, 6, 7, 8, 9, 65]
        
        
        //-- Morning Session done

        //--Freedom's Day 3 am session
        
        //binarySearch() // this method is used to search for a specific value in a "SORTED ARRAY" -> Therefore to use this array you have to make sure that your array is sorted.....
        //using the arrSort Array to find 5 using the binarySearch Method
        System.out.println("Using the binarySearch Method to find the index value of 5 in the sorted array of \"arrSort\" :  " + Arrays.binarySearch(arrSort,5));
        // but if we try to look for a value that is not in the array we get a negetive value 
        // Whereas the negetive signs tells us that the valueis not found and the number tells you where shouold be if it exist in th array....
        // Note that it adds ONE(1) to that index value so if you get -4 as your answer then the index should ne 4-1 = 3
        System.out.println("Using a bSearch to find a non existant value in arrSort array [30] : " + Arrays.binarySearch(arrSort,30));
        //Array length ...
        // So there's no length() method for arrays instead we use the length field (this is a field not a method) (Field has no "()")
        //finding the length of arrSort
        System.out.println("Length of arrSort array using the length field : " + arrSort.length);

        System.out.println("---::Primitive Type vs Reference Type::---");
        System.out.println("Primitive data type stores is own value unlike reference typess which which hold reference to the value which they occupy/ hold");
        // Reference Data types include Strings,Arrays,Interface and classes
        // Primitive data types include, byte,short,int,long,float,doubke,char And boolean

        // --AFTERNOON SEESION 

        // Displaying output to user ...
        // There are two syntaxes to use when outputting code to user :
        /**
         *      1.println() -> 
         *      2.print() -> 
          *       */ 
    }
}

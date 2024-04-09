/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac JavaCode8.java
/usr/local/Cellar/openjdk/21.0.2/bin/java JavaCode8
*/

// import
import java.util.*;
import java.util.HashMap;

public class JavaCode8 {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");

        System.out.println("Java Code 8");
        System.out.println("Java - HashMap");
        System.out.println("HashMap = Key/Value pair");
        System.out.println("");

        // Japan cities by population
        HashMap<String, Integer> japanCitiesByPopulation = new HashMap<String, Integer>();
        japanCitiesByPopulation.put("Tokyo", 10);
        japanCitiesByPopulation.put("Yokohama", 4);
        japanCitiesByPopulation.put("Osaka", 3);
        System.out.println(japanCitiesByPopulation);          

        // Access an Item
        System.out.println("Population of Tokyo = " + japanCitiesByPopulation.get("Tokyo"));

        // Remove an Item
        System.out.println("Remove Osaka from Hashmap = " + japanCitiesByPopulation.remove("Osaka"));


        // HashMap Size
        System.out.println("Number of items in HashMap = " + japanCitiesByPopulation.size());

        // Print all keys and values of a HashMap
        System.out.println("Print all keys and values of a HashMap =>");
        japanCitiesByPopulation.put("Fukuoka", 2);
        japanCitiesByPopulation.put("Kawasaki", 2);

        for (String cityName : japanCitiesByPopulation.keySet()) {
            System.out.println("City = " + cityName);
            System.out.println("Population of city = : " + japanCitiesByPopulation.get(cityName));            
        }


    }
}
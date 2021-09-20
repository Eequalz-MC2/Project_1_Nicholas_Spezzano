//Nick Spezzano
//Sept,20,2021
//Project 1
//Comp 152
// Hello Pro
package com.company;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        var productfile = "Products.txt";
        var productsfile = Paths.get(productfile);
        var nameof_product = new ArrayList<String>();
        var costof_product = new ArrayList<Float>();
        var numberof_products = new ArrayList<Integer>();
        var read_txt = Files.readAllLines(productsfile);

        System.out.println("Hey" + read_txt);

        for (var lookupproductloop : read_txt) {
            var seperate_txt = lookupproductloop.split(",");

            nameof_product.add(seperate_txt[0]); //what does this do again?
            costof_product.add(Float.parseFloat(seperate_txt[1]));
            numberof_products.add(Integer.parseInt(seperate_txt[2]));

        }

        var keepGoing = true;
        var reader = new Scanner(System.in);

        while (keepGoing) {


            System.out.print("Enter a product name to search, or type 'END' to quit: ");

            var userResponse = reader.nextLine();

            if (userResponse.equals("END")) {

                keepGoing = false;

            } else {

                var indexOfProduct = nameof_product.indexOf(userResponse);

                if (indexOfProduct == -1) {

                    System.out.print("The product is not in stock\n");

                } else {

                    var name = nameof_product.get(indexOfProduct);
                    var price = costof_product.get(indexOfProduct);
                    var quantity = numberof_products.get(indexOfProduct);


                    System.out.print(name + " is in stock! We have " + quantity + ". The price of each is $" + price + "\n");

                }


            }


        }

        System.out.print("\n\nAll Done");


        // So far we did
        // write your code here
    }


}

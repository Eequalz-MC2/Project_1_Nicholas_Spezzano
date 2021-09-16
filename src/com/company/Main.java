package com.company;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        var productfile= "Products.txt";
        var productsfile = Paths.get(productfile);
        var nameof_product = new ArrayList<String>();
        var costof_product = new ArrayList<Float>();
        var numberof_products = new ArrayList<Integer>();
        var read_txt = Files.readAllLines(productsfile);

        System.out.println("Hey" +read_txt);

        for (var lookupproductloop : read_txt ) {
            var seperate_txt = lookupproductloop.split(",");
            System.out.println(lookupproductloop);
        }

            //System.out.println("Heres the list" );
        }
        // So far we did
	// write your code here
    }
}

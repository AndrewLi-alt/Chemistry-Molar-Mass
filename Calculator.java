import javax.swing.*;
import java.util.*;
public class Calculator {
    public static void main(String[] args){
        boolean loop = false;
        while(!loop) {
            double one = 0;
            double two = 0;
            double three = 0;

            System.out.println("Grams per mole calculator\nGoes up to three element, just type in the symbol\nFirst the coefficient like the 5 in 5O2\nIf you have less than 3 elements, just type a random letter and put 0 as the amount for the filler" +
                    "\neg. CO2 I'd type in 1, C, 1, O, 2, andrewlargebrane, 0");
            Scanner scan = new Scanner(System.in);
            System.out.println("First Coefficient?");
            int coeff1 = scan.nextInt();
            System.out.println("Element?");
            String element = scan.next();
            //<editor-fold desc="First element library">
            if (element.equalsIgnoreCase("c")) {
                one = 12.01;
            }
            if(element.equalsIgnoreCase("o")){
                one = 15.99;
            }
            if(element.equalsIgnoreCase("n")){
                one = 14.01;
            }
            if(element.equalsIgnoreCase("h")){
                one = 1.01;
            }
            if(element.equalsIgnoreCase("Li")){
                one = 6.94;
            }
            if(element.equalsIgnoreCase("Be")){
                one = 9.01;
            }
            if(element.equalsIgnoreCase("B")){
                one = 10.81;
            }
            if(element.equalsIgnoreCase("F")){
                one = 19;
            }
            if(element.equalsIgnoreCase("na")){
                one = 22.99;
            }
            if(element.equalsIgnoreCase("Mg")){
                one = 24.31;
            }
            if(element.equalsIgnoreCase("Al")){
                one = 26.98;
            }
            if(element.equalsIgnoreCase("si")){
                one = 28.09;
            }
            if(element.equalsIgnoreCase("p")){
                one = 30.97;
            }
            if(element.equalsIgnoreCase("s")){
                one = 32.06;
            }
            if(element.equalsIgnoreCase("cl")){
                one = 35.45;
            }
            if(element.equalsIgnoreCase("k")){
                one = 39.1;
            }
            if(element.equalsIgnoreCase("ca")){
                one = 40.08;
            }
            if(element.equalsIgnoreCase("sc")){
                one = 44.96;
            }
            if(element.equalsIgnoreCase("ti")){
                one = 47.87;
            }
            if(element.equalsIgnoreCase("v")){
                one = 50.94;
            }
            if(element.equalsIgnoreCase("cr")){
                one = 52;
            }
            if(element.equalsIgnoreCase("mn")){
                one = 54.93;
            }
            if(element.equalsIgnoreCase("fe")){
                one = 55.85;
            }
            if(element.equalsIgnoreCase("co")){
                one = 58.93;
            }
            if(element.equalsIgnoreCase("ni")){
                one = 58.69;
            }
            if(element.equalsIgnoreCase("cu")){
                one = 63.55;
            }
            if(element.equalsIgnoreCase("zn")){
                one = 65.38;
            }
            if(element.equalsIgnoreCase("ga")){
                one = 69.72;
            }
            if(element.equalsIgnoreCase("ge")){
                one = 72.63;
            }
            if(element.equalsIgnoreCase("as")){
                one = 74.92;
            }
            if(element.equalsIgnoreCase("se")){
                one = 78.97;
            }
            if(element.equalsIgnoreCase("br")){
                one = 79.9;
            }
            if(element.equalsIgnoreCase("rb")){
                one = 85.47;
            }
            if(element.equalsIgnoreCase("sr")){
                one = 87.62;
            }
            if(element.equalsIgnoreCase("y")){
                one = 88.91;
            }
            if(element.equalsIgnoreCase("zr")){
                one = 91.22;
            }
            if(element.equalsIgnoreCase("nb")){
                one = 92.91;
            }
            if(element.equalsIgnoreCase("mo")){
                one = 95.95;
            }
            if(element.equalsIgnoreCase("tc")){
                one = 98;
            }
            if(element.equalsIgnoreCase("ru")){
                one = 101.07;
            }
            if(element.equalsIgnoreCase("rh")){
                one = 102.91;
            }
            if(element.equalsIgnoreCase("pd")){
                one = 106.42;
            }
            if(element.equalsIgnoreCase("ag")){
                one = 107.87;
            }
            if(element.equalsIgnoreCase("cd")){
                one = 112.41;
            }
            if(element.equalsIgnoreCase("in")){
                one = 114.82;
            }
            if(element.equalsIgnoreCase("sn")){
                one = 118.71;
            }
            if(element.equalsIgnoreCase("sb")){
                one = 121.76;
            }
            if(element.equalsIgnoreCase("te")){
                one = 127.6;
            }
            if(element.equalsIgnoreCase("i")){
                one = 126.9;
            }
            if(element.equalsIgnoreCase("cs")){
                one = 132.91;
            }
            if(element.equalsIgnoreCase("ba")){
                one = 137.33;
            }
            if(element.equalsIgnoreCase("hf")){
                one = 178.49;
            }
            if(element.equalsIgnoreCase("ta")){
                one = 180.95;
            }
            if(element.equalsIgnoreCase("w")){
                one = 183.84;
            }
            if(element.equalsIgnoreCase("re")){
                one = 186.21;
            }
            if(element.equalsIgnoreCase("os")){
                one = 190.23;
            }
            if(element.equalsIgnoreCase("ir")){
                one = 192.22;
            }
            if(element.equalsIgnoreCase("pt")){
                one = 195.08;
            }
            if(element.equalsIgnoreCase("au")){
                one = 196.97;
            }
            if(element.equalsIgnoreCase("hg")){
                one = 200.59;
            }
            if(element.equalsIgnoreCase("tl")){
                one = 204.38;
            }
            if(element.equalsIgnoreCase("pb")){
                one = 207.2;
            }
            if(element.equalsIgnoreCase("bi")){
                one = 208.98;
            }
            if(element.equalsIgnoreCase("po")){
                one = 209;
            }
            if(element.equalsIgnoreCase("at")){
                one = 210;
            }
            if(element.equalsIgnoreCase("fr")){
                one = 223;
            }
            if(element.equalsIgnoreCase("ra")){
                one = 226;
            }
            //</editor-fold>
            System.out.println("How many of these?");
            int num1 = scan.nextInt();
            System.out.println("Second element?");
            String element2 = scan.next();
            //<editor-fold desc="Second element library">
            if (element2.equalsIgnoreCase("c")) {
                two = 12.01;
            }
            if(element2.equalsIgnoreCase("o")){
                two = 15.99;
            }
            if(element2.equalsIgnoreCase("n")){
                two = 14.01;
            }
            if(element2.equalsIgnoreCase("h")){
                two = 1.01;
            }
            if(element2.equalsIgnoreCase("Li")){
                two = 6.94;
            }
            if(element2.equalsIgnoreCase("Be")){
                two = 9.01;
            }
            if(element2.equalsIgnoreCase("B")){
                two = 10.81;
            }
            if(element2.equalsIgnoreCase("F")){
                two = 19;
            }
            if(element2.equalsIgnoreCase("na")){
                two = 22.99;
            }
            if(element2.equalsIgnoreCase("Mg")){
                two = 24.31;
            }
            if(element2.equalsIgnoreCase("Al")){
                two = 26.98;
            }
            if(element2.equalsIgnoreCase("si")){
                two = 28.09;
            }
            if(element2.equalsIgnoreCase("p")){
                two = 30.97;
            }
            if(element2.equalsIgnoreCase("s")){
                two = 32.06;
            }
            if(element2.equalsIgnoreCase("cl")){
                two = 35.45;
            }
            if(element2.equalsIgnoreCase("k")){
                two = 39.1;
            }
            if(element2.equalsIgnoreCase("ca")){
                two = 40.08;
            }
            if(element2.equalsIgnoreCase("sc")){
                two = 44.96;
            }
            if(element2.equalsIgnoreCase("ti")){
                two = 47.87;
            }
            if(element2.equalsIgnoreCase("v")){
                two = 50.94;
            }
            if(element2.equalsIgnoreCase("cr")){
                two = 52;
            }
            if(element2.equalsIgnoreCase("mn")){
                two = 54.93;
            }
            if(element2.equalsIgnoreCase("fe")){
                two = 55.85;
            }
            if(element2.equalsIgnoreCase("co")){
                two = 58.93;
            }
            if(element2.equalsIgnoreCase("ni")){
                two = 58.69;
            }
            if(element2.equalsIgnoreCase("cu")){
                two = 63.55;
            }
            if(element2.equalsIgnoreCase("zn")){
                two = 65.38;
            }
            if(element2.equalsIgnoreCase("ga")){
                two = 69.72;
            }
            if(element2.equalsIgnoreCase("ge")){
                two = 72.63;
            }
            if(element2.equalsIgnoreCase("as")){
                two = 74.92;
            }
            if(element2.equalsIgnoreCase("se")){
                two = 78.97;
            }
            if(element2.equalsIgnoreCase("br")){
                two = 79.9;
            }
            if(element2.equalsIgnoreCase("rb")){
                two = 85.47;
            }
            if(element2.equalsIgnoreCase("sr")){
                two = 87.62;
            }
            if(element2.equalsIgnoreCase("y")){
                two = 88.91;
            }
            if(element2.equalsIgnoreCase("zr")){
                two = 91.22;
            }
            if(element2.equalsIgnoreCase("nb")){
                two = 92.91;
            }
            if(element2.equalsIgnoreCase("mo")){
                two = 95.95;
            }
            if(element2.equalsIgnoreCase("tc")){
                two = 98;
            }
            if(element2.equalsIgnoreCase("ru")){
                two = 101.07;
            }
            if(element2.equalsIgnoreCase("rh")){
                two = 102.91;
            }
            if(element2.equalsIgnoreCase("pd")){
                two = 106.42;
            }
            if(element2.equalsIgnoreCase("ag")){
                two = 107.87;
            }
            if(element2.equalsIgnoreCase("cd")){
                two = 112.41;
            }
            if(element2.equalsIgnoreCase("in")){
                two = 114.82;
            }
            if(element2.equalsIgnoreCase("sn")){
                two = 118.71;
            }
            if(element2.equalsIgnoreCase("sb")){
                two = 121.76;
            }
            if(element2.equalsIgnoreCase("te")){
                two = 127.6;
            }
            if(element2.equalsIgnoreCase("i")){
                two = 126.9;
            }
            if(element2.equalsIgnoreCase("cs")){
                two = 132.91;
            }
            if(element2.equalsIgnoreCase("ba")){
                two = 137.33;
            }
            if(element2.equalsIgnoreCase("hf")){
                two = 178.49;
            }
            if(element2.equalsIgnoreCase("ta")){
                two = 180.95;
            }
            if(element2.equalsIgnoreCase("w")){
                two = 183.84;
            }
            if(element2.equalsIgnoreCase("re")){
                two = 186.21;
            }
            if(element2.equalsIgnoreCase("os")){
                two = 190.23;
            }
            if(element2.equalsIgnoreCase("ir")){
                two = 192.22;
            }
            if(element2.equalsIgnoreCase("pt")){
                two = 195.08;
            }
            if(element2.equalsIgnoreCase("au")){
                two = 196.97;
            }
            if(element2.equalsIgnoreCase("hg")){
                two = 200.59;
            }
            if(element2.equalsIgnoreCase("tl")){
                two = 204.38;
            }
            if(element2.equalsIgnoreCase("pb")){
                two = 207.2;
            }
            if(element2.equalsIgnoreCase("bi")){
                two = 208.98;
            }
            if(element2.equalsIgnoreCase("po")){
                two = 209;
            }
            if(element2.equalsIgnoreCase("at")){
                two = 210;
            }
            if(element2.equalsIgnoreCase("fr")){
                two = 223;
            }
            if(element2.equalsIgnoreCase("ra")){
                two = 226;
            }
            //</editor-fold>
            System.out.println("How many of these?");
            int num2 = scan.nextInt();
            System.out.println("Third Element?");
            String element3 = scan.next();
            //<editor-fold desc="Third element library">
            if (element3.equalsIgnoreCase("c")) {
                three = 12.01;
            }
            if(element3.equalsIgnoreCase("o")){
                three = 15.99;
            }
            if(element3.equalsIgnoreCase("n")){
                three = 14.01;
            }
            if(element3.equalsIgnoreCase("h")){
                three = 1.01;
            }
            if(element3.equalsIgnoreCase("Li")){
                three = 6.94;
            }
            if(element3.equalsIgnoreCase("Be")){
                three = 9.01;
            }
            if(element3.equalsIgnoreCase("B")){
                three = 10.81;
            }
            if(element3.equalsIgnoreCase("F")){
                three = 19;
            }
            if(element3.equalsIgnoreCase("na")){
                three = 22.99;
            }
            if(element3.equalsIgnoreCase("Mg")){
                three = 24.31;
            }
            if(element3.equalsIgnoreCase("Al")){
                three = 26.98;
            }
            if(element3.equalsIgnoreCase("si")){
                three = 28.09;
            }
            if(element3.equalsIgnoreCase("p")){
                three = 30.97;
            }
            if(element3.equalsIgnoreCase("s")){
                three = 32.06;
            }
            if(element3.equalsIgnoreCase("cl")){
                three = 35.45;
            }
            if(element3.equalsIgnoreCase("k")){
                three = 39.1;
            }
            if(element3.equalsIgnoreCase("ca")){
                three = 40.08;
            }
            if(element3.equalsIgnoreCase("sc")){
                three = 44.96;
            }
            if(element3.equalsIgnoreCase("ti")){
                three = 47.87;
            }
            if(element3.equalsIgnoreCase("v")){
                three = 50.94;
            }
            if(element3.equalsIgnoreCase("cr")){
                three = 52;
            }
            if(element3.equalsIgnoreCase("mn")){
                three = 54.93;
            }
            if(element3.equalsIgnoreCase("fe")){
                three = 55.85;
            }
            if(element3.equalsIgnoreCase("co")){
                three = 58.93;
            }
            if(element3.equalsIgnoreCase("ni")){
                three = 58.69;
            }
            if(element3.equalsIgnoreCase("cu")){
                three = 63.55;
            }
            if(element3.equalsIgnoreCase("zn")){
                three = 65.38;
            }
            if(element3.equalsIgnoreCase("ga")){
                three = 69.72;
            }
            if(element3.equalsIgnoreCase("ge")){
                three = 72.63;
            }
            if(element3.equalsIgnoreCase("as")){
                three = 74.92;
            }
            if(element3.equalsIgnoreCase("se")){
                three = 78.97;
            }
            if(element3.equalsIgnoreCase("br")){
                three = 79.9;
            }
            if(element3.equalsIgnoreCase("rb")){
                three = 85.47;
            }
            if(element3.equalsIgnoreCase("sr")){
                three = 87.62;
            }
            if(element3.equalsIgnoreCase("y")){
                three = 88.91;
            }
            if(element3.equalsIgnoreCase("zr")){
                three = 91.22;
            }
            if(element3.equalsIgnoreCase("nb")){
                three = 92.91;
            }
            if(element3.equalsIgnoreCase("mo")){
                three = 95.95;
            }
            if(element3.equalsIgnoreCase("tc")){
                three = 98;
            }
            if(element3.equalsIgnoreCase("ru")){
                three = 101.07;
            }
            if(element3.equalsIgnoreCase("rh")){
                three = 102.91;
            }
            if(element3.equalsIgnoreCase("pd")){
                three = 106.42;
            }
            if(element3.equalsIgnoreCase("ag")){
                three = 107.87;
            }
            if(element3.equalsIgnoreCase("cd")){
                three = 112.41;
            }
            if(element3.equalsIgnoreCase("in")){
                three = 114.82;
            }
            if(element3.equalsIgnoreCase("sn")){
                three = 118.71;
            }
            if(element3.equalsIgnoreCase("sb")){
                three = 121.76;
            }
            if(element3.equalsIgnoreCase("te")){
                three = 127.6;
            }
            if(element3.equalsIgnoreCase("i")){
                three = 126.9;
            }
            if(element3.equalsIgnoreCase("cs")){
                three = 132.91;
            }
            if(element3.equalsIgnoreCase("ba")){
                three = 137.33;
            }
            if(element3.equalsIgnoreCase("hf")){
                three = 178.49;
            }
            if(element3.equalsIgnoreCase("ta")){
                three = 180.95;
            }
            if(element3.equalsIgnoreCase("w")){
                three = 183.84;
            }
            if(element3.equalsIgnoreCase("re")){
                three = 186.21;
            }
            if(element3.equalsIgnoreCase("os")){
                three = 190.23;
            }
            if(element3.equalsIgnoreCase("ir")){
                three = 192.22;
            }
            if(element3.equalsIgnoreCase("pt")){
                three = 195.08;
            }
            if(element3.equalsIgnoreCase("au")){
                three = 196.97;
            }
            if(element3.equalsIgnoreCase("hg")){
                three = 200.59;
            }
            if(element3.equalsIgnoreCase("tl")){
                three = 204.38;
            }
            if(element3.equalsIgnoreCase("pb")){
                three = 207.2;
            }
            if(element3.equalsIgnoreCase("bi")){
                three = 208.98;
            }
            if(element3.equalsIgnoreCase("po")){
                three = 209;
            }
            if(element3.equalsIgnoreCase("at")){
                three = 210;
            }
            if(element3.equalsIgnoreCase("fr")){
                three = 223;
            }
            if(element3.equalsIgnoreCase("ra")){
                three = 226;
            }
            //</editor-fold>
            System.out.println("How many of these?");
            int num3 = scan.nextInt();
            double Molarmass = (coeff1)*((one)*(num1) + (two)*(num2) + (three)*(num3));
            System.out.println("Your molar mass is: " + Molarmass);
        }
}}

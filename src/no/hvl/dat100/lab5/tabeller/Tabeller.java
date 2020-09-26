/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.hvl.dat100.lab5.tabeller;


public class Tabeller {

    /**
     * @desc metode for å skrive ut et heltallstabell
     * @param table
     */
    public static void skrivUt(int[] table) {
        for (int i = 0; i < table.length; i++) {
            String s = "element " + i + " is " + table[i];
            System.out.println(s);
        }

    }

    /**
     * @desc metode konvertere tabell av heltall til et bestemt format
     * @param table
     * @return String the result value
     */
    public static String tilStreng(int[] table) {
        String result = "[";
        for (int i = 0; i < table.length; i++) {
            // except last element
            if (i == table.length - 1) {
                result = result + table[i];
            } else {
                result = result + table[i] + ",";
            }
        }
        result = result + "]";
        return result;
    }

    /**
     * metode som returnerer summen av et heltallselement
     *
     * @param table
     * @return integer the sum result
     */
    public static int summer(int[] table) {
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            sum += table[i];
        }
        return sum;
    }

    /**
     * @desc samme som forrige metode, men bruker Wile loop
     * @param table
     * @return integer the sum result
     */
    public static int summerWhile(int[] table) {
        int sum = 0;
        int i = 0;
        while (i < table.length) {
            sum += table[i];
            i++;
        }
        return sum;
    }

    /**
     * @desc samme som forrige metode, men bruker mens loop extended for loop
     * @param table
     * @return integer the sum result
     */
    public static int summerExtendFor(int[] table) {
        int sum = 0;
        for (int element : table) {
            sum += element;
        }
        return sum;
    }

    /**
     * @desc metoden sjekker om tabellen inneholder et tal
     * @param table
     * @param number
     * @return
     */
    public static boolean finnesTall(int[] table, int number) {

        for (int element : table) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * @desc metode som returnerer posisjonen til et tall i en tabell
     * @param table
     * @param number
     * @return position of number
     */
    public static int posisjonTall(int[] table, int number) {

        for (int i = 0; i < table.length; i++) {
            if (table[i] == number) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @desc metoden reverserer en matrise
     * @param table
     * @return reversed matrise
     */
    public static int[] reverser(int[] table) {
        int len = table.length;
        int[] reversedArray = new int[len];
        for (int i = 0; i < len; i++) {
            reversedArray[i] = table[len - 1 - i];
        }
        return reversedArray;
    }

    /**
     *
     * @desc sjekk om matrisen er sortert stigende
     * @param table
     * @return
     */
    public static boolean erSortert(int[] table) {
        for (int i = 0; i < table.length - 1; i++) {
            if (table[i] > table[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @desc metode for å slå sammen to tabeller
     * @param table1
     * @param table2
     * @return the result merged array
     */
    public static int[] settSammen(int[] table1, int[] table2) {
        int len1 = table1.length;
        int len2 = table2.length;
        int lenTotal = len1 + len2;
        int[] result = new int[lenTotal];
        for (int i = 0; i < len1; i++) {
            result[i] = table1[i];
        }
        for (int j = 0; j < len2; j++) {
            result[j + len1] = table2[j];
        }
        return result;
    }

}

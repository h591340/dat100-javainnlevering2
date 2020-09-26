/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.hvl.dat100.lab6.matriser;


public class Matriser {

    /**
     * @desc print a two dimensions array
     * @param matrix 
     */
    public static void writeUtv1(int[][] matrix) {

        for (int[] array : matrix) {
            for (int element : array) {
                System.out.print(element);
            }
        }
    }

    /**
     * @desc convert matrix to string with a specific format
     * @param matrix
     * @return converted string
     */
    public static String tilStreng(int[][] matrix) {
        String result = "";
        for (int[] array : matrix) {
            for (int element : array) {
                result += element + " ";
            }
            result += "\\n";

        }

        return result;
    }

    /**
     * @desc scales a two dimensions array
     * @param tall
     * @param matrix
     * @return
     */
    public static int[][] skaler(int tall, int[][] matrix) {
        int[][] result = new int[matrix.length][];
        // initialize each row 
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[matrix[i].length];
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = matrix[i][j] * tall;
            }
        }
        return result;
    }

    /**
     * @desc compare two arrays
     * @param mat1
     * @param mat2
     * @return boolean true or false
     */
    public static boolean erLik(int[][] mat1, int[][] mat2) {

        int len1 = mat1.length;
        int len2 = mat2.length;
        if (len1 != len2) {
            return false;
        }
        for (int i = 0; i < len1; i++) {
            if (mat1[i].length != mat2[i].length) {
                return false;
            }
            for (int j = 0; j < mat1[i].length; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

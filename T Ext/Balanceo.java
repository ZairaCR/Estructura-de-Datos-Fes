/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd_listas;

import java.io.FileReader;
import java.io.BufferedReader;

/**
 *
 * @author michz
 */
public class Balanceo {

    public static void main(String[] args) {
        String documento1 = "texto1.txt";
        String conten1 = readFileContent(documento1);
        boolean balanceo1 = checkParenthesis(conten1);
        System.out.println("Archivo " + documento1 + " - Balanceo: " + balanceo1);

        String documento2 = "texto2.txt";
        String conten2 = readFileContent(documento2);
        boolean balanceo2 = checkParenthesis(conten2);
        System.out.println("Archivo " + documento2 + " - Balanceo: " + balanceo2);
    }

    public static boolean checkParenthesis(String stringToValidate) {
        Stack<Character> validatorStack = new Stack<>();

        for (int i = 0; i < stringToValidate.length(); i++) {
            char currentChar = stringToValidate.charAt(i);
            switch (currentChar) {
                case '(':
                case '[':
                case '{':
                    validatorStack.push(currentChar);
                    break;

                case ')':
                case ']':
                case '}':
                    if (validatorStack.isEmpy()) {
                        return false;
                    } else {
                        char charInStack = validatorStack.pop();
                        if (currentChar == ')' && charInStack != '(') {
                            return false;
                        } else if (currentChar == ']' && charInStack != '[') {
                            return false;
                        } else if (currentChar == '}' && charInStack != '{') {
                            return false;
                        }
                    }
                    break;

                default:
                    break;
            }
        }

        return validatorStack.isEmpy();
    }

    public static String readFileContent(String fileName) {
        String line, fileContent = "";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                fileContent += line;
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Error en el archivo");
        }
        return fileContent;
    }
}

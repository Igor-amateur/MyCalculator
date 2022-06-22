package com.example.mycalculator;

import java.util.Stack;

public class Calculator {
    private char ch; //Zmienna, do której zostanie zapisany aktualnie przetwarzany znak
    private double value;
    private boolean flag = true; //Potrzebne, aby program mógł odróżnić jednoargumentowy minus (-5) od odejmowania (2-5)	private Stack<Token> numberStack; //Stack z liczbami
    private Stack<Token> numberStack = new Stack<Token>(); //Stack z liczbami
    private Stack<Token> operationStack = new Stack<Token>(); //Stack z operacjami
    private Token item = new Token(); //obiekt typu Token
    private String mesError;
    ////////////////////////////////////////////


    private double Ctg(double x) { //Funkcja obliczania cotangensa
        double a = Math.cos(x);
        double b = Math.sin(x);
        return a / b;
    }

    /////////////////////////////////////////////

    private int getRang(char Ch) { //Funkcja zwraca priorytet operacji: „1” dla dodawania i odejmowania, „2” dla mnożenia i dzielenia i tak dalej.
        if (Ch == 's' || Ch == 'c' || Ch == 't' || Ch == 'g' || Ch == 'e')return 4;
        if (Ch == '^')return 3;
        if (Ch == '+' || Ch == '-')return 1;
        if (Ch == '*' || Ch == '/')return 2;
        else return 0;
    }

    private boolean Maths() { //Funkcja matematyczna wykonująca obliczenia
        //Funkcja jest typu bool, która zwraca „false” w przypadku wystąpienia błędu
        double a, b, c;
        a = numberStack.peek().value; //Weź najwyższą liczbę ze stosu liczb
//	    System.out.println(operationStack.peek().type);
        numberStack.pop(); //Usuń najwyższą liczbę ze stosu liczb
        switch (operationStack.peek().type) { //Sprawdzany jest typ górnej operacji ze stosu z operacjami
            case '+': //Jeśli typ operacji górnej ze stosu z operacjami dodawania
                b = numberStack.peek().value;
                numberStack.pop();
                c = a + b;
                item.type = '0';
                item.value = c;
                numberStack.push(new Token(item.type, item.value)); //Wynik operacji jest odkładany na stos z liczbami
                operationStack.pop();
                break;

            case '-':
                b = numberStack.peek().value;
                numberStack.pop();
                c = b - a;
                item.type = '0';
                item.value = c;
                numberStack.push(new Token(item.type, item.value));
                operationStack.pop();
                break;

            case '^':
                b = numberStack.peek().value;
                numberStack.pop();
                c = Math.pow(b, a);
                item.type = '0';
                item.value = c;
                numberStack.push(new Token(item.type, item.value));
                operationStack.pop();
                break;

            case '*':
                b = numberStack.peek().value;
                numberStack.pop();
                c = a * b;
//	        System.out.println("a = " + a);
//	        System.out.println("b = " +b);
//	        System.out.println("c = " +c);
                item.type = '0';
                item.value = c;
                numberStack.push(new Token(item.type, item.value));
                operationStack.pop();
                break;

            case '/':
                b = numberStack.peek().value;
                if (a == 0) {
           //         System.out.println("\nNie można podzielić przez 0!\n");
                    mesError = "\nNie można podzielić przez 0!\n";
                    return false;
                }
                else {
                    numberStack.pop();
                    c = (b / a);
                    item.type = '0';
                    item.value = c;
                    numberStack.push(new Token(item.type, item.value));
                    operationStack.pop();
                    break;
                }

            case 's':
                c = Math.sin(a);
                item.type = '0';
                item.value = c;
                numberStack.push(new Token(item.type, item.value));
                operationStack.pop();
                break;

            case 'c':
                c = Math.cos(a);
                item.type = '0';
                item.value = c;
                numberStack.push(new Token(item.type, item.value));
                operationStack.pop();
                break;

            case 't':
                if (Math.cos(a) <= 6.123233995736766E-17) {
             //       System.out.println( "\nNieprawidłowy argument dla tangens!\n");
                    mesError = "\nNieprawidłowy argument dla tangens!\n";
                    return false;
                }
                else {
                    c = Math.tan(a);
                    item.type = '0';
                    item.value = c;
                    numberStack.push(new Token(item.type, item.value));
                    operationStack.pop();
                    break;
                }

            case 'g':
                if (Math.sin(a) <= 1.2246467991473532E-16) {
             //       System.out.println("\nNieprawidłowy argument dla cotangens!\n");
                    mesError = "\nNieprawidłowy argument dla cotangens!\n";
                    return false;
                }
                else {
                    c = Ctg(a);
                    item.type = '0';
                    item.value = c;
                    numberStack.push(new Token(item.type, item.value));
                    operationStack.pop();
                    break;
                }

            case 'e':
                c = Math.exp(a);
                item.type = '0';
                item.value = c;
                numberStack.push(new Token(item.type, item.value));
                operationStack.pop();
                break;

            default:
          //      System.out.println("\nBłąd!\n");
                mesError = "\nBłąd!\n";
                return false;
        }
        return true;
    }


    public String calculate(String expression) {
        for (int i = 0; i < expression.length(); ++i) {
            ch = expression.charAt(i); //Patrzymy na postać z indeksem i
            if (ch == ' ') { //Ignorowanie spacji
                continue;
            }

            if (ch == 's' || ch == 'c' || ch == 't' || ch == 'e') { //Jeśli funkcja jest odczytywana
                char foo[] = new char[3]; //tablica 3 znaków do określenia typu funkcji odczytu
//            	System.out.println("foo length = " + foo.length);
                int k = 0;
                for (; k < 3; k++) {
//                	System.out.println("k = " + k + " & ch= " + expression.charAt(i+k));
                    ch = expression.charAt(i+k);
                    foo[k] = ch;

//                    System.out.println("foo[k] = " + foo[k]);

                }
                i+=k-1;
//                System.out.println( foo);
//                System.out.println("foo = " + foo[0]+foo[1]+foo[2]);
//                System.out.println("expression.charAt(i) = " + expression.charAt(i));
                if (foo[0] == 's' && foo[1] == 'i' && foo[2] == 'n') { //Jeśli funkcja odczytu jest sinusem
                    item.type = 's';
                    item.value = 0;
                    operationStack.push(new Token(item.type, item.value)); //Operacja jest wypychana na stos z operacjami
                    continue;
                }
                if (foo[0] == 'c' && foo[1] == 'o' && foo[2] == 's') { //Jeśli funkcja odczytu jest cosinus,
                    item.type = 'c';
                    item.value = 0;
                    operationStack.push(new Token(item.type, item.value)); //Operacja jest wypychana na stos z operacjami
                    continue;
                }
                if (foo[0] == 't' && foo[1] == 'a' && foo[2] == 'n') { //Jeśli odczytana funkcja jest styczna
//                    System.out.println("tan");
                    item.type = 't';
                    item.value = 0;
                    operationStack.push(new Token(item.type, item.value)); //Operacja jest wypychana na stos z operacjami
                    continue;
                }
                if (foo[0] == 'c' && foo[1] == 't' && foo[2] == 'g') { //Jeśli funkcją odczytu jest cotangens
                    item.type = 'g';
                    item.value = 0;
                    operationStack.push(new Token(item.type, item.value)); //Operacja jest wypychana na stos z operacjami
                    continue;
                }
                if (foo[0] == 'e' && foo[1] == 'x' && foo[2] == 'p') { //Jeśli funkcja odczytu jest wykładnikiem
                    item.type = 'e';
                    item.value = 0;
                    operationStack.push(new Token(item.type, item.value)); //Operacja jest wypychana na stos z operacjami
                    continue;
                }
            }
            if (ch == 'p') { //Jeśli Pi jest odczytywane
                item.type = '0';
                item.value = 3.14159265358979323846;//Pi;
                numberStack.push(new Token(item.type, item.value)); //Numer jest odkładany na stos z numerami
                flag = false;
                continue;
            }
            if (ch >= '0' && ch <= '9' || ch == '-' && flag == true) { //Jeśli jest odczytany numer
                int tmp = i;
                for(;i < expression.length(); ++i)
                {
                    if(!(expression.charAt(i) >= '0'
                            && expression.charAt(i) <= '9' || expression.charAt(i)=='.'))
                    {
                        break;
                    }
                }

                String str = expression.substring(tmp, i);
//            	System.out.println(str);
                value = Double.parseDouble(str);
//            	System.out.println(value);
                item.type = '0';
                item.value = value;
                --i;
                numberStack.add(new Token(item.type, item.value)); //Numer jest odkładany na stos z numerami
                flag = false;
                continue;
            }
            if (ch == '+' || ch == '-' && flag == false || ch == '*' || ch == '/' || ch == '^') { //Jeśli operacja jest odczytana
                if (operationStack.size() == 0) { //Jeśli stos operacji jest pusty
//                	System.out.println(ch);
                    item.type = ch;
                    item.value = 0;
                    operationStack.push(new Token(item.type, item.value)); //Operacja jest wypychana na stos z operacjami
                    continue;
                }
                if (operationStack.size() != 0 && getRang(ch) >
                        getRang(operationStack.peek().type)) { //Jeśli stos operacji NIE jest pusty, ale priorytet bieżącej operacji jest wyższy niż najwyższy w stosie operacji
                    item.type = ch;
                    item.value = 0;
                    operationStack.push(new Token(item.type, item.value)); //Operacja jest wypychana na stos z operacjami
                    continue;
                }
                if (operationStack.size() != 0 && getRang(ch) <=
                        getRang(operationStack.peek().type)) {//Jeśli stos z operacjami NIE jest pusty, ale priorytet bieżącej operacji jest niższy lub równy pierwszemu w stosie z operacjami
                    if (Maths() == false) { //Jeśli funkcja zwróci "false", to kończymy program
                        return mesError;
                    }
                    --i;
                    continue;
                }
            }
            if (ch == '(') { //Jeśli odczytany zostanie nawias otwierający
                item.type = ch;
                item.value = 0;
                operationStack.push(new Token(item.type, item.value)); //Operacja jest wypychana na stos z operacjami
                continue;
            }
            if (ch == ')') { //Jeśli odczytany zostanie nawias zamykający
//            	System.out.println("operationStack.size = " + operationStack.size());
                while (operationStack.peek().type != '(') {
                    if (Maths() == false) { //Jeśli funkcja zwróci „false”, przestań działać

                        return mesError;
                    }
                    else continue; //Jeśli wszystko jest w porządku
                }

                operationStack.pop();

                continue ;
            }
            else { //Jeśli odczytana zostanie jakaś dziwny znak
                System.out.println("\nWprowadzono nieprawidłowe wyrażenie!\n");

                return "\nWprowadzono nieprawidłowe wyrażenie!\n";
            }
        }
        while (operationStack.size() != 0) { //Nazywamy mat. funkcja dopóki na stosie nie znajdzie się 0 elementów z operacjami
            if (Maths() == false) { //Jeśli funkcja zwróci „false”, przestań działać

                return mesError;
            }
            else continue; //Jeśli wszystko jest w porządku
        }
        return Double.toString( numberStack.peek().value); //Wypisujemy odpowiedź

    }

}


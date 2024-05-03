import javax.swing.JOptionPane;

import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        exercicio25();
    }

    public static void exercicio1() {

        int[] arr = new int[3];
        String le;
        le = JOptionPane.showInputDialog(null, "Escreva um número");
        int nro1 = Integer.parseInt(le);
        arr[0] = nro1;

        le = JOptionPane.showInputDialog(null, "Escreva o segundo numero");
        int nro2 = Integer.parseInt(le);
        arr[1] = nro2;

        le = JOptionPane.showInputDialog(null, "Escreva o terceiro número");
        int nro3 = Integer.parseInt(le);
        arr[2] = nro3;

        int media = (arr[0] + arr[1] + arr[2]) / 3;

        JOptionPane.showMessageDialog(null, "A média é " + media);
    }

    public static void exercicio2() {
        int[] arr = new int[2];
        String le;
        le = JOptionPane.showInputDialog(null, "Escreva um número");
        int nro1 = Integer.parseInt(le);
        arr[0] = nro1;

        le = JOptionPane.showInputDialog(null, "Escreva o segundo numero");
        int nro2 = Integer.parseInt(le);
        arr[1] = nro2;

        JOptionPane.showMessageDialog(null, "A area do retangulo é " + (arr[0] * arr[1]));
    }

    public static void exercicio3() {
        int arr[] = new int[1];
        String le;
        le = JOptionPane.showInputDialog(null, "Escreva um número para ver seu antecessor e sucessor");
        int nro = Integer.parseInt(le);
        arr[0] = nro;

        le = JOptionPane.showInputDialog(null, "Escreva o segundo número pra ver o antecessor e sucessor: ");
        int nro1 = Integer.parseInt(le);
        arr[1] = nro1;

        JOptionPane.showMessageDialog(null,
                "O antecessor do primeiro número é " + (nro - 1) + ", e do segundo é" + (nro1 - 1));
        JOptionPane.showMessageDialog(null,
                "O antecessor do primeiro número é " + (nro - 1) + ", e do segundo é" + (nro1 - 1));
    }

    public static void exercicio4() {
        int arr[] = new int[2];

        String le;

        le = JOptionPane.showInputDialog(null, "Escreva um numero");
        int nro1 = Integer.parseInt(le);
        arr[0] = nro1;

        le = JOptionPane.showInputDialog(null, "Escreva o segundo numero ");
        int nro2 = Integer.parseInt(le);
        arr[1] = nro2;

        if (arr[0] % 2 == 0 && arr[1] % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Ambos os numeros são pares");
        } else if (arr[0] % 2 == 0 || arr[1] % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Um deles é par");
        } else if (arr[0] % 2 > 0 && arr[1] % 2 > 0) {
            JOptionPane.showMessageDialog(null, "Ambos os numeros são impares");
        }
    }

    public static void teste() {
        int test[] = new int[6];

        int soma = 0;
        for (int i = 0; i < test.length; i++) {

        }
    }

    public static void exercicio5() {
        String le;
        le = JOptionPane.showInputDialog("Escreva um numero ");
        int nro = Integer.parseInt(le);

        int fatorial = 1;
        for (int i = 1; i <= nro; i++) {
            fatorial *= i;
        }

        JOptionPane.showMessageDialog(null, "O fatorial de " + nro + " é " + fatorial);

    }

    public static void exercicio6() {
        String letra;
        letra = JOptionPane.showInputDialog(null, "Digite uma letra");

        String vogais[] = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };

        if (letra.equals(vogais[0]) || letra.equals(vogais[1]) || letra.equals(vogais[2]) || letra.equals(vogais[3])
                || letra.equals(vogais[4]) || letra.equals(vogais[5]) || letra.equals(vogais[6])
                || letra.equals(vogais[7]) || letra.equals(vogais[8]) || letra.equals(vogais[9])) {
            JOptionPane.showMessageDialog(null, "A letra " + letra + " é uma vogal");
        } else {
            JOptionPane.showMessageDialog(null, "A letra " + letra + "é consoante");
        }

    }

    public static void exercicio7() {
        String le;
        int[] array = new int[1];

        le = JOptionPane.showInputDialog("Escreva um ano: ");
        int nro1 = Integer.parseInt(le);
        array[0] = nro1;

        if (array[0] == 1946 || array[0] == 1942) {
            JOptionPane.showMessageDialog(null, "o ano era pra ter copa mas não é de copa");
        } else if (array[0] >= 1930 && (array[0] - 1930) % 4 == 0) {
            JOptionPane.showMessageDialog(null, "é ano de copa");
        } else {
            JOptionPane.showMessageDialog(null, "não é ano de copa");
        }
    }

    public static void exercicio8() {
        double[] imc = new double[2];
        String le;

        le = JOptionPane.showInputDialog(null, "Escreva sua altura: ");
        double nro = Double.parseDouble(le);
        imc[0] = nro;

        le = JOptionPane.showInputDialog(null, "Escreva seu peso: ");
        double alt = Double.parseDouble(le);
        imc[1] = alt;

        double calculo = imc[1] / (imc[0] * imc[0]);

        JOptionPane.showMessageDialog(null, "O seu IMC é: " + calculo);
    }

    public static void exercicio9() {
        String le;

        le = JOptionPane
                .showInputDialog("Escreva 1 para Adição, 2 para Subtração, 3 para Divisão ou 4 para multiplicação");
        int escolha = Integer.parseInt(le);

        le = JOptionPane.showInputDialog("Escreva o primeiro número");
        double nro1 = Double.parseDouble(le);

        le = JOptionPane.showInputDialog("Escreva o segundo número");
        double nro2 = Double.parseDouble(le);

        switch (escolha) {
            case 1:
                JOptionPane.showMessageDialog(null, nro1 + nro2);
                break;

            case 2:
                JOptionPane.showMessageDialog(null, nro1 - nro2);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, nro1 / nro2);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, nro1 * nro2);
                break;
        }

    }

    public static void exercicio10() {
        String le;

        le = JOptionPane.showInputDialog("Tente adivinhar o número!");
        int letra = Integer.parseInt(le);

        Random random = new Random();
        int resultado = random.nextInt(10) + 1;

        if (letra == resultado) {
            JOptionPane.showMessageDialog(null, "O número correto era " + resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Errou");
        }
    }

    public static void exercicio11() {
        int quantidade = 5;
        int A[] = new int[6];
        int B[] = new int[6];

        int num = 0;

        for (int i = 0; i <= quantidade; i++) {
            num++;
            B[i] = num;
        }

        int num2 = 0;

        for (int i = 0; i <= B[4]; i++) {
            num2++;
            A[i] = num2;
        }

        System.out.println(B[0]);
        System.out.println(A[0]);

    }

    public static void exercicio12() {
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int B[] = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = 2 * A[i];
        }

        System.out.println(B[1]);
    }

    public static void exercicio13() {
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int B[] = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * A[i];
        }

        System.out.println(B[15]);
    }

    public static void exercicio14() {
        double A[] = { 30, 40, 50, 68, 70, 30, 45, 99, 95, 139, 121, 124, 135, 145, 150 };
        double B[] = new double[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = Math.sqrt(A[i]);
        }

        System.out.println(B[2]);
    }

    public static void exercicio15() {
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int B[] = new int[A.length];

        for (int i = 1; i < A.length; i++) {
            B[i] = A[i] * i;
        }

        System.out.println(B[1]);
    }

    public static void exercicio16() {
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int B[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int C[] = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            C[i] = B[i] + A[i];
        }
        System.out.println(C[0]);
    }

    public static void exercicio17() {
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int B[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int C[] = new int[10];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] - B[i];
        }

        System.out.println(C[0]);
    }

    public static void exercicio18() {
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int B[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int C[] = new int[10];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] * B[i];
        }

        System.out.println(C[0]);
    }

    public static void exercicio19() {
        String le;
        int A[] = new int[10];

        for (int i = 0; i < A.length; i++) {
            le = JOptionPane.showInputDialog("Escreva um número: ");
            int nro1 = Integer.parseInt(le);
            A[i] = nro1;
            System.out.println(nro1);
        }
    }

    public static void exercicio20() {
        String le;
        int A[] = new int[8];

        for (int i = 0; i < A.length; i++) {
            le = JOptionPane.showInputDialog("Escreve um número: ");
            A[i] = Integer.parseInt(le);
        }

        int mn = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > mn) {
                mn = A[i];
            }
        }

        JOptionPane.showMessageDialog(null, "O maior numero é " + mn);
    }

    public static void exercicio21() {
        int vet1[] = new int[6];
        int vet2[] = new int[6];
        String le;

        for (int i = 0; i < vet1.length; i++) {
            le = JOptionPane.showInputDialog("Escreva um number");
            int n = Integer.parseInt(le);
            vet1[i] = n;
            vet2[i] = vet1[i];
        }
        JOptionPane.showMessageDialog(null, "A COPIA É" + vet2[0] + " E A COPIA FICOU " + vet1[0]);
    }

    public static void exercicio22() {
        int[] A = new int[20];
        int soma = 0;

        // Ler os 20 números e calcular a soma
        for (int i = 0; i < A.length; i++) {
            String le = JOptionPane.showInputDialog("Digite um número:");
            int nro = Integer.parseInt(le);
            A[i] = nro;
            soma += nro;
        }

        double media = (double) soma / A.length;

        JOptionPane.showMessageDialog(null, "A média dos números é: " + media + " Média");

        StringBuilder valoresMenores = new StringBuilder("Valores menores que a média (" + media + "):\n");
        for (double num : A) {
            if (num < media) {
                valoresMenores.append(num).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, valoresMenores.toString() + "Valores Menores que a Média");
    }

    public static void exercicio23() {
        String le;
        int A[] = new int[10];

        for (int i = 1; i < A.length; i++) {
            le = JOptionPane.showInputDialog("Escreva um número: ");
            A[i] = Integer.parseInt(le);
        }

    }

    public static void extra() {

        double[] num = new double[2];
        String le;

        le = JOptionPane.showInputDialog(null,
                "Escolha 1 para Adição, 2 para Subtração, 3 para Multiplicação ou 4 para Divisão.");
        int escolha = Integer.parseInt(le);

        for (int i = 0; i < num.length; i++) {
            le = JOptionPane.showInputDialog(null, "Escreva um número");
            double brabo = Double.parseDouble(le);
            num[i] = brabo;
        }

        switch (escolha) {
            case 1:
                JOptionPane.showMessageDialog(null, num[0] + num[1]);
                break;

            case 2:
                JOptionPane.showMessageDialog(null, num[0] - num[1]);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, num[0] * num[1]);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, num[0] / num[1]);
                break;
            default:
                break;
        }
    }

    public static void exercicio24() {
        int A[] = { 20, 40, 50, 60 };
        int B[] = { 10, 45, 50, 60 };
        int C[] = new int[A.length];

        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < A.length; i++) {
                if (B[i] > B[i] * i) {
                    int temp = B[i];
                    B[i] = B[i + i];
                    B[i + i] = temp;
                    trocou = true;
                }

                if (A[i] > A[i] * i) {
                    int temp = A[i];
                    A[i] = A[i + i];
                    A[i + i] = temp;
                    trocou = true;
                }
            }
        } while (trocou);

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    C[j] = B[i];
                    System.out.println(B[i]);
                }
            }
        }
    }

    public static void exercicio25() {
        int A[] = { 5, 10, 20, 30, 40 };
        int B[] = new int[6];
        int C[] = new int[A.length];

        String le;
        int num = 0;

        for (int i = 0; i < A.length; i++) {
            le = JOptionPane.showInputDialog(null, "Escreva o " + i + "número");
            num = Integer.parseInt(le);
            B[i] = num;
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    C[i] = B[j];
                    JOptionPane.showMessageDialog(null, C[i]);
                }
            }
        }
    }

    public static void exercicio26() {
        // Declara os dois arrays
        int[] numbers1 = { 1, 2, 3, 4, 5 };
        int[] numbers2 = { 3, 4, 5, 6, 7, 8, 9, 10 };

        int finalNumbersPositions = 0;

        for (int number1 : numbers1) {

            boolean isNumber1Present = false;

            for (int number2 : numbers2) {
                if (!isNumber1Present && number1 == number2) {
                    isNumber1Present = true;
                }
            }

            if (!isNumber1Present) {
                finalNumbersPositions++;
            }
        }

        for (int number2 : numbers2) {

            boolean isNumber2Present = false;

            for (int number1 : numbers1) {
                if (!isNumber2Present && number2 == number1) {
                    isNumber2Present = true;
                }
            }

            if (!isNumber2Present) {
                finalNumbersPositions++;
            }
        }

        int[] finalNumbers = new int[finalNumbersPositions];
        int finalNumbersIndex = 0;

        for (int number1 : numbers1) {

            boolean isNumber1Present = false;

            for (int number2 : numbers2) {
                if (!isNumber1Present && number1 == number2) {
                    isNumber1Present = true;
                }
            }

            if (!isNumber1Present) {
                finalNumbers[finalNumbersIndex] = number1;
                finalNumbersIndex++;
            }
        }

        for (int number2 : numbers2) {

            boolean isNumber2Present = false;

            for (int number1 : numbers1) {
                if (!isNumber2Present && number2 == number1) {
                    isNumber2Present = true;
                }
            }

            if (!isNumber2Present) {
                finalNumbers[finalNumbersIndex] = number2;
                finalNumbersIndex++;
            }
        }

        for (int number : finalNumbers) {
            System.out.println(number);
        }
    }

    public static void exercicio27() {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        String le;

        le = JOptionPane.showInputDialog("Qual posição do array você quer modificar? (0 a 5)");
        int num = Integer.parseInt(le);

        le = JOptionPane.showInputDialog("Por qual numero voce deseja modificar? ");
        int numeroDigitado = Integer.parseInt(le);

        switch (num) {
            case 0:
                arr[0] = numeroDigitado;
                System.out.println(
                        "O resultado ficou: {" + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]
                                + " " + arr[5] + "}");
                break;
            case 1:
                arr[1] = numeroDigitado;
                System.out.println(
                        "O resultado ficou: {" + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]
                                + " " + arr[5] + "}");
                break;
            case 2:
                arr[2] = numeroDigitado;
                System.out.println(
                        "O resultado ficou: {" + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]
                                + " " + arr[5] + "}");
                break;
            case 3:
                arr[3] = numeroDigitado;
                System.out.println(
                        "O resultado ficou: {" + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]
                                + " " + arr[5] + "}");
                break;
            case 4:
                arr[4] = numeroDigitado;
                System.out.println(
                        "O resultado ficou: {" + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]
                                + " " + arr[5] + "}");
                break;
            case 5:
                arr[5] = numeroDigitado;
                System.out.println(
                        "O resultado ficou: {" + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]
                                + " " + arr[5] + "}");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Tente novamente", "ERROR", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }

    public static void exercicio28() {
        int A[] = { 1, 2, 3, 4, 5, 6 };
        int B[] = { 10, 20, 40, 50, 60 };
        int C[] = new int[6];

        String le;

    }

    public static void exercicio29() {
    }

    public static void exercicio30() {
        String[] array = { "laranja", "uva", "melancia", "brabo" };
        String resposta = JOptionPane.showInputDialog("Digite algo:");
        Boolean verdadeiro = false;

        for (int i = 0; i < array.length; i++) {
            if (resposta.equals(array[i])) {
                JOptionPane.showMessageDialog(null, "A palavra é: " + array[i] + " na posição " + i);
                verdadeiro = true;
                break;
            }
        }
        if (!verdadeiro) {
            JOptionPane.showMessageDialog(null, "Tente outro");
        }
    }
}

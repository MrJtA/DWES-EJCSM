import java.util.Scanner;

static Scanner sc = new Scanner(System.in);

public static void e1() {
    System.out.println("Introduce un numero: ");
    int numero = sc.nextInt();
    if ((numero%7) == 0) {
        System.out.println(numero + " es múltiplo de 7.");
    } else {
        System.out.println(numero + " no es es múltiplo de 7.");
    }
}

public static void e2() {
    for (int i = 0; i<=10; i++) {
        System.out.println(i);
    }
}


public static void main(String[] args) {
    e2();
}
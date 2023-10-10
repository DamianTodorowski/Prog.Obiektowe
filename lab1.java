import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l1,l2,l3,l4;
        System.out.println("Podaj 1 liczbe:");
        l1 = scanner.nextDouble();
        System.out.println("podaj 2 liczbe:");
        l2 = scanner.nextDouble();
        System.out.println("podaj 3 liczbe:");
        l3 = scanner.nextDouble();
        System.out.println("podaj 4 liczbe:");
        l4 = scanner.nextDouble();

        System.out.println("Suma liczb wynosi:" + (l1+l2+l3+l4));

     
    }
}
//^^^^^^^^^^^^^^^^^^
//Napisz program, który wczytuje ze standardowego wejścia cztery liczby wymierne, a następnie wypisuje ich sumę na standardowym wyjściu.



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l1,l2;
        System.out.println("Podaj 1 wymiar prostokata:");
        l1 = scanner.nextDouble();
        System.out.println("podaj 2 wymiar prostokata:");
        l2 = scanner.nextDouble();


        System.out.println("Pole wynosi:" + (l1*l2));


    }
}

//^^^^^^^^^^^^^^^^^^^
//Stwórz program do obliczenia pola prostokąta. Dane pobierz od użytkownika, wynik wyświetl na standardowym wyjściu.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l1,l2,l3;
        System.out.println("Podaj 1 liczbe:");
        l1 = scanner.nextDouble();
        System.out.println("podaj 2 liczbe:");
        l2 = scanner.nextDouble();
        System.out.println("podaj 2 liczbe:");
        l3 = scanner.nextDouble();

        if(l1>l2 && l1>l3){
            System.out.println("najwieksza to :" + l1);
        }
        else if(l2>l1 && l2>l3){
            System.out.println("najwieksza to :" + l2);
        }
        else if (l3>l1 && l3>l2) {
            System.out.println("najwieksza to :" + l3);
        }


    }
}


//^^^^^^^^^^^^^^^^^^^
//Napisz program, który przyjmuje trzy liczby całkowite jako argumenty i zwraca największą z nich. Zastosuj instrukcje warunkowe do porównania liczb.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dzien;
        System.out.println("Podaj dzien:");
        dzien = scanner.nextInt();


        if(dzien == 1){
            System.out.println("poniedzialek");
        } else if (dzien == 2) {
            System.out.println("wtorek");
        }
        else if (dzien == 3) {
            System.out.println("sroda");
        }
        else if (dzien == 4) {
            System.out.println("czwartek");
        }
        else if (dzien==5) {
            System.out.println("piatek");
        }
        else if (dzien==6) {
            System.out.println("sobota");
        }
        else if (dzien==7) {
            System.out.println("niedziela");
        }
        else {
            System.out.println("jestes poza zakresem");
        }


    }
}

//^^^^^^^^^^^^^^^^^^^
//Napisz program, który na podstawie podanego jako argument numeru dnia tygodnia (od 1 do 7) 
//wypisze nazwę tego dnia tygodnia. Dla przykładu, jeżeli użytkownik poda liczbę 1, program powinien wypisać “Poniedziałek”. 
//Jeżeli podana liczba nie jest z zakresu od 1 do 7, program powinien wyświetlić komunikat “Niepoprawny numer dnia tygodnia”.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rok;
        System.out.println("Podaj rok:");
        rok = scanner.nextInt();


      if(rok%4==0 && rok%100!=0 || rok%400==0){
          System.out.println("rok jest przestepny ");
      }
      else{
          System.out.println("rok nie jest przestepny ");
      }


    }
}
//^^^^^^^^^^^^^^^^^^^
//Napisz program, który będzie sprawdzał, czy podany rok jest rokiem przestępnym. Rok jest przestępny, 
//jeśli jest podzielny przez 4, ale nie jest podzielny przez 100, chyba że jest podzielny przez 400.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int godzina, minuta, sekunda;
        System.out.println("Podaj godzine:");
        godzina = scanner.nextInt();
        System.out.println("Podaj minute:");
        minuta = scanner.nextInt();
        System.out.println("Podaj sekunda:");
        sekunda =scanner.nextInt();


     if(godzina<24 && minuta <60 && sekunda <60){
         System.out.println("Poprawna Godzina!");
     }
    else {
         System.out.println("Bledny format");
     }

    }
}
//^^^^^^^^^^^^^^^^^^^^^^^
//Napisz program sprawdzający czy podane liczby z klawiatury mogą stanowić poprawna godzinę w formacie 24-godzinnym.

//Przykładowe wejście:

//Podaj godzinę: 22

//Podaj minuty: 12

//Podaj sekundy: 33

//Przykładowe wyjście:

//Poprawna godzina!


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      for(int i =1; i<=100; i++)
      {
          System.out.println(i+"\n");
      }

    }
}

//^^^^^^^^^^^^^^^^^^
//Napisz program, który wykorzystując pętlę for wyświetli liczby od 1 do 100








import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, pom, wynik;
        wynik=0;
        pom=0;
        System.out.println("Podaj liczbę: ");
        a = scanner.nextInt();

        while(a>0){
            pom=a%10;
            wynik+=pom;
            a=a/10;
            if(a>0){
                wynik = wynik * 10;

            }
        }
        System.out.println(wynik);
    }

}

//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//Stwórz program który przyjmie od użytkownika liczbę całkowitą i zwróci tę liczbę w odwrotnej kolejności 
//np. dla 12345 ma zwrócić 54321. Możesz ograniczyć program tylko do liczb dodatnich.







import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String slowo1, slowo2;
        System.out.println("podaj 1 slowo: ");
        slowo1=scanner.next();
        System.out.println("podaj 2 slowo: ");
        slowo2=scanner.next();
        System.out.println(slowo1);
        System.out.println(slowo2);
    }

}
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//Napisz program, który wczytuje ze standardowego wejścia dwa łańcuchy znaków, a następnie wypisuje je w kolejnych wierszach na standardowym wyjściu.

/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);
        System.out.println("Możliwe opcje:");
      System.out.println("0.Wyjście");
       System.out.println("1.Dodaj Studenta");
       System.out.println("2.Wypisz studentów");
      System.out.println("Wybierz opcje");
      int opcja =scan.nextInt();
      
 Service s = new Service();
      switch(opcja)
        {
          case 1:
            {
               System.out.println("Podaj imie");
               String imie =scan.next();
              System.out.println("Podaj wiek");
              int wiek= scan.nextInt();
                 System.out.println("Podaj nazwisko");
               String nazwisko =scan.next();
              System.out.println("Podaj adres");
               String adres =scan.next();
              
                s.addStudent(new Student(imie,wiek,nazwisko,adres));
              break;
            }
          case 0:
            {
              System.exit(0);
            }
          case 2:
            {
              var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
            }
            
        }
      
      
      
     
     // s.addStudent(new Student("Krzysztof", 20));
     // s.addStudent(new Student("Janusz", 40));

     // var students = s.getStudents();
     // for(Student current : students) {
       // System.out.println(current.ToString());
     // }
    } catch (IOException e) {

    }
  }
}
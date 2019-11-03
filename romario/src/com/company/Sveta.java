package com.company;

public class Sveta extends Shark {
      void beliash_check(String a) {
          switch (a) {
              case "Yes":
              case "Да":
                  System.out.println("Молодец, не соврала");
                  break;
              case "No":
              case "Нет":
                  System.out.println("Не ври!Попробуй еще раз ");
                  yes_no(a);
                  break;
              default:
                  while ((!a.equals("Yes") || (!a.equals("Да")))) {
                      if (a.equals("Yes") || (a.equals("Да"))) {
                          System.out.println("Молодец, Good job");
                          break;
                      }
                      System.out.println("Не ври!Попробуй еще раз ");
                      a = sc.nextLine();
                  }
          }
      }
    private void yes_no(String a) {
        while (!a.equals("Yes") || (!a.equals("Да"))) {
            a = sc.nextLine();
            if (a.equals("Yes") || a.equals("Да")) {
                System.out.println("Молодец, Света");
                System.exit(0);
            }
            System.out.println("Не ври!Попробуй еще раз ");
        }
    }

}




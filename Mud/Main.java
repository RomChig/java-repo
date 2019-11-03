
class Main {
    public static void main(String[] args) {
        Human LIZA = new Human();
        Scanner name = new Scanner(System.in);
        Scanner Age = new Scanner(System.in);
        System.out.println("Введите пожалуйста ваше имя: ");
        String Name = name.nextLine();
        LIZA.check_name(Name);
        // while (!Name.equals(LIZA.NAME)) {System.out.println("Введите пожалуйста еще раз ваше имя: "); Name = name.nextLine();}
        System.out.println("Введите пожалуйста ваш возраст: ");
        int AGE = Age.nextInt();
        LIZA.check_name(Age.);
    }
}
public class Dan extends Friends {
    @Override
    public void skills(){
        Dan dan = new Dan();
        dan.setNameRaceAge("Denis","man",17,"1-a Prodolnaya Apt 57");
        System.out.println(dan.getName());
        System.out.println(dan.getRace());
        System.out.println(dan.getAge());
        System.out.println(dan.getAddress());
        System.out.println("Denis likes to earn much money\n");
    }
}

public class Nick extends Friends{
    @Override
    public void skills(){
        Nick nick  = new Nick();
        nick.setNameRaceAge("Nikita","man",19,"");
        System.out.println(nick.getName());
        System.out.println(nick.getRace());
        System.out.println(nick.getAge());
        System.out.println("Nikita knows how to easy be in love with somebody\n");
    }
}

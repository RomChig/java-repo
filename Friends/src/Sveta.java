public class Sveta extends Friends {
    @Override
    public void skills() {
        Sveta sveta = new Sveta();
        sveta.setNameRaceAge("Sveta","woman",19,"");
        System.out.println(sveta.getName());
        System.out.println(sveta.getRace());
        System.out.println(sveta.getAge());
        System.out.println("Sveta likes to eat XD");
    }
}

public class Friends {
    private String name;
    private int age;
    private String race;
    private String address;

    public void setNameRaceAge(String name, String race,int age,String address){
        this.name = name;
        this.race = race;
        this.age = age;
        this.address = address;
    }

    public String getName() { return name; }
    public String getRace() { return race; }
    public int getAge() { return age; }
    public String getAddress(){ return address; }


    public void skills() {
        System.out.println("Do some skills");
    }
}

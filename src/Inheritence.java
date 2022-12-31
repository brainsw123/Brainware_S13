public class Inheritence {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.insert("Dipak","Kolkata");
        obj.display();
    }
}

class Base
{
    String name,address;
    void insert(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    void display()
    {
        System.out.println("Name: "+name+" Address: "+address);
    }
}
class Derived extends Base
{

}
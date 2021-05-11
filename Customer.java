public class Customer {
    private String _name;
    private int age;
    public Customer (String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

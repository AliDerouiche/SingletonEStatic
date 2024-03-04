public class User {
    private String name;
    private Integer age;

    public User() {
        this.name = "Default";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("name = " + getName() + ", age = " + getAge());
    }
}

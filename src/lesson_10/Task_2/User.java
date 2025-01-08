package lesson_10.Task_2;

class User implements Cloneable {
    private int id;
    private String name;
    private Address address;

    public User(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', address=" + address + "}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public User deepClone() throws CloneNotSupportedException {
        User clonedUser = (User) this.clone();
        clonedUser.setAddress((Address) address.clone());
        return clonedUser;
    }
}


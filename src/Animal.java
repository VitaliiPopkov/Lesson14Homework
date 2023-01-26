public enum Animal {
    CAT(4), DOG(6), PIG(2);
    private int age;

    Animal(int age) {
        this.age = age;
    }

//    public int getAge() {
//        return age;
//    }

    public String toString() {
        return "Animal: " + name() + ", " + age + " " + " years old";
    }


}







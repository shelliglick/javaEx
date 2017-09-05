public abstract  class Animal {

    int num;

    protected Animal(int n) {
        num = n;
    }

    abstract void speak();

    protected void number() {
        System.out.println(num);
    }
}

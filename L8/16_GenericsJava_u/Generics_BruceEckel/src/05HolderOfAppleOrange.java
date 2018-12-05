//: from Bruce Eckel's Thinking in Java 4e (code available at mindviewinc.com )
//: generics/Holder.java
class Fruit{}
class Apple extends Fruit{}
class Orange extends Fruit{}
class Holder<T> {
  private T value;
  public Holder() {}
  public Holder(T val) { value = val; }
  public void set(T val) { value = val; }
  public T get() { return value; }
  public boolean equals(Object obj) {
    return value.equals(obj);
  }	
  public static void main(String[] args) {
    Holder<Apple> appleHolder = new Holder<Apple>(new Apple());
    Apple d = appleHolder.get();
    appleHolder.set(d);
    // Holder<Fruit> fruitHolder = appleHolder; // Cannot upcast
    Holder<? extends Fruit> moreGenericFruitHolder = appleHolder; // OK
    Fruit p = moreGenericFruitHolder.get();
    d = (Apple)moreGenericFruitHolder.get(); // Returns 'Object'
    try {
      Orange c = (Orange)moreGenericFruitHolder.get(); // No warning
    } catch(Exception e) { System.out.println(e); }
    // moreGenericFruitHolder.set(new Apple()); // Cannot call set()
    // moreGenericFruitHolder.set(new Fruit()); // Cannot call set()
    System.out.println(moreGenericFruitHolder.equals(d)); // OK
  }
} /* Output: (Sample)
java.lang.ClassCastException: Apple cannot be cast to Orange
true
*///:~

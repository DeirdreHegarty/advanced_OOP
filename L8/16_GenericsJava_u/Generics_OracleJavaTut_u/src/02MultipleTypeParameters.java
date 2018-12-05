/**
 * @see http://docs.oracle.com/javase/tutorial/java/generics/types.html
 */
interface Pair<K, V> {
    public K getKey();
    public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
}

class Blob{
	int x;
	Blob(int anX) { x = anX; }
	public String toString(){ return "Blob:"+Integer.toString(x); }
}

class Test{
	public static void main(String[] args){
		Pair<String, Blob> stringBlobPair = new OrderedPair<>("bob", new Blob(47) );
		String s = stringBlobPair.getKey();
		Blob b   = stringBlobPair.getValue();
		
		System.out.println("OrderedPair <String: "+ s +", "+ b +">");
	}
}
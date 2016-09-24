import java.util.*;
import java.util.ListIterator.*;

public class Box<T> {
	private T t;
	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return this.t;
	}

	public <U extends Integer> void inspect(U obj) {
		System.out.println(t.getClass().getName());
		System.out.println(obj.getClass().getName());
		System.out.println(obj.floatValue());
	}

	public static void main(String[] args) {
		Box<Number> box = new Box<>();
		// box.set("error");
		//box.inspect(new Integer(20));

		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfList(li));

		List<Integer> li2 = Arrays.asList(1, 2, 3);
		print(li2);

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		ListIterator<Integer> it;
		for (it = list.listIterator(list.size()); it.hasPrevious(); ) {
		    System.out.println(it.previous());
		}
		it = list.listIterator(3);
		System.out.println(it.previous());
		System.out.println(it.remove());
	}

	public static double sumOfList(List<? extends Number> list) {
	    double s = 0.0;
	    for (Number n : list)
	        s += n.doubleValue();
	    return s;
	}

	public static <E extends Number> void print(List<E> list) {
		for (E e : list) {
			System.out.println(e);
		}
	}
}
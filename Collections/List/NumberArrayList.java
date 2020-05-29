package list_assignments;
import java.util.ArrayList;
public class NumberArrayList<E> extends ArrayList<E> {
	public boolean add(E e)
	{
		if(e instanceof Integer|| e instanceof Float || e instanceof Double || e instanceof Short || e instanceof Long || e instanceof Byte)
		{
			super.add(e);
			return true;
		}
		else
		{
			throw new ClassCastException("Only Number types are allowed.");
		}

	}
}

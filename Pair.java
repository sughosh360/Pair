import java.util.*;
public class Pair<T1, T2> implements Comparable{

	T1 first;
	T2 second;
	
	public Pair(T1 first, T2 second){
		this.first = first;
		this.second = second;
	}
	
	
	
	public void add(T1 f,T2 s)
	{
		first = f;
		second = s;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Pair arg0 = (Pair) o;
		if(this.first.equals(arg0.first)){
			return(((Comparable) (this.second)).compareTo(arg0.second));
		}
		return ( (Comparable) this.first).compareTo(arg0.first);
	}
}

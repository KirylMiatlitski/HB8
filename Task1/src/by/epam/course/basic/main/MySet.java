package by.epam.course.basic.main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MySet <T> {
	private T[] mySet;	
	
	@SuppressWarnings("unchecked")
	public MySet(Class<T> t){		
		mySet =  (T[]) Array.newInstance(t , 0);        
	}	
	
	public int size() {		
		return mySet.length;
	}
	
	public boolean isEmpty() {		
		if (mySet.length == 0){
			return true;
		} else {
			return false;
		}		
	}
	
	public boolean contains(T obj) {
		
		for (int i = 0; i < mySet.length; i++){
			if (mySet[i].equals(obj)){
				return true;
			}
		}
		return false;
	}	
	
	@SuppressWarnings("unchecked")
	public T[] toArray() {		
		return (T[]) Arrays.copyOf(mySet, size(), mySet.getClass());
	}	
	
	@SuppressWarnings("unchecked")
	private void increaseSize( T e){
		if (size()==0){
			T[] temp = (T[]) Array.newInstance(e.getClass() , size()+1);//(T[]) Arrays.copyOf(mySet, size()+1, mySet.getClass());//(T[]) new Object[this.size()+1];			
			temp[0]= e;
			this.mySet = temp;
		} else {
			T[] temp = (T[]) Array.newInstance(e.getClass() , size()+1);//(T[]) Arrays.copyOf(mySet, size()+1, mySet.getClass());//(T[]) new Object[this.size()+1];
			for (int i = 0; i < size(); i++){
				temp[i] = mySet[i];
			}
			temp[size()]= e;
			this.mySet = temp;
		}		
	}
	
	public boolean add(T e) {
 		if (size() == 0 ) {
			increaseSize(e);		
			return true;
		} else {
			for (int i = 0; i < size(); i++){
				if (mySet[i].equals(e)){
					return false;
				}
			}
			increaseSize(e);	
			return true;
		}		
	}
	
	@SuppressWarnings("unchecked")
	public boolean remove(T o) {
		int count = 0;
		for (int i = 0; i < size(); i++){
			if (mySet[i].equals(o)){
				count++;
			}
		}
		if (count == 0){
			return false;
		} else {			
			T[] temp = (T[]) Array.newInstance(mySet[0].getClass() , size()-count);//(T[]) new Object[this.size()-count];
			int k = 0;
			for (int i = 0; i < size(); i++){
				if (!(mySet[i].equals(o))){
					temp[k] = mySet[i];
					k++;
				}			
			}
			this.mySet = temp;			
			return true;
		}
	}

	public void clear() {
		mySet=null;		
	}
	
	public String toString(){
		String temp = "";
		for (int i = 0; i < size(); i++){
			temp = temp +  mySet[i] + " ";
		}
		return temp;		
	}	
}



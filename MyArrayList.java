package zCollections;

import java.util.Arrays;

public class MyArrayList<T>{

	 // Object array which actually stores the data
	 Object[] element;
	 
	 // The variable which gets incremented after every ading in the list
	 int size;
	 
	 public void add(T t){
	  
		  // If the array is null, instantiate the array with size 2
		  if(element==null){
			  element = new Object[2];
		  }
		  // If the size of the array has reached its threshold then recreate the array with a new size
		  // and copy the contains of old array in the new one
		  else if(size==element.length-1){
		   
			   int newSize = ((element.length*3)/2)+1;
			   element = Arrays.copyOf(element, newSize);
		  }
		  element[size]=t;
		  size++;
	 }
	 public T get(int position){
	  
		 return (T)element[position];
	 }
	 
}
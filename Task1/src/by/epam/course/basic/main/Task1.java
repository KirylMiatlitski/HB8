package by.epam.course.basic.main;

/**
 * @author Kiryl_Miatlitski
 *
 * Date: 5 March 2017
 * 
 * Task: Реализуйте самостоятельно динамическую структуру Множество, не содержащую дублирующихся элементов. 
 * Используйте параметризацию при описании класса. (Условие не означает необходимости повторить все возможности класса HashSet).
 */
public class Task1 {

		public static void main(String args[]){
			
			
			
			MySet<Integer> mySet = new MySet<Integer>(Integer.class);
			
			System.out.println("Is empty: " + mySet.isEmpty());
			System.out.println("Size: " + mySet.size());
			
					
			System.out.println("Adding 1:" + mySet.add(1));
			System.out.println("Adding 3:" + mySet.add(3));
			System.out.println("Adding 15:" + mySet.add(15));
			System.out.println("Adding 78:" + mySet.add(78));
			System.out.println("Size: " + mySet.size());
			System.out.println("Set: " + mySet);
			
			System.out.println("================");
			
			System.out.println("Adding 15:" + mySet.add(15));
			System.out.println("Size: " + mySet.size());
			System.out.println("Set: " + mySet);
			
			System.out.println("================");
			
			System.out.println("Contains 3: " + mySet.contains(3));
			
			
			System.out.println("================");
			
			System.out.println("Removing 3: " + mySet.remove(3));
			System.out.println("Size: " + mySet.size());
			System.out.println("Set: " + mySet);
			
			System.out.println("================");
			
			System.out.println("Removing 16: " + mySet.remove(16));
			System.out.println("Size: " + mySet.size());
			System.out.println("Set: " + mySet);
			
			System.out.println("================");
			// String[] arr = mySet.toArray(); error
			System.out.println("To array");
			Integer[] arr = mySet.toArray(); 
			for (int i = 0; i < arr.length; i++){
				System.out.println("arr["+i+"]="+arr[i]);
			}
			
			
			
			
		}
}

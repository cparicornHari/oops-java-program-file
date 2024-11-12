class GenericMax {
public <T extends Comparable<T>> void maxFinder (T[] array){
T max = array[0];
for(T element: array){
System.out.println(element);
if(element.compareTo(max) > 0)
max = element;

}
System.out.println("Max is : "+max);
}
}
public class Main {
public static void main(String[] args) {
GenericMax max = new GenericMax();
Integer[] numbers = {14,3,42,5,6,10};
String[] strings = {"R","Ra","Raj"};
max.maxFinder(numbers);
max.maxFinder(strings);
}
}
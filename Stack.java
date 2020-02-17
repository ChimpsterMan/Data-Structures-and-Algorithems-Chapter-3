//I wanted to make it generic for fun :)
public class Stack <T>{
  private T[] list;
  private int top;
  private int size;
  
  //default method sets size as default
  public Stack(){
    this(3);
  }
  
  //makes a new list and sets variables
  public Stack(int size){
    top = -1;
    this.size = size;
    list = (T[]) new Object[size];
  }
  
  //exapand the list size for more elements
  private void expand(){
    size *= 2;
    T[] newList = (T[]) new Object[size];
    
    for (int i = 0; i <= top; i++){
      newList[i] = list[i];
    }
    
    list = newList;
  }
  
  //add new elements to the stack
  //returns true if successful and false if the list will overflow
  //simple limited size form
  /*
  public boolean push(T newNode){
    if (top + 1 >= size){
      return false;
    } else {
      Generic node = (Generic) newNode;
      top += 1;
      list[top] = (T) node.deepCopy();
      return true;
    }
    
    return false;
  }
  */
  
  //expanded dynamic form
  public boolean push(T newNode){
    if (top + 1 >= size){
      //return false;
      expand();
    }
    
    Generic node = (Generic) newNode;
    top += 1;
    list[top] = (T) node.deepCopy();
    return true;
  }
  
  //remove and return element of the stack
  public T pop(){
    if (top <= 0){
      return null;
    } else {
      int popLocation = top;
      top -= 1;
      return list[popLocation];
    }
  }
  
  //peek at the top element
  public T peek(){
    return list[top];
  }
  
  //tests if the stack is full or not
  public boolean isFull(){
    if (top == size - 1){
      return true;
    }
    else {
      return false;
    }
  }
  
  //empties the stack 
  public void empty(){
    top = -1;
  }
  
  public void showAll(){
    for (int i = top; i >= 0; i--){
      System.out.println(list[i]);
    }
  }
}
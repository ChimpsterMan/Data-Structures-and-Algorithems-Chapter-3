//By Erik Nilsson
//chapter 3 hw
//the driver class to test all of the individual functions
class Driver {
  public static void main(String args[]){
    Stack<Student> school = new Stack<Student>();
    
    System.out.println("add one student" + "\nNew List:");
    school.push(new Student("Max", 0, 4.0f));
    school.showAll();
    
    System.out.println("\nadd 3 students and expand list" + "\nNew List:");
    school.push(new Student("Max", 1, 3.0f));
    school.push(new Student("Jack", 2, 2.0f));
    school.push(new Student("Jill", 3, 2.5f));
    school.showAll();
    
    System.out.println("\nPopped student: " + school.pop() + "\nNew List:");
    school.showAll();
    
    System.out.println("\nPeeked student: " + school.peek() + "\nNew List:");
    school.showAll();
    
    System.out.println("\nIs the Stack Full?");
    if (school.isFull()){
      System.out.println("Stack is full");
    } else {
      System.out.println("Stack is not full");
    }
    
    System.out.println("\nEmptying list "  + "\nNew List:");
    school.empty();
    school.showAll();
  }
}
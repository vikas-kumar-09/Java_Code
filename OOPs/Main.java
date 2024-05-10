package OOPs;

public class Main {
    public static void main(String[] args) {
        // store 5 roll no
        int[] numbers = new int[5];

        // store 5 names

        String[] names = new String[5];
        Student[] students = new Student[5];
        // System.out.println();
        
        
        // just declaring
        Student kunal = new Student(188, "javajiiii", 687.9f);

        // calling greeting function
        // kunal.changeName("karan kumar");
        // kunal.greeting();

        // kunal.rno = 12;
        // kunal.name = "vikas kumar";
        // kunal.marks = 56.8f;

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        // System.out.println(Arrays.toString(students));

        Student random = new Student();
        System.out.println(random.name);

        Student one = new Student();
        Student two = one;
        one.name = "something something";
        System.out.println(two.name);



        

    }
    }

    // create a class
        // for every single student
        class Student {
        int rno;
        String name;
        float marks;
            
        
    

        // we need the way to add the values of the above
        // properties object by object

        // we need one word to access every object

        void greeting(){
            System.out.println("Hello! My name is " + this.name);
        }

        void changeName(String newName){
            name = newName;
        }

        Student (Student other){
          this.rno = other.rno;
          this.name = other.name;
          this.marks = other.marks;  
        }


        // this keyword will replace with  
       // creating constructor
       // when you call constructor with zero values
        Student(){
            this.rno = 12;
            this.name = "vikas kumar";
            this.marks = 56.8f;
        }

        // when you call constructor with  three values
        Student(int rno, String name, float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
    
}



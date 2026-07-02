public class Student {
    private String name;
    private int age;
    private float gpa;
    private String college;
    public Student(String name, int age, float gpa, String college) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.college = college;
    }
     public void introduce() {
         System.out.println("Hi my name is" + name);
         System.out.println("my cgpa is" + gpa);
     }
         public int getAge() {
             return age;
         }

         public void setAge(int age) {
             if (age > 0 && age < 100) {
                 this.age = age;
             } else {
                 System.out.println("Invalid age");
             }
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }


         }








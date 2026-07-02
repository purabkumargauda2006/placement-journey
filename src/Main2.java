public class Main2 {
    public static void main(String[] args) {

                Student s1 = new Student("Purab", 20, 7.9f, "GIET University");
                Student s2 = new Student("Rahul", 21, 8.2f, "NIT Rourkela");
        System.out.println(s1.getAge());
        s1.setAge(-5);
        s1.setAge(25);
        System.out.println(s1.getAge());

                s1.introduce();
                s2.introduce();
            }
        }


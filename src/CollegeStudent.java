public class CollegeStudent extends Student {
    String branch;

    public CollegeStudent(String name, int age, float cgpa, String college, String branch) {
        super(name, age, cgpa, college);
        this.branch = branch;}
    @Override
      public void introduce(){
        super.introduce();

        System.out.println("my branch is " +branch);
    }
}
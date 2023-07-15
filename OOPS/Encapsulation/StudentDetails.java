public class StudentDetails
{
    public static void main(String args[])
    {
        Student obj = new Student();

        obj.setName("Ram");
        obj.setRollno(5);
        obj.setAge(21);

        System.out.println("Name :"+obj.getName());
        System.out.println("Rollno :"+obj.getRollno());
        System.out.println("Age:"+obj.getAge());
    }
}
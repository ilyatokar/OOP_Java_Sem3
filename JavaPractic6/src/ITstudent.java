public class ITstudent extends Student {

    public ITstudent(int age, int ID, String fisrtName) {
        super(age, ID, fisrtName);
    }

    public ITstudent(int ID, String fisrtName) {
        super(ID, fisrtName);
    }

    @Override
    String getCourse() {
        return "IT";
    }
}
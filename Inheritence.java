public class Inheritence {
    int roll_no;
    String name;
    Inheritence(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
    void displayStudent() {
        System.out.println("Roll No : " + roll_no);
        System.out.println("Name    : " + name);
    }

    public static void main(String[] args) {
        Result r = new Result(101, "Nakul", 95);

        r.displayStudent();
        r.displayMarks();
    }
}
class Result extends Inheritence {
    int marks;
    Result(int roll_no, String name, int marks) {
        super(roll_no, name);
        this.marks = marks;
    }
    void displayMarks() {
        System.out.println("Marks   : " + marks);
    }
}
public class instructor {
    int roll_no;
    String name;
    instructor(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    void display(){
        System.out.println("Roll no : " + roll_no);
        System.out.println("Name : " + name);
    }
   
    public static void main(String[] args){
        instructor s1 = new instructor(101, "Nakul");
        s1.display();
    }
}
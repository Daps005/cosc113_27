//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StudentInfo {
    // Every java project will have only a and single main method
    // Method = grouping of relevant code and
    // Return_Type (void) METHOD_NAME (main) (PARAM_Type PARAM_Name){

    // }
    // Declare Attributes
    String FN;
    String LN;
    int Sid;
    double CGP;
    String address;

    public static void main(String[] args) {
        // Reference variable or StudentInfo-type variable
        StudentInfo st_1;
        st_1 = new StudentInfo();
        System.out.println(st_1);

        StudentInfo st_2;
        st_2 = new StudentInfo();
        System.out.println(st_2);


        System.out.println("Hello Java!");



    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Mar23 {
    
    public static void main(String[] args) {
        String csvFile = "text.csv";
        
        
        try {
            Scanner scanner = new Scanner(new File(csvFile));
            Student[] obj = new Student[100]; 
            int counter =0;
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                obj[counter]= new Student(values[0],values[1],values[2],values[3]);
                
                counter++;
                System.out.println(values[0]+" "+ values[1]+" "+ values[2]+" "+ values[3]+" ");
                
            }
        } catch (FileNotFoundException e) {
        }
        
    }
}


class Student {
     String name;
     String regNo;
     String email;
     String stuClass;

    Student(String name, String regNo, String email, String stuClass) {
        this.name = name;
        this.regNo = regNo;
        this.email = email;
        this.stuClass = stuClass;
    }

}
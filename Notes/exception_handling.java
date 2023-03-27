import java.io.*;
import java.util.Scanner;
public class exception_handling {


public static void edit_file(String file_name) {
    try {  
        FileWriter fwrite = new FileWriter("/Users/sourabhsoni/Desktop/Christ/ME/22122050-MDS273L-JAVA/Notes/"+file_name);  
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter whatever you want to write in "+ file_name);
        String text = scan.nextLine();
        fwrite.write(text);    
        fwrite.close();   
        System.out.println("Content is successfully wrote to the file.");  

    } catch (IOException e) {  
        System.out.println("Unexpected error occurred");  
        e.printStackTrace();  
        }  

    
}

public static void read_file(String file_name) {
    try {  
        FileWriter fwrite = new FileWriter("/Users/sourabhsoni/Desktop/Christ/ME/22122050-MDS273L-JAVA/Notes/"+file_name);  
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter whatever you want to write in "+ file_name);
        String text = scan.nextLine();
        fwrite.write(text);    
        fwrite.close();   
        System.out.println("Content is successfully wrote to the file.");  

    } catch (IOException e) {  
        System.out.println("Unexpected error occurred");  
        e.printStackTrace();  
        }  

    
}

public static void creating_file(String file_name) {
    try {
        File fo = new File("/Users/sourabhsoni/Desktop/Christ/ME/22122050-MDS273L-JAVA/Notes/"+file_name);
        fo.createNewFile();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public static void main(String[] args) {
    edit_file("test.txt");
    

}    
}

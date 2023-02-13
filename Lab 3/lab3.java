import java.util.Scanner;

// class details{
//    // student (Name, Register Number, Email, Class, Department)
//     int Register_Number;  
//     String Name, Class, Department, Email ;  

//     public void getDetails() {  
//         System.out.println("Name : "+Name+ "\nRegister Number : "+Register_Number+ "\nClass : "+Class+ "\nDepartment : "+Department+ "\nEmail :" +Email);  
//     } 

//     public void setDetaisl(int reg , String name, String clss, String department, String email) {  
//         this.Name = name; 
//         this.Class = clss;
//         this.Department = department;
//         this.Email = email; 
//     }
    
// }

class lab3 {
    public static void display(String[][] Arr , int index){
        {
            System.out.println("Name : " + Arr[index][0] );
            System.out.println("Register Number : " + Arr[index][1] );
            System.out.println("Class : " + Arr[index][2] );
            System.out.println("Department : " + Arr[index][3]);
            System.out.println("Email : " + Arr[index][4]);
            
        }
          
    } 
    public static String[][] addStudent(String[][] students, String[] student) {
        int currentSize = students.length;
        int newSize = currentSize + 1;
        String[][] newArray = new String[newSize][];
        System.arraycopy(students, 0, newArray, 0, currentSize);
        newArray[newSize - 1] = student;
        return newArray;
      }
      
    public static String[] collectStudentDetails() {
        Scanner sc = new Scanner(System.in);
        String[] student = new String[5];
        
        System.out.print("Enter student name: ");
        student[0] = sc.nextLine();
        
        System.out.print("Enter student register number: ");
        student[1] = sc.nextLine();
        
        System.out.print("Enter student email: ");
        student[2] = sc.nextLine();
        
        System.out.print("Enter student class: ");
        student[3] = sc.nextLine();
        
        System.out.print("Enter student department: ");
        student[4] = sc.nextLine();
        
        return student;
      }


    public static int searchName(String[][] Names , String str, int Choice){

            int index = 0 ;
        do{
            if (Names[index][Choice].equals(str)){
                return index;
            }
            index++;
        }while( index <= Names.length);

        return -1;
        
        }

    
//     Collect the details of the student
//     Display the details of the student
//     Search the details of the student


    public static void main(String[] args) {
        String details[][] = new String[1024][5];
        details[0][0] = "Alwin";
        details[0][1] = "1847207";
        details[0][2] = "alwin@christ.in";
        details[0][3] = "MCA";
        details[0][4] = "Computer Science";
        Scanner scan = new Scanner(System.in);

        do{ 
            System.out.println("**************************************");
            System.out.println("Press 1 to Add the Student Details"); 
            System.out.println("Press 2 to Search for a name"); 
            System.out.println("Press 3 to Display a name");
            System.out.println("Press 0 to exit");
            System.out.println("**************************************");

            int Choice = Integer.parseInt(scan.nextLine());

            switch(Choice){
                case 0 :
                return;
                case 1:
                //ENTERING NAME IN ARRAY
                String[] s1 = collectStudentDetails();
                details = addStudent(details,s1);
                break;

                case 2:
                // SEARCHING NAME IN ARRAY
                // System.out.println("**************************************");
                // System.out.println("Press 1 to Search using Name"); 
                // System.out.println("Press 2 to Search using Register_Number "); 
                // System.out.println("**************************************");
                // int choice = Integer.parseInt(scan.nextLine());
                //if (choice ==1){
                System.out.println("Enter Name that you want to Search");
                String  input = scan.nextLine();
                int index  = searchName(details,input,0); 


                if (index != -1){
                    System.out.println (input + " Does exist at "+ index + " Index");

                }else{System.out.println (input + " Does not exist");}
                
                break;

                case 3 :
               System.out.println("Enter Name that you want to Search");
                input = scan.nextLine();
                index  = searchName(details,input,0); 
                display(details,index);
                



            }


        }while(true);




    

}
}
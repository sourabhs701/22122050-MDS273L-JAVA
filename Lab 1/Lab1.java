import java.io.*;

class Lab1{

    public static String  checkRegion(String state) {
        /*
         * India, with the help of a switch statement, 
         * it should display "The Employee is from the southern states of India; 
         * Preferable work location is in <state>", along with the basic details.
         */
        
        switch (state) {
          case "Andhra Pradesh":
          case "Telangana":
          case "Tamil Nadu":
          case "Kerala":
            return("South India");

          case "Maharashtra":
          case "Goa":
          case "Gujarat":
            return("West India");

          case "Madhya Pradesh":
          case "Chhattisgarh":
          case "Uttar Pradesh":
          case "Uttarakhand":
            return("Central India");

          case "Bihar":
          case "Odisha":
          case "Jharkhand":
            return("East India");

          case "Delhi":
          case "Haryana":
          case "Punjab":
          case "Himachal Pradesh":
          case "Jammu and Kashmir":
          case "Rajasthan":
            return("North India");

          default:
            return("Invalid state");
        }
      }

      public static void checkMNC(String company) {
        /*
         * Identify if the employee belongs to the top MNC Companies 
         * (Facebook, Google, Microsoft, Samsung, IBM, Apple); if so, 
         * print a message "The employee is working in Top MNC Companies".
         */
        String[] topMNCs = {"Facebook", "Google", "Microsoft", "Samsung", "IBM", "Apple"};
        boolean isTopMNC = false;
  
        for (String mnc : topMNCs) {
           if (mnc.equals(company)) {
              isTopMNC = true;
              break;
           }
        }
  
        if (isTopMNC) {
           System.out.println("The employee is working in Top MNC Companies");
        }
        
     }

    /*
     * Write a Java Program that will collect an employee's basic details that fall into different data types and displays them.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader( System.in)); 

            String[] input = new String[3]; 

            System.out.print("Please enter Name, Age,  State, Gender(m,f), Company Name: "); 
            input = in.readLine().split(", "); 

            String empName = input[0]; 
            int empAge = Integer.parseInt(input[1]);
            String empState  = input[2]; 
            String empGender = input[3];
            String empComp = input[4];

            String empRegion = checkRegion(empState);

            
            /*
             * After the details have been displayed, with the help of conditional statements, 
             * check if the gender of the employee is 'm' or 'f'. 
             * It should print "MALE" for 'm' and "FEMALE" for 'f'.
             */
            if (empGender.equals("m")){
                empGender = "MALE";
            }else{
                empGender = "FEMALE";
            }

            System.out.println("Name: " + empName + "\nAge: "+empAge);
            System.out.println("The Employee is from the "+empRegion+ " Preferable work location is in "+ empState);
            System.out.println("\n Gender: " + empGender);
            checkMNC(empComp);
            }        

    }

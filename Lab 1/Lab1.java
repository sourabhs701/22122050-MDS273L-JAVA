import java.io.*;

class Lab1{
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";

    public static String checkRegion(String state) {
        /*
         * India, with the help of a switch statement, 
         * it should display "The Employee is from the southern states of India; 
         * Preferable work location is in <state>", along with the basic details.
         */
        
        switch (state) {
          case "andhra Pradesh":
          case "telangana":
          case "tamil Nadu":
          case "kerala":
            return("South India");

          case "maharashtra":
          case "goa":
          case "gujarat":
            return("West India");

          case "madhya Pradesh":
          case "chhattisgarh":
          case "uttar Pradesh":
          case "uttarakhand":
            return("Central India");

          case "bihar":
          case "odisha":
          case "jharkhand":
            return("East India");

          case "delhi":
          case "haryana":
          case "punjab":
          case "himachal Pradesh":
          case "jammu and Kashmir":
          case "rajasthan":
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
        String[] topMNCs = {"facebook", "google", "microsoft", "samsung", "ibm", "apple"};
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

            /*
             * Camel Case
             */
            empState = empState.toLowerCase();
            empGender = empGender.toLowerCase();
            empComp = empComp.toLowerCase();
             


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
            System.out.println("************************************************");
            System.out.println(ANSI_RED + "Name: " + ANSI_GREEN + empName +ANSI_RED+ "\nAge: "+ANSI_GREEN +empAge);
            System.out.println(ANSI_RED +"The Employee is from the "+ANSI_GREEN +empRegion+ ANSI_RED+ " Preferable work location is in " +ANSI_GREEN + empState);
            System.out.println(ANSI_RED +"Gender: " + ANSI_GREEN + empGender);
            checkMNC(empComp);
            System.out.println(ANSI_RESET + "************************************************");

            }        

    }

package srcjava;
import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

   // Set JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://localhost:3306/ConsumerGadgetDB";
   //use the .sql files as sources to create the Database and its schema, and to add some initial data
   // Database credentials
   static final String USER = "root";// add your user
   static final String PASSWORD = "{Your Password}";// add password


   
  
   public static String insertrow(){
      return "";
   }
   public static void main(String[] args) {
      Connection conn = null;
      Statement stmt = null;
      int choice = 0;
      Scanner sc = new Scanner(System.in);
      // String showdata = "";
      // String insertdata = "";
      // String insertgadget = "insert into gadget(Gadget_serial_no,Gadget_name,Gadget_Company_name,Gadget_Category)"+
      //                         "values"+
      //                         "(11,'Airpods Pro 2','Apple','Wireless Earbuds')";
      // "CREATE TABLE employee (" +
      //          "fname VARCHAR(30), " +
      //          "minit CHAR(1), " +
      //          "lname VARCHAR(30), " +
      //          "ssn CHAR(9), " +
      //          "bdate DATE, " +
      //          "address VARCHAR(30), " +
      //          "sex CHAR(1), " +
      //          "salary DECIMAL(10,2), " +
      //          "super_ssn CHAR(9), " +
      //          "dno SMALLINT, " +
      //          "CONSTRAINT pk_employee PRIMARY KEY (ssn)" +
      //          ")";

      // STEP 2. Connecting to the Database
      try {
         int mode = 0;
         System.out.println("Welcome to Consumer-Gadget Store");
         System.out.println("Select Mode:");
         System.out.println("\t1.User Mode");
         System.out.println("\t2.Enterprise Mode");
         mode = sc.nextInt();
         while(mode != 1 && mode != 2){
            System.out.println("Choose a valid mode:");
            mode = sc.nextInt();
         }
         // STEP 2a: Register JDBC driver
         Class.forName(JDBC_DRIVER);
         // STEP 2b: Open a connection
         System.out.println("Connecting to database...");
         conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
         // STEP 2c: Execute a query
         System.out.println("Creating statement...");
         stmt = conn.createStatement();
         conn.setAutoCommit(false);
         // INSERT, UPDATE, DELETE
         // stmt.executeUpdate(choicestatement);

         // STEP 3: Query to database
         // String query = "SELECT * from Company";
         if(mode == 2){
            Jdbc_input_funcs.Enterprisemenu();
            choice = sc.nextInt();
            while(choice<0 || choice >8){
               System.out.println("Enter a valid choice");
               choice = sc.nextInt();
            }
            while(choice !=0 ){
               // if(choice == 2 || choice == 3 || choice == 4 || choice ==8){
               //    conn.setAutoCommit(false);
               // }
               if(choice==1){
                  String choicestatement = Jdbc_input_funcs.choicemanager(choice,0,"");
                  ResultSet rs = stmt.executeQuery(choicestatement);
                  System.out.println("\n\nTables_in_consumergadgetdb");
                  while(rs.next()){
                     String Name = rs.getString("Tables_in_consumergadgetdb");
                     System.out.println("\t"+Name);
                  }
               }
               else if(choice==2){
                  System.out.println("Select Table to insert row into");
                  System.out.println("\t1.Techie\n\t2.Company\n\t3.Gadget\n\t4.Owership");
                  int tablechoice =0;
                  tablechoice = sc.nextInt();
                  while(tablechoice<1 || tablechoice>4){
                     System.out.println("Enter a valid choice");
                     tablechoice=sc.nextInt();
                  }
                  if(tablechoice<=4 && tablechoice>=1){
                     String choicestatement = Jdbc_input_funcs.choicemanager(choice,tablechoice,"");
                     // System.out.println(choicestatement);
                     stmt.executeUpdate(choicestatement);
                  }
               }
               else if(choice==3){
                  System.out.println("Select Table to update row from");
                  System.out.println("\t1.Techie\n\t2.Company\n\t3.Gadget\n\t4.Owership");
                  int tablechoice =0;
                  tablechoice = sc.nextInt();
                  while(tablechoice<1 || tablechoice>4){
                     System.out.println("Enter a valid choice");
                     tablechoice=sc.nextInt();
                  }
                  if(tablechoice<=4 && tablechoice>=1){
                     String choicestatement = Jdbc_input_funcs.choicemanager(choice,tablechoice,"");
                     stmt.executeUpdate(choicestatement);
                  }

               }
               else if(choice==4){
                  System.out.println("Select Table to delete row(s) from");
                  System.out.println("\t1.Techie\n\t2.Company\n\t3.Gadget\n\t4.Owership");
                  int tablechoice =0;
                  tablechoice = sc.nextInt();
                  while(tablechoice<1 || tablechoice>4){
                     System.out.println("Enter a valid choice");
                     tablechoice=sc.nextInt();
                  }
                  if(tablechoice<=4 && tablechoice>=1){
                     String choicestatement = Jdbc_input_funcs.choicemanager(choice,tablechoice,"");
                     stmt.executeUpdate(choicestatement);
                  }
               }
               else if(choice==5){
                  System.out.println("Select Table to display row(s) from");
                  System.out.println("\t1.Techie\n\t2.Company\n\t3.Gadget\n\t4.Owership");
                  int tablechoice =0;
                  tablechoice = sc.nextInt();
                  while(tablechoice<1 || tablechoice>4){
                     System.out.println("Enter a valid choice");
                     tablechoice=sc.nextInt();
                  }
                  String choicestatement = Jdbc_input_funcs.choicemanager(choice,tablechoice,"");
                  System.out.println(choicestatement);
                  ResultSet rs = stmt.executeQuery(choicestatement);
                  if(tablechoice==1){
                     while(rs.next()){
                        Integer Techie_id = rs.getInt("Techie_id");
                        String Techie_name = rs.getString("Techie_name");
                        String Techie_phone_no = rs.getString("Techie_phone_no");
                        System.out.print("Techie_id: "+Techie_id);
                        System.out.print("\tTechie_name: "+Techie_name);
                        System.out.println("\t\tTechie_phone_no: "+Techie_phone_no);
                     }
                  }
                  else if(tablechoice==2){
                     while(rs.next()){
                        String Company_name = rs.getString("Company_name");
                        String Company_Desc = rs.getString("Company_Desc");
                        String Company_DOE = rs.getString("Company_DOE");
                        System.out.print("Company_name: "+Company_name);
                        System.out.print("\nCompany_Desc: "+Company_Desc);
                        System.out.println("\nCompany_DOE: "+Company_DOE);
                     }
                  }
                  else if(tablechoice==3){
                     while(rs.next()){
                        Integer Gadget_serial_no = rs.getInt("Gadget_serial_no");
                        String Gadget_name = rs.getString("Gadget_name");
                        String Gadget_Company_name = rs.getString("Gadget_Company_name");
                        String Gadget_category = rs.getString("Gadget_category");
                        System.out.print("Gadget_serial_no: "+Gadget_serial_no);
                        System.out.print("\tGadget_name: "+Gadget_name);
                        System.out.print("\t\tGadget_Company_name: "+Gadget_Company_name);
                        System.out.println("\t\t\tGadget_category: "+Gadget_category);
                     }
                  }
                  else{
                     while(rs.next()){
                        Integer TG_link_id = rs.getInt("TG_link_id");
                        Integer T_id = rs.getInt("T_id");
                        Integer G_id = rs.getInt("G_id");
                        String DOP = rs.getString("DOP");
                        Integer Purchase_price = rs.getInt("Purchase_price");
                        System.out.print("TG_link_id: "+TG_link_id);
                        System.out.print("\tT_id: "+T_id);
                        System.out.print("\t\tG_id: "+G_id);
                        System.out.print("\t\t\tDOP: "+DOP);
                        System.out.println("\t\t\t\tPurchase_price: "+Purchase_price);
                        
                     }
                  }
                  rs.close();
               }
               else if(choice==6){
                  System.out.println("Enter \n\t1.Gadget's Serial number \t2.Gadget's name");
                  Integer tablechoice = sc.nextInt();
                  while(tablechoice<1 || tablechoice>2){
                     System.out.println("Enter a valid choice");
                     tablechoice=sc.nextInt();
                  }
                  String choicestatement = Jdbc_input_funcs.choicemanager(choice,tablechoice,"");
                  System.out.println(choicestatement);
                  ResultSet rs = stmt.executeQuery(choicestatement);
                  while(rs.next()){
                     // , Gadget_name, Techie_id, Techie_name
                     Integer Gadget_serial_no = rs.getInt("Gadget_serial_no");
                     String  Gadget_name = rs.getString("Gadget_name");
                     Integer Techie_id = rs.getInt("Techie_id");
                     String Techie_name = rs.getString("Techie_name");
                     System.out.print("Gadget's Serial number: " + Gadget_serial_no);
                     System.out.print("\tGadget's name: " + Gadget_name);
                     System.out.print("\t\tTechie's id: " + Techie_id);
                     System.out.println("\t\t\tTechie's name: "+Techie_name);
                  }
                  rs.close();
               }
               else if(choice==7){
                  System.out.println("Enter \n\t1.Techie's ID \t2.Techie's name");
                  Integer tablechoice = sc.nextInt();
                  while(tablechoice<1 || tablechoice>2){
                     System.out.println("Enter a valid choice");
                     tablechoice=sc.nextInt();
                  }
                  String choicestatement = Jdbc_input_funcs.choicemanager(choice,tablechoice,"");
                  System.out.println(choicestatement);
                  ResultSet rs = stmt.executeQuery(choicestatement);
                  while(rs.next()){
                     // , Gadget_name, Techie_id, Techie_name
                     Integer Techie_id = rs.getInt("Techie_id");
                     String Techie_name = rs.getString("Techie_name");
                     Integer Gadget_serial_no = rs.getInt("Gadget_serial_no");
                     String  Gadget_name = rs.getString("Gadget_name");
                     System.out.print("Techie's id: " + Techie_id);
                     System.out.print("\tTechie's name: "+Techie_name);
                     System.out.print("\t\tGadget's Serial number: " + Gadget_serial_no);
                     System.out.println("\t\t\tGadget's name: " + Gadget_name);
                     
                  }
                  rs.close();
               }
               else if(choice==8){
                  sc.nextLine();
                  String command= sc.nextLine();
                  stmt.executeUpdate(command);
               }
               // if((choice == 2 || choice == 3 || choice == 4 || choice ==8) && conn.getAutoCommit()==false){
                  // conn.commit();
                  // conn.setAutoCommit(true);
               // }
               Jdbc_input_funcs.Enterprisemenu();
               choice = sc.nextInt();
               while(choice<0 || choice >8){
                  System.out.println("Enter a valid choice");
                  choice = sc.nextInt();
               }
               if(conn.getAutoCommit()==false){
                  conn.commit();
               }
            }
            
         }
         else{
            ResultSet maxtidselect = stmt.executeQuery("select max(TG_link_id) from Ownership");
            maxtidselect.next();
            Integer maxTID = maxtidselect.getInt("max(TG_link_id)");
            maxTID++;
            boolean login = false;
            Jdbc_input_funcs.Usermenu();
            choice = sc.nextInt();
            String name="",idString="";
            while(choice!=0){
               if(choice!= 1 && choice!=2){
                  System.out.println("Enter valid choice");
                  choice = sc.nextInt();
                  
               }
               else if(choice==1){
                  // 
                  System.out.println("Enter your ID");
                  Integer id = sc.nextInt();
                  idString = id.toString();
                  sc.nextLine();
                  System.out.println("Enter your Name:");
                  name = sc.nextLine();
                  String choicestatement = Jdbc_input_funcs.choicemanager(-2,1,idString);
                  ResultSet rs = stmt.executeQuery(choicestatement);
                  rs.next();
                  String T_name  = rs.getString("Techie_name");
                  if(T_name.equals(name)){
                     login=true;
                  }
                  else{
                     System.out.println("Incorrect name provided, please login again, or create new account.");
                  }
               }
               else if(choice==2){
                  String choicestatement = Jdbc_input_funcs.choicemanager(2,1,"");
                  stmt.executeUpdate(choicestatement);
               }
               if(login){
                  System.out.println("your Current Devices");
                  String choicestatement = Jdbc_input_funcs.choicemanager(-3, 1,idString);
                  ResultSet rs = stmt.executeQuery(choicestatement);
                     while(rs.next()){
                        // , Gadget_name, Techie_id, Techie_name
                        Integer Techie_id = rs.getInt("Techie_id");
                        String Techie_name = rs.getString("Techie_name");
                        Integer Gadget_serial_no = rs.getInt("Gadget_serial_no");
                        String  Gadget_name = rs.getString("Gadget_name");
                        System.out.print("Gadget's Serial number: " + Gadget_serial_no);
                        System.out.println("\tGadget's name: " + Gadget_name);
                        
                     }
                     rs.close();
                     System.out.println("\n\n Enter '1' to buy a new device, enter anything else to exit");
                     String onestr = sc.nextLine();
                     while(onestr.equals("1")){
                        System.out.println("Gadgets Available:");
                        String GadgetQuery = "select * from Gadget;";
                        ResultSet rs2 = stmt.executeQuery(GadgetQuery);
                        while(rs2.next()){
                           Integer serialno = rs2.getInt("Gadget_serial_no");
                           String gname = rs2.getString("Gadget_name");
                           String gcomp = rs2.getString("Gadget_company_name");
                           System.out.print("Serial_no: "+serialno);
                           System.out.print("\tName: "+gname);
                           System.out.println("\t\tCompany: "+gcomp);
                        }
                        conn.setAutoCommit(false);
                        System.out.println("Select your gadget by entering its serial_no");
                        Integer sno = sc.nextInt();
                        String snoString = sno.toString();
                        Random random = new Random();
                        Integer price = random.nextInt(99001) + 1000;
                        String command = Jdbc_input_funcs.choicemanager_user_purchase(idString,snoString,price,maxTID);
                        // System.out.println(command);
                        stmt.executeUpdate(command);
                        System.out.println("You are paying "+price+" for your gadget, enter 'n' to cancel transaction");
                        sc.nextLine();
                        String chtrans = sc.nextLine();
                        if(chtrans.equals("n")){
                           conn.rollback();
                           // conn.setAutoCommit(true);
                           System.out.println("Do you want to continue shopping (enter y)?");
                           String verdict = sc.nextLine();
                           if(!verdict.equals("y")){
                              break;
                           }
                           continue;
                        }
                        if(conn.getAutoCommit()==false){
                           conn.commit();
                        }
                        maxTID++;
                        System.out.println("Do you want to continue shopping (enter y)?");
                        String verdict = sc.nextLine();
                        if(!verdict.equals("y")){
                           break;
                        }
                     }
               }
               if(conn.getAutoCommit()==false){
                  conn.commit();
               }
               System.out.println("\n");
               Jdbc_input_funcs.Usermenu();
               choice=sc.nextInt();
            }

            
         }
         // STEP 5: Clean-up environment
         stmt.close();
         conn.close();
         System.out.println("\n\n");
      } catch (SQLException se) { // Handle errors for JDBC
         System.out.println("Something went wrong, couldn't modify the database");
         try{
            if(conn!=null && conn.getAutoCommit()==false)
                conn.rollback();
         }catch(SQLException se2){
            System.out.println("Rollback failed....");
                 se2.printStackTrace();
         }
         se.printStackTrace();
      } catch (Exception e) { // Handle errors for Class.forName
         e.printStackTrace();
      } finally { // finally block used to close resources regardless of whether an exception was
                  // thrown or not
         try {
            if (stmt != null)
               stmt.close();
         } catch (SQLException se2) {
         }
         try {
            if (conn != null)
               conn.close();
         } catch (SQLException se) {
            se.printStackTrace();
         } // end finally try
      } // end try
      System.out.println("End of Code");
   } // end main
} // end class

// Note : By default autocommit is on. you can set to false using
// con.setAutoCommit(false)

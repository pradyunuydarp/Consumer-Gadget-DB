package srcjava;

public class editcomments {
     // public static void Enterprisemenu(){
   //    System.out.println("Welcome to ConsumerGadgetDB");
   //    System.out.println("Select one of the possible operations");
   //    System.out.println("\t1.Show all tables in the database");
   //    System.out.println("\t2.Insert Row");
   //    System.out.println("\t3.Update Row");
   //    System.out.println("\t4.Delete Row(s)");
   //    System.out.println("\t5.Display Data from table");
   //    System.out.println("\t6.Display Gadget and its Owners'(a Techie) names:");
   //    System.out.println("\t7.Display Techie and the Gadgets they own");
   // }
   // public static void Usermenu(){
   //    System.out.println("Welcome to Consumer Gadget Store");
   //    System.out.println("Select one of the possible operations");
   //    System.out.println("\t1.Login");
   //    System.out.println("\t2.Create Account");
   // }
   // public static String choicemanager(int c,int c1,String uidstr){
   //    Scanner sc = new Scanner(System.in);
   //    String returnString="";
   //    if(c==-3){
   //       returnString += "select Techie_id, Techie_name, Gadget_serial_no, Gadget_name from Ownership inner join Techie on Techie_id = "+uidstr+"  and Techie_id = T_id inner join Gadget on G_id = Gadget_serial_no;";
   //       return returnString;
   //    }
   //    if(c==-2){
   //       returnString+="select Techie_name from Techie where Techie_id = "+uidstr;
   //       return returnString;
   //    }
   //    if(c == 1){ 
   //       return "show tables;";
   //    }
   //    else if(c==2){

   //       returnString += "insert into ";

   //       if(c1==1){
   //          Integer id;
   //          returnString += "Techie(Techie_id,Techie_name,Techie_phone_no) VALUES";
   //          System.out.println("Enter Techie id:");
   //          id = sc.nextInt();
   //          sc.nextLine();
   //          String idstr = id.toString();
   //          System.out.println("Enter Techie's name:");
   //          String namestr = sc.nextLine();
   //          System.out.println("Enter Techie's phone number");
   //          String phstr = sc.nextLine();
   //          while(phstr.length()!=10){
   //             System.out.println("enter a valid phone no:");
   //             phstr = sc.nextLine(); 
   //          }
   //          returnString+="("+idstr+",'"+namestr+"','"+phstr+"');";
   //       }
   //       else if(c1==2){
   //          returnString+= "Company(Company_name,Company_Desc,Company_DOE) VALUES";
   //          System.out.println("Enter Company's name");
   //          String namestr = sc.nextLine();
   //          System.out.println("Enter Company's Description(in 100 characters or less)");
   //          String descString = sc.nextLine();
   //          System.out.println("Enter Company's Date of Establishment (YYYY-MM-DD)");
   //          String datestr = sc.nextLine();
   //          returnString+="('"+namestr+"','"+descString+"','"+datestr+"');"; 
   //       }
   //       else if(c1==3){
   //          returnString+= "Gadget(Gadget_serial_no,Gadget_name,Gadget_Company_name,Gadget_category) VALUES";
   //          Integer id;
   //          System.out.println("Enter Gadget_id");
   //          id = sc.nextInt();
   //          sc.nextLine();
   //          String idstr = id.toString();
   //          System.out.println("Enter Gadget's name:");
   //          String namestr = sc.nextLine();
   //          System.out.println("Enter the Gadget's Company's name:");
   //          String compnamestr = sc.nextLine();
   //          System.out.println("Enter Gadget's category:");
   //          String catstr = sc.nextLine();
   //          returnString+="("+idstr+",'"+namestr+"','"+compnamestr+"','"+catstr+"');"; 
   //       }
   //       else{
   //          returnString+= "Ownership(TG_link_id,T_id,G_id,DOP,Purchase_price) VALUES";
   //          Integer id,tid,gid,pp;
   //          System.out.println("Enter Purchase_id");
   //          id = sc.nextInt();
   //          // sc.nextLine();
   //          String idstr = id.toString();
   //          System.out.println("Enter Techie's id:");
   //          tid = sc.nextInt();
   //          String tstr = tid.toString();
   //          System.out.println("Enter Gadget's id:");
   //          gid = sc.nextInt();
   //          String gstr = gid.toString();
   //          sc.nextLine();
   //          System.out.println("Enter Purchase date:");
   //          String datestr = sc.nextLine();
   //          System.out.println("Enter Purchase price:");
   //          pp = sc.nextInt();
   //          String pstr = pp.toString();
   //          returnString+="("+idstr+","+tstr+","+gstr+",'"+datestr+"',"+pstr+");";
   //       }
   //       return returnString;
   //    }
   //    else if(c==3){
   //       returnString += "update ";
   //       if(c1==1){
   //          returnString += "Techie ";
   //          Integer id,ch;
   //          String name,phone;
   //          System.out.println("Enter update parameter:");
   //          System.out.println("\t1.Techie_id INT,\n" + //
   //                            "\t2.Techie_name VARCHAR(20),\n" + //
   //                            "\t3.Techie_phone_no CHAR(10)");
   //          ch = sc.nextInt();
   //          while(ch!=1&&ch!=2&&ch!=3){
   //             ch = sc.nextInt(); 
   //          }
   //          if(ch==1){
   //             System.out.println("Enter id");
   //             id = sc.nextInt();
   //             sc.nextLine();
   //             String idstr = id.toString();
   //             System.out.println("Enter updated Techie's name:");
   //             String namestr = sc.nextLine();
   //             System.out.println("Enter updated Techie's phone number:");
   //             String phstr = sc.nextLine();
   //             while(phstr.length()!=10){
   //                System.out.println("enter a valid phone no:");
   //                phstr = sc.nextLine(); 
   //             }
   //             returnString += "set Techie_name = '"+namestr + "', " + "Techie_phone_no = '" +phstr+"' where Techie_id = "+idstr+";";
   //          }
   //          else if(ch==2){
   //             sc.nextLine();
   //             System.out.println("Enter current Techie's name:");
   //             name = sc.nextLine();
   //             System.out.println("Enter updated Techie's name:");
   //             String namestr = sc.nextLine();
   //             System.out.println("Enter updated Techie's phone number:");
   //             String phstr = sc.nextLine();
   //             while(phstr.length()!=10){
   //                System.out.println("enter a valid phone no:");
   //                phstr = sc.nextLine(); 
   //             }
   //             returnString += "set Techie_name = '"+namestr + "', " + "Techie_phone_no = '" +phstr+"' where Techie_name = '"+name+"';";
   //          }
   //          else{
   //             sc.nextLine();
   //             System.out.println("Enter current phone number:");
   //             phone = sc.nextLine();
   //             System.out.println("Enter updated Techie's name:");
   //             String namestr = sc.nextLine();
   //             System.out.println("Enter updated Techie's phone number:");
   //             String phstr = sc.nextLine();
   //             while(phstr.length()!=10){
   //                System.out.println("enter a valid phone no:");
   //                phstr = sc.nextLine(); 
   //             }
   //             returnString += "set Techie_name = '"+namestr + "', " + "Techie_phone_no = '" +phstr+"' where Techie_name = '"+phone+"';";
   //          }
            
   //          // System.out.println("Enter Techie_id");

   //       }
   //       else if(c1==2){
   //          returnString += "Company ";
   //          System.out.println("Enter update parameter:");
   //          System.out.println("\t1.Company_name VARCHAR(20),\n" + 
   //                            "\t2.Company_DOE Date NOT NULL,\n" + 
   //                            "\t3.Company_Desc VARCHAR(100),");
   //          Integer ch = sc.nextInt();
   //          while(ch!=1&&ch!=2&&ch!=3){
   //             ch = sc.nextInt(); 
   //          }  
   //          if(ch==1){
   //             sc.nextLine();
   //             System.out.println("Enter Company's name:");
   //             String name = sc.nextLine();
   //             System.out.println("Enter updated DOE:");
   //             String doestr = sc.nextLine();
   //             System.out.println("Enter updated Company Description:");
   //             String desstr = sc.nextLine();
   //             returnString += "set Company_DOE = '"+doestr + "', " + "Company_Desc = '" +desstr+"' where Company_name = '"+name+"';";
   //          }     
   //          else if(ch==2){
   //             sc.nextLine();
   //             System.out.println("Enter current DOE");
   //             String date = sc.nextLine();
   //             System.out.println("Enter updated DOE:");
   //             String doestr = sc.nextLine();
   //             System.out.println("Enter updated Company Description:");
   //             String desstr = sc.nextLine();
   //             returnString += "set Company_DOE = '"+doestr + "', " + "Company_Desc = '" +desstr+"' where Company_DOE = '"+date+"';";

   //          }
   //          else{
   //             sc.nextLine();
   //             System.out.println("Enter current Desc");
   //             String desc = sc.nextLine();
   //             System.out.println("Enter updated DOE:");
   //             String doestr = sc.nextLine();
   //             System.out.println("Enter updated Company Description:");
   //             String desstr = sc.nextLine();
   //             returnString += "set Company_DOE = '"+doestr + "', " + "Company_Desc = '" +desstr+"' where Company_DOE = '"+desc+"';";
   //          }

   //       }
   //       else if(c1==3){
   //          returnString += "Gadget ";
   //          System.out.println("Enter update parameter:");
   //          System.out.println("\t1.Gadget_serial_no INT,\n" + 
   //                            "\t2.Gadget_name VARCHAR(25),\n" + 
   //                            "\t3.Gadget_Company_name VARCHAR(20),\n"+
   //                            "\t4.Gadget_category VARCHAR(20),");
   //          Integer ch = sc.nextInt();
   //          while(ch!=1&&ch!=2&&ch!=3&&ch!=4){
   //             ch = sc.nextInt(); 
   //          }  
   //          if(ch==1){
   //             System.out.println("Enter id");
   //             Integer id = sc.nextInt();
   //             sc.nextLine();
   //             String idstr = id.toString();
   //             System.out.println("Enter updated Gadget's name:");
   //             String namestr = sc.nextLine();
   //             System.out.println("Enter updated Gadget's Company's name(Beware that your new Company_name must refer to an existing company):");
   //             String compstr = sc.nextLine();
   //             System.out.println("Enter updated Gadget's category:");
   //             String catstr = sc.nextLine();
   //             returnString += "set Gadget_name = '"+namestr + "', " + "Gadget_Company_name = '" +compstr+ "', " + "Gadget_category = '" +catstr+"' where Gadget_serial_no = "+idstr+";";
   //          }
   //          else if(ch==2){
   //             sc.nextLine();
   //             System.out.println("Enter Current Gadget's name");
   //             String name = sc.nextLine();
   //             System.out.println("Enter updated Gadget's name:");
   //             String namestr = sc.nextLine();
   //             System.out.println("Enter updated Gadget's Company's name(Beware that your new Company_name must refer to an existing company):");
   //             String compstr = sc.nextLine();
   //             System.out.println("Enter updated Gadget's category:");
   //             String catstr = sc.nextLine();
   //             returnString += "set Gadget_name = '"+namestr + "', " + "Gadget_Company_name = '" +compstr+ "', " + "Gadget_category = '" +catstr+"' where Gadget_name = '"+name+"';";
   //          }
   //          else if(ch==3){
   //             sc.nextLine();
   //             System.out.println("Enter Current Gadget's Company's name;");
   //             String name = sc.nextLine();
   //             System.out.println("Enter updated Gadget's name:");
   //             String namestr = sc.nextLine();
   //             System.out.println("Enter updated Gadget's Company's name(Beware that your new Company_name must refer to an existing company):");
   //             String compstr = sc.nextLine();
   //             System.out.println("Enter updated Gadget's category:");
   //             String catstr = sc.nextLine();
   //             returnString += "set Gadget_name = '"+namestr + "', " + "Gadget_Company_name = '" +compstr+ "', " + "Gadget_category = '" +catstr+"' where Gadget_Company_name = '"+name+"';";
   //          }
   //          else if(ch==4){
   //             sc.nextLine();
   //             System.out.println("Enter Current Gadget's category;");
   //             String cat = sc.nextLine();
   //             System.out.println("Enter updated Gadget's name:");
   //             String namestr = sc.nextLine();
   //             System.out.println("Enter updated Gadget's Company's name(Beware that your new Company_name must refer to an existing company):");
   //             String compstr = sc.nextLine();
   //             System.out.println("Enter updated Gadget's category:");
   //             String catstr = sc.nextLine();
   //             returnString += "set Gadget_name = '"+namestr + "', " + "Gadget_Company_name = '" +compstr+ "', " + "Gadget_category = '" +catstr+"' where Gadget_category = '"+cat+"';";
   //          }
   //       }
   //       else{
   //          returnString += "Ownership ";
   //          System.out.println("Enter update parameter:");
   //          System.out.println("\t1.TG_link_id INT,\n" + 
   //                            "\t2.T_id INT,\n" + 
   //                            "\t3.G_id INT,\n"+
   //                            "\t4.DOP(Date of Purchase) DATE NOT NULL,\n" +
   //                            "\t5.Purchase_price INT,");
   //          Integer ch = sc.nextInt();
   //          while(ch!=1&&ch!=2&&ch!=3&&ch!=4&&ch!=5){
   //             ch = sc.nextInt(); 
   //          }             
   //          if(ch==1){
   //             System.out.println("Enter Transaction id");
   //             Integer id = sc.nextInt();
   //             sc.nextLine();
   //             String idstr = id.toString();
   //             System.out.println("Enter updated DOP:");
   //             String dstr = sc.nextLine();
   //             System.out.println("Enter updated Price:");
   //             Integer pp = sc.nextInt();
   //             String pstr = pp.toString();
   //             sc.nextLine();
   //             returnString += "set DOP = '"+dstr + "', " + "Purchase_price = "+pstr+" where TG_link_id = "+idstr+";";
   //          }
   //          else if(ch==2){
   //             System.out.println("Enter Techie id");
   //             Integer id = sc.nextInt();
   //             sc.nextLine();
   //             String idstr = id.toString();
   //             System.out.println("Enter updated DOP:");
   //             String dstr = sc.nextLine();
   //             System.out.println("Enter updated Price:");
   //             Integer pp = sc.nextInt();
   //             String pstr = pp.toString();
   //             sc.nextLine();
   //             returnString += "set DOP = '"+dstr + "', " + "Purchase_price = "+pstr+" where T_id = "+idstr+";";
   //          }
   //          else if(ch==3){
   //             System.out.println("Enter Techie id");
   //             Integer id = sc.nextInt();
   //             sc.nextLine();
   //             String idstr = id.toString();
   //             System.out.println("Enter updated DOP:");
   //             String dstr = sc.nextLine();
   //             System.out.println("Enter updated Price:");
   //             Integer pp = sc.nextInt();
   //             String pstr = pp.toString();
   //             sc.nextLine();
   //             returnString += "set DOP = '"+dstr + "', " + "Purchase_price = "+pstr+" where G_id = "+idstr+";";
   //          }
   //          else if(ch==4){
   //             System.out.println("Enter current DOP");
   //             String odstr = sc.nextLine();
   //             System.out.println("Enter updated DOP:");
   //             String dstr = sc.nextLine();
   //             System.out.println("Enter updated Price:");
   //             Integer pp = sc.nextInt();
   //             String pstr = pp.toString();
   //             sc.nextLine();
   //             returnString += "set DOP = '"+dstr + "', " + "Purchase_price = "+pstr+" where DOP = "+odstr+";";
   //          }
   //          else{
   //             System.out.println("Enter current purchase price");
   //             Integer id = sc.nextInt();
   //             sc.nextLine();
   //             String idstr = id.toString();
   //             System.out.println("Enter updated DOP:");
   //             String dstr = sc.nextLine();
   //             System.out.println("Enter updated Price:");
   //             Integer pp = sc.nextInt();
   //             String pstr = pp.toString();
   //             sc.nextLine();
   //             returnString += "set DOP = '"+dstr + "', " + "Purchase_price = "+pstr+" where Purchase_price = "+idstr+";";
   //          }
   //          }                     
   //          return returnString;                 
                              
   //       }

   //       else if(c==4){
   //          returnString += "delete from ";
   //          if(c1==4){
   //             returnString += "Ownership ";
   //             System.out.println("Enter delete parameter:");
   //             System.out.println("\t1.TG_link_id INT,\n" + 
   //                               "\t2.T_id INT,\n" + 
   //                               "\t3.G_id INT,\n"+
   //                               "\t4.DOP(Date of Purchase) DATE NOT NULL,\n" +
   //                               "\t5.Purchase_price INT,");
   //             Integer ch = sc.nextInt();
   //             while(ch!=1&&ch!=2&&ch!=3&&ch!=4&&ch!=5){
   //                ch = sc.nextInt(); 
   //             } 
   //             if(ch==1){
   //                System.out.println("Enter Transaction_id:");
   //                Integer id = sc.nextInt();
   //                String idsString = id.toString();
   //                returnString+="where TG_link_id = "+idsString;
   //             }
   //             else if(ch==2){
   //                System.out.println("Enter Techie_id:");
   //                Integer id = sc.nextInt();
   //                String idsString = id.toString();
   //                returnString+="where T_id = "+idsString;
   //             }
   //             else if(ch==3){
   //                   System.out.println("Enter Gadget_id:");
   //                   Integer id = sc.nextInt();
   //                   String idsString = id.toString();
   //                   returnString+="where G_id = "+idsString;
   //             }
   //             else if(ch==4){
   //                System.out.println("Enter DOP:");
   //                String idsString = sc.nextLine();
   //                returnString+="where DOP = '"+idsString+"'";
   //             }
   //             else if(ch==3){
   //                System.out.println("Enter Purchase_price:");
   //                Integer id = sc.nextInt();
   //                String idsString = id.toString();
   //                returnString+="where Purchase_price = "+idsString;
   //             }

   //          }
   //          else if(c1==3){
   //             returnString += "Gadget ";
   //             System.out.println("Enter delete parameter:");
   //             System.out.println("\t1.Gadget_serial_no INT,\n" + 
   //                               "\t2.Gadget_name VARCHAR(25),\n" + 
   //                               "\t3.Gadget_Company_name VARCHAR(20),\n"+
   //                               "\t4.Gadget_category VARCHAR(20),");
   //             Integer ch = sc.nextInt();
   //             while(ch!=1&&ch!=2&&ch!=3&&ch!=4){
   //                ch = sc.nextInt(); 
   //             }  
   //             if(ch==1){
   //                System.out.println("Enter Gadget's serial_no:");
   //                Integer id = sc.nextInt();
   //                String idsString = id.toString();
   //                returnString+="where Gadget_serial_no = "+idsString;
   //             }
   //             else if(ch==2){
   //                System.out.println("Enter Gadget's name:");
   //                String idsString = sc.nextLine();
   //                returnString+="where Gadget_name = '"+idsString+"'";
   //             }
   //             else if(ch==2){
   //                System.out.println("Enter Gadget's Company's name:");
   //                String idsString = sc.nextLine();
   //                returnString+="where Gadget_Company_name = '"+idsString+"'";
   //             }
   //             else if(ch==2){
   //                System.out.println("Enter Gadget's Category:");
   //                String idsString = sc.nextLine();
   //                returnString+="where Gadget_category = '"+idsString+"'";
   //             }
   //          }
   //          else if(c1==2){
   //             returnString += "Company ";
   //             System.out.println("Enter update parameter:");
   //             System.out.println("\t1.Company_name VARCHAR(20),\n" + 
   //                               "\t2.Company_DOE Date NOT NULL,\n" + 
   //                               "\t3.Company_Desc VARCHAR(100),");
   //             Integer ch = sc.nextInt();
   //             while(ch!=1&&ch!=2&&ch!=3){
   //                ch = sc.nextInt(); 
   //             }  
   //             if(ch==1){
   //                System.out.println("Enter Company's Name:");
   //                String idsString = sc.nextLine();
   //                returnString+="where Company_name = '"+idsString+"'";
   //             }
   //             else if(ch==2){
   //                System.out.println("Enter Company's DOE(YYYY-MM-DD):");
   //                String idsString = sc.nextLine();
   //                returnString+="where Company_DOE = '"+idsString+"'";
   //             }
   //             else if(ch==3){
   //                System.out.println("Enter Company's Description:");
   //                String idsString = sc.nextLine();
   //                returnString+="where Company_Desc = '"+idsString+"'";
   //             }
   //          }
   //          else{
   //             returnString += "Techie ";
   //             System.out.println("Enter update parameter:");
   //             System.out.println("\t1.Techie_id INT,\n" + //
   //                               "\t2.Techie_name VARCHAR(20),\n" + //
   //                               "\t3.Techie_phone_no CHAR(10)");
   //             Integer ch = sc.nextInt();
   //             while(ch!=1&&ch!=2&&ch!=3){
   //                ch = sc.nextInt(); 
   //             }
   //             if(ch==1){
   //                System.out.println("Enter Techie's id:");
   //                Integer id = sc.nextInt();
   //                String idsString = id.toString();
   //                returnString+="where Techie_id = "+idsString;
   //             }
   //             else if(ch==2){
   //                System.out.println("Enter Techie's name:");
   //                String idsString = sc.nextLine();
   //                returnString+="where Techie_name = '"+idsString+"'";
   //             }
   //             else if(ch==2){
   //                System.out.println("Enter Techie's phone number:");
   //                String idsString = sc.nextLine();
   //                while(idsString.length()!=10){
   //                   System.out.println("Enter a valid phone number:");
   //                   idsString = sc.nextLine();
   //                }
   //                returnString+="where Techie_phone_no = '"+idsString+"'";
   //             }
   //          }
   //          return returnString;
   //       }
   //       else if(c==5){
   //          returnString += "select * ";
   //          Integer ch;
   //          if(c1==1){
   //             returnString += "from Techie";
   //             System.out.println("Choose one of the following selection criteria/parameter(all columns are displayed)");
   //             System.out.println("\t0.*(all),\n"+
   //                               "\t1.Techie_id INT,\n" + //
   //                               "\t2.Techie_name VARCHAR(20),\n" + //
   //                               "\t3.Techie_phone_no CHAR(10)");
               
   //             ch= sc.nextInt();
   //             if(ch!=0){
   //                returnString+=" where ";
   //             }
   //             else{
   //                returnString+=";";
   //             }
   //             if(ch==1){
   //                System.out.println("Choose condition:");
   //                System.out.println("1.= 2.> 3.< 4.>= 5.<= 6.!= 7.is NULL 8.is not NULL" );
   //                Integer chcond = sc.nextInt();
   //                System.out.println("Enter Techie_id(RHS)(Any integer if you chose condition 7.is NULL or 8.is not NULL):");
   //                Integer id2 = sc.nextInt();
   //                String idString2 = id2.toString();
   //                String s1="=",s2=">",s3="<",s4=">=",s5="<=",s6="!=",s7="is NULL",s8="is not NULL";
   //                if(chcond==1){
   //                   returnString+= "Techie_id "+s1+idString2;
   //                }
   //                else if(chcond==2){
   //                   returnString+= "Techie_id "+s2+idString2;
   //                }
   //                else if(chcond==3){
   //                   returnString+= "Techie_id "+s3+idString2;
   //                }
   //                else if(chcond==4){
   //                   returnString+= "Techie_id "+s4+idString2;
   //                }
   //                else if(chcond==5){
   //                   returnString+= "Techie_id "+s5+idString2;
   //                }
   //                else if(chcond==6){
   //                   returnString+= "Techie_id "+s6+idString2;
   //                }
   //                else if(chcond==7){
   //                   returnString+= "Techie_id "+s7;
   //                }
   //                else if(chcond==8){
   //                   returnString+= "Techie_id "+s8;
   //                }
   //             }
   //             else if(ch==2){
   //                sc.nextLine();
   //                System.out.println("Enter Techie_name:");
   //                String name = sc.nextLine();
   //                returnString+="Techie_name = '"+name+"'";

   //             }
   //             else if(ch==4){
   //                sc.nextLine();
   //                System.out.println("Enter Techie's phone number:");
   //                String name = sc.nextLine();
   //                returnString+="Techie_phone_no = '"+name+"'";
   //             }   
   //          }
   //          else if(c1==2){
   //             returnString += "from Company ";
   //             System.out.println("Choose one of the following selection criteria/parameter(all columns are displayed)");
   //             System.out.println("\t0.*(all),\n"+
   //                               "\t1.Company_name VARCHAR(20),\n" + 
   //                               "\t2.Company_DOE Date NOT NULL,\n" + 
   //                               "\t3.Company_Desc VARCHAR(100),");
               
   //             ch= sc.nextInt();
   //             if(ch!=0){
   //                returnString+="where ";
   //             }
   //             else{
   //                returnString+=";";
   //             }
               
   //             if(ch==1){
   //                sc.nextLine();
   //                System.out.println("Enter Company_name:");
   //                String name = sc.nextLine();
   //                returnString+="Company_name = '"+name+"'";
                  
   //             }
   //             if(ch==2){
   //                sc.nextLine();
   //                System.out.println("Enter Company_DOE:");
   //                String name = sc.nextLine();
   //                returnString+="Company_DOE = '"+name+"'";
                  
   //             }
   //             else if(ch==4){
   //                sc.nextLine();
   //                System.out.println("Enter Company_Desc:");
   //                String name = sc.nextLine();
   //                returnString+="Company_Desc = '"+name+"'";
   //             }
   //          }
   //          else if(c1==3){
   //             returnString += "from Gadget";
   //             System.out.println("Choose one of the following selection criteria/parameter(all columns are displayed)");
   //             System.out.println("\t0.*(all),\n"+
   //                               "\t1.Gadget_serial_no INT,\n" + 
   //                               "\t2.Gadget_name VARCHAR(25),\n" + 
   //                               "\t3.Gadget_Company_name VARCHAR(20),\n"+
   //                               "\t4.Gadget_category VARCHAR(20),");
   //             ch= sc.nextInt();
   //             if(ch!=0){
   //                returnString+=" where ";
   //             }
   //             else{
   //                returnString+=";";
   //             }
   //             if(ch==1){
   //                System.out.println("Choose condition:");
   //                System.out.println("1.= 2.> 3.< 4.>= 5.<= 6.!= 7.is NULL 8.is not NULL" );
   //                Integer chcond = sc.nextInt();
   //                System.out.println("Enter Gadget_serial_no(RHS)(Any integer if you chose condition 7.is NULL or 8.is not NULL):");
   //                Integer id2 = sc.nextInt();
   //                String idString2 = id2.toString();
   //                String s1="=",s2=">",s3="<",s4=">=",s5="<=",s6="!=",s7="is NULL",s8="is not NULL";
   //                if(chcond==1){
   //                   returnString+= "Gadget_serial_no "+s1+idString2;
   //                }
   //                else if(chcond==2){
   //                   returnString+= "Gadget_serial_no "+s2+idString2;
   //                }
   //                else if(chcond==3){
   //                   returnString+= "Gadget_serial_no "+s3+idString2;
   //                }
   //                else if(chcond==4){
   //                   returnString+= "Gadget_serial_no "+s4+idString2;
   //                }
   //                else if(chcond==5){
   //                   returnString+= "Gadget_serial_no "+s5+idString2;
   //                }
   //                else if(chcond==6){
   //                   returnString+= "Gadget_serial_no "+s6+idString2;
   //                }
   //                else if(chcond==7){
   //                   returnString+= "Gadget_serial_no "+s7;
   //                }
   //                else if(chcond==8){
   //                   returnString+= "Gadget_serial_no "+s8;
   //                }
   //             }
   //             else if(ch==2){
   //                sc.nextLine();
   //                System.out.println("Enter Gadget_name:");
   //                String name = sc.nextLine();
   //                returnString+="Gadget_name = '"+name+"'";

   //             }
   //             else if(ch==3){
   //                sc.nextLine();
   //                System.out.println("Enter Gadget's Company's name:");
   //                String name = sc.nextLine();
   //                returnString+="Gadget_Company_name = '"+name+"'";
   //             }   
   //             else if (ch==4) {
   //                sc.nextLine();
   //                System.out.println("Enter Gadget's Category name:");
   //                String name = sc.nextLine();
   //                returnString+="Gadget_category = '"+name+"'";
   //             }   
   //          }
   //          else if(c1==4){
   //             returnString += "from Ownership";
   //             System.out.println("Choose one of the following selection criteria/parameter(all columns are displayed)");
   //             System.out.println("\t0.*(all),\n"+
   //                               "\t1.TG_link_id INT,\n" + 
   //                               "\t2.T_id INT,\n" + 
   //                               "\t3.G_id INT,\n"+
   //                               "\t4.DOP(Date of Purchase) DATE NOT NULL,\n" +
   //                               "\t5.Purchase_price INT,");
   //             ch= sc.nextInt();
   //             if(ch!=0){
   //                returnString+=" where ";
   //             }
   //             else{
   //                returnString+=";";
   //             }
   //             if(ch==1){
   //                System.out.println("Choose condition:");
   //                System.out.println("1.= 2.> 3.< 4.>= 5.<= 6.!= 7.is NULL 8.is not NULL" );
   //                Integer chcond = sc.nextInt();
   //                System.out.println("Enter Transaction_id(RHS)(Any integer if you chose condition 7.is NULL or 8.is not NULL):");
   //                Integer id2 = sc.nextInt();
   //                String idString2 = id2.toString();
   //                String s1="=",s2=">",s3="<",s4=">=",s5="<=",s6="!=",s7="is NULL",s8="is not NULL";
   //                if(chcond==1){
   //                   returnString+= "TG_link_id "+s1+idString2;
   //                }
   //                else if(chcond==2){
   //                   returnString+= "TG_link_ido "+s2+idString2;
   //                }
   //                else if(chcond==3){
   //                   returnString+= "TG_link_id "+s3+idString2;
   //                }
   //                else if(chcond==4){
   //                   returnString+= "TG_link_id "+s4+idString2;
   //                }
   //                else if(chcond==5){
   //                   returnString+= "TG_link_id "+s5+idString2;
   //                }
   //                else if(chcond==6){
   //                   returnString+= "TG_link_id "+s6+idString2;
   //                }
   //                else if(chcond==7){
   //                   returnString+= "TG_link_id "+s7;
   //                }
   //                else if(chcond==8){
   //                   returnString+= "TG_link_id "+s8;
   //                }
   //             }
   //             else if(ch==2){
   //                System.out.println("Choose condition:");
   //                System.out.println("1.= 2.> 3.< 4.>= 5.<= 6.!= 7.is NULL 8.is not NULL" );
   //                Integer chcond = sc.nextInt();
   //                System.out.println("Enter Techie_id(RHS)(Any integer if you chose condition 7.is NULL or 8.is not NULL):");
   //                Integer id2 = sc.nextInt();
   //                String idString2 = id2.toString();
   //                String s1="=",s2=">",s3="<",s4=">=",s5="<=",s6="!=",s7="is NULL",s8="is not NULL";
   //                if(chcond==1){
   //                   returnString+= "T_id "+s1+idString2;
   //                }
   //                else if(chcond==2){
   //                   returnString+= "T_id "+s2+idString2;
   //                }
   //                else if(chcond==3){
   //                   returnString+= "T_id "+s3+idString2;
   //                }
   //                else if(chcond==4){
   //                   returnString+= "T_id "+s4+idString2;
   //                }
   //                else if(chcond==5){
   //                   returnString+= "T_id "+s5+idString2;
   //                }
   //                else if(chcond==6){
   //                   returnString+= "T_id "+s6+idString2;
   //                }
   //                else if(chcond==7){
   //                   returnString+= "T_id "+s7;
   //                }
   //                else if(chcond==8){
   //                   returnString+= "T_id "+s8;
   //                }

   //             }
   //             else if(ch==3){
   //                System.out.println("Choose condition:");
   //                System.out.println("1.= 2.> 3.< 4.>= 5.<= 6.!= 7.is NULL 8.is not NULL" );
   //                Integer chcond = sc.nextInt();
   //                System.out.println("Enter Gadget_id(RHS)(Any integer if you chose condition 7.is NULL or 8.is not NULL):");
   //                Integer id2 = sc.nextInt();
   //                String idString2 = id2.toString();
   //                String s1="=",s2=">",s3="<",s4=">=",s5="<=",s6="!=",s7="is NULL",s8="is not NULL";
   //                if(chcond==1){
   //                   returnString+= "G_id "+s1+idString2;
   //                }
   //                else if(chcond==2){
   //                   returnString+= "G_id "+s2+idString2;
   //                }
   //                else if(chcond==3){
   //                   returnString+= "G_id "+s3+idString2;
   //                }
   //                else if(chcond==4){
   //                   returnString+= "G_id "+s4+idString2;
   //                }
   //                else if(chcond==5){
   //                   returnString+= "G_id "+s5+idString2;
   //                }
   //                else if(chcond==6){
   //                   returnString+= "G_id "+s6+idString2;
   //                }
   //                else if(chcond==7){
   //                   returnString+= "G_id "+s7;
   //                }
   //                else if(chcond==8){
   //                   returnString+= "G_id "+s8;
   //                }
   //             }   
   //             else if (ch==4) {
   //                sc.nextLine();
   //                System.out.println("Enter Date of Purchase:");
   //                String name = sc.nextLine();
   //                returnString+="DOP = '"+name+"'";
   //             }   
   //             else if(ch==5){
   //                System.out.println("Choose condition:");
   //                System.out.println("1.= 2.> 3.< 4.>= 5.<= 6.!= 7.is NULL 8.is not NULL" );
   //                Integer chcond = sc.nextInt();
   //                System.out.println("Enter Purchase Price(RHS)(Any integer if you chose condition 7.is NULL or 8.is not NULL):");
   //                Integer id2 = sc.nextInt();
   //                String idString2 = id2.toString();
   //                String s1="=",s2=">",s3="<",s4=">=",s5="<=",s6="!=",s7="is NULL",s8="is not NULL";
   //                if(chcond==1){
   //                   returnString+= "Purchase_price "+s1+idString2;
   //                }
   //                else if(chcond==2){
   //                   returnString+= "Purchase_price "+s2+idString2;
   //                }
   //                else if(chcond==3){
   //                   returnString+= "Purchase_price "+s3+idString2;
   //                }
   //                else if(chcond==4){
   //                   returnString+= "Purchase_price "+s4+idString2;
   //                }
   //                else if(chcond==5){
   //                   returnString+= "Purchase_price "+s5+idString2;
   //                }
   //                else if(chcond==6){
   //                   returnString+= "Purchase_price "+s6+idString2;
   //                }
   //                else if(chcond==7){
   //                   returnString+= "Purchase_price "+s7;
   //                }
   //                else if(chcond==8){
   //                   returnString+= "Purchase_price "+s8;
   //                }

   //             }

   //          }
   //          return returnString;
   //       } 
   //       else if(c==6){
   //          if(c1==1){
   //             Integer id;
   //             System.out.println("Enter Gadget's serial number:");
   //             id = sc.nextInt();
   //             String idString = id.toString();
   //             returnString+= "select Gadget_serial_no, Gadget_name, Techie_id, Techie_name from Ownership inner join Gadget on G_id=Gadget_serial_no and Gadget_serial_no = "+idString+" inner join Techie on T_id=Techie_id;";
   //          }
   //          else if(c1==2){
   //             System.out.println("Enter Gadget's name:");
   //             String id = sc.nextLine();
   //             String idString = id.toString();
   //             returnString+= "select Gadget_serial_no, Gadget_name, Techie_id, Techie_name from Ownership inner join Gadget on G_id=Gadget_serial_no and Gadget_name = '"+ idString +"' inner join Techie on T_id=Techie_id;";

   //          }
   //          return returnString;
   //       }
   //       else if(c==7){
   //          if(c1==1){
   //             Integer id;
   //             System.out.println("Enter Techie's ID:");
   //             id = sc.nextInt();
   //             String idString = id.toString();
   //             returnString+= "select Techie_id, Techie_name, Gadget_serial_no, Gadget_name from Ownership inner join Techie on Techie_id = "+idString+"  and Techie_id = T_id inner join Gadget on G_id = Gadget_serial_no;";
   //          }
   //          else if(c1==2){
   //             System.out.println("Enter Techie's name:");
   //             String id = sc.nextLine();
   //             String idString = id.toString();
   //             returnString+= "select Techie_id, Techie_name, Gadget_serial_no, Gadget_name from Ownership inner join Techie on Techie_name = '"+idString+"'  and Techie_id = T_id inner join Gadget on G_id = Gadget_serial_no;";
   //          }
   //          return returnString;
   //       }

   //    // else{
   //       return "";
   //    // }
   // }
    
}

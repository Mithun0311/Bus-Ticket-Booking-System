import java.sql.SQLOutput;
import java.util.BitSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {

            Bus b = new Bus();

            Bus b1 = new Bus();
            b1.setUserid(12345);
            b1.setPass(11111);
            int a = b1.getUserid();
            int ww = b1.getPass();
            Scanner ac = new Scanner(System.in);
            System.out.println("Enter the UserID: ");
            int i = ac.nextInt();
            System.out.println("Enter the Pass: ");
            int j = ac.nextInt();
            if (a == i && ww == j) {
                Bus s1 = new Bus();
               s1.log();
                System.out.println("Welcome To Bus Ticket Booking System");

                s1.Buslist();

                System.out.println("Enter the Choice? ");
                int ch = ac.nextInt();
                if (ch == 1) {

                    System.out.println("***********Hanif Express************");
                    System.out.println("From: ");
                    String f = ac.next();
                    System.out.println("TO: ");
                    String t = ac.next();
                    System.out.println("Total Seat - 32");
                    System.out.println("Enter the Number Of passanger: ");
                    int s = ac.nextInt();
                    if(s<=32) {
                        System.out.println("Enter the Passanger Name: ");
                        String na = ac.next();
                        System.out.println("Select Payment Option: ");
                        System.out.println("1.Bkash\n2.Nagod\n3.Rocket");
                        int cho = ac.nextInt();

                        System.out.println("Enter Your Number");
                        int nn = ac.nextInt();
                        System.out.println("Enter the  Otp");
                        int o = ac.nextInt();
                        System.out.println("Enter Your Password: ");
                        int p = ac.nextInt();
                        System.out.println("Your Ticket is Confirm");
                        System.out.println("1.Download  Your Ticket\n2.Exit");
                        System.out.println("Choice: ");
                        int ci = ac.nextInt();
                        if (ci == 1) {
                            System.out.println("__________________________________");
                            System.out.println("From: " + f + "  TO: " + t);
                            System.out.println("name: " + na);
                            System.out.println("Ticket Price :" + 450 * s + " taka");
                            System.out.println("Mobile Number: " + nn);
                            System.out.println("__________Thanks You - Hanif Express______");

                        } else if (ci == 2) {


                        }
                    }
                    else {
                        System.out.println("Not Enoughp Empty Seat");
                    }

                } else if (ch == 2) {


                    System.out.println("***********Shymoli Express************");
                    System.out.println("From: ");
                    String fr = ac.next();
                    System.out.println("TO: ");
                    String to = ac.next();
                    System.out.println("Total Seat -52");
                    System.out.println("Enter Number Of pasanger: ");
                    int se = ac.nextInt();
                    if(se<=52) {
                        System.out.println("Enter the Passanger Name: ");
                        String nam = ac.next();
                        System.out.println("Select Payment Option: ");
                        System.out.println("1.Bkash\n2.Nagod\n3.Rocket");
                        int choi = ac.nextInt();

                        System.out.println("Enter Your Number");
                        int nm = ac.nextInt();
                        System.out.println("Enter the  Otp");
                        int op = ac.nextInt();
                        System.out.println("Enter Your Password: ");
                        int pi = ac.nextInt();
                        System.out.println("Your Ticket is Confirm");
                        System.out.println("1.Download  Your Ticket\2.Back To BusList");
                        System.out.println("Choice: ");
                        int cs = ac.nextInt();
                        if (cs == 1) {
                            System.out.println("From: " + fr + "  TO: " + to);
                            System.out.println("name: " + nam);
                            System.out.println("Ticket Price: " + 450 * se + " Taka");
                            System.out.println("Mobile Number: " + nm);
                            System.out.println("__________Thanks You - Shymoli Express______");

                        } else {

                        }
                    }


                } else if (ch == 3) {

                    System.out.println("***********Ena Express************");
                    System.out.println("From: ");
                    String fro = ac.next();
                    System.out.println("TO: ");
                    String too = ac.next();
                    System.out.println("Total Seat - 32");
                    System.out.println("Enter the Number Of pasanger: ");
                    int sea = ac.nextInt();
                    if(sea<=32) {
                        System.out.println("Enter the Passanger Name: ");
                        String namee = ac.next();
                        System.out.println("Select Payment Option: ");
                        System.out.println("1.Bkash\n2.Nagod\n3.Rocket");
                        int choic = ac.nextInt();

                        System.out.println("Enter Your Number");
                        int nmm = ac.nextInt();
                        System.out.println("Enter the  Otp");
                        int opp = ac.nextInt();
                        System.out.println("Enter Your Password: ");
                        int pii = ac.nextInt();
                        System.out.println("Your Ticket is Confirm");
                        System.out.println("1.Download  Your Ticket\2.Back To BusList");
                        System.out.println("Choice: ");
                        int css = ac.nextInt();
                        if (css == 1) {
                            System.out.println("From: " + fro + "  TO: " + too);
                            System.out.println("name: " + namee);
                            System.out.println("Ticket Price :" + sea * 450 + "Taka");
                            System.out.println("Mobile Number: " + nmm);
                            System.out.println("__________Thanks You - Ena Express______");

                        }
                        else
                        {

                        }
                    }
                    else
                    {
                        System.out.println("Not enoughp Empty Seat");
                    }

                } else if (ch == 4) {
                    System.out.println("*********** Dipjol Express************");
                    System.out.println("From: ");
                    String from = ac.next();
                    System.out.println("TO: ");
                    String ti = ac.next();
                    System.out.println("Total Seat - 32");
                    System.out.println("Enter Number Of passanger: ");
                    int set = ac.nextInt();
                    System.out.println("Enter the Passanger Name: ");
                    String namme = ac.next();
                    System.out.println("Select Payment Option: ");
                    System.out.println("1.Bkash\n2.Nagod\n3.Rocket");
                    int choic = ac.nextInt();

                    System.out.println("Enter Your Number");
                    int nmmb = ac.nextInt();
                    System.out.println("Enter the  Otp");
                    int opt = ac.nextInt();
                    System.out.println("Enter Your Password: ");
                    int piss = ac.nextInt();
                    System.out.println("Your Ticket is Confirm");
                    System.out.println("1.Download  Your Ticket\2.Back To BusList");
                    System.out.println("Choice: ");
                    int csi = ac.nextInt();
                    if (csi == 1) {
                        System.out.println("From: " + from + "  TO: " + ti);
                        System.out.println("name: " + nmmb);
                        System.out.println("Ticket Price: " + 450 * set + " Take");
                        System.out.println("Mobile Number: " + nmmb);
                        System.out.println("__________Thanks You-Dipjol Express______");

                    } else {

                    }
                }
                    else
                    {
                        System.out.println("Not enoughp Empty Seat");
                    }


            } else {
                Login l1 = new Login();
                l1.log();
            }

        }
    }
}



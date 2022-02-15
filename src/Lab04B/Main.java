/**
 * Name: Ngoc Duy Nguyen
 * Date: February 12, 2022
 * Description: This program will run a test to add objects to Instructor and add email
 * for each instructor and see how they deal with it
 */
package Lab04B;

public class Main {

    /**Main function: add emails to instructor for 10 days and print out information
     *
     * @param args */
    public static void main(String args[]) {
        Instructor[] objArray = new Instructor[3];
        objArray[0] = new Faculty(354, 10);
        objArray[1] = new Lecturer(862, 45);
        objArray[2] = new Grad(0, 22);
        //add mail to Faculty, Lecturer, Grad for 10 days
        for (int days = 1; days <= 10; days++) {
            int mail = (days * 10) + 50;
            objArray[0].getMail(mail);
            objArray[1].getMail(mail);
            objArray[2].getMail(mail);
        }
        System.out.println("Printing information after 10 days:");

        System.out.println("Faculty:");
        System.out.println(objArray[0].toString());

        System.out.println("\nLecturer:");
        System.out.println(objArray[1].toString());

        System.out.println("\nGrad:");
        System.out.println(objArray[2].toString());
    }

}

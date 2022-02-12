/**
 * Name: Ngoc Duy Nguyen
 * Date: February 12, 2022
 * Description: This program will run a test to add objects to Instructor and add email
 *              for each instructor and see how they deal with it
 */
package Lab04B;
public class Main {
    /**Main function
     *
     * @param args */
    public static void main(String args[]) {
        Instructor[] objArray = new Instructor[3];
        objArray[0] = new Faculty(354, 10);
        objArray[1] = new Lecturer(862, 45);
        objArray[2] = new Grad(0, 22);
        //add mail to Faculty, Lecturer, Grad for 10 days
        for(int days=1; days<=10;days++){
            int mail = (days*10)+50;
            objArray[0].getMail(mail);
            objArray[1].getMail(mail);
            objArray[2].getMail(mail);
        }
        System.out.println("Printing information after 10 days:");
        System.out.println("Faculty. Age " + objArray[0].getAge());
        System.out.println("Unread Email: " + objArray[0].getUnreadEmail());
        System.out.println("Eccentricities: " + objArray[0].getEccentricities());
        System.out.println("Stress: " + objArray[0].stress());
        System.out.println("Respect: " + objArray[0].respect());

        System.out.println("\nLecturer. Age " + objArray[1].getAge());
        System.out.println("Unread Email: " + objArray[1].getUnreadEmail());
        System.out.println("Eccentricities: " + objArray[1].getEccentricities());
        System.out.println("Stress: " + objArray[1].stress());
        System.out.println("Respect: " + objArray[1].respect());

        System.out.println("\nGrad. Age " + objArray[2].getAge());
        System.out.println("Unread Email: " + objArray[2].getUnreadEmail());
        System.out.println("Eccentricities: " + objArray[2].getEccentricities());
        System.out.println("Stress: " + objArray[2].stress());
        System.out.println("Respect: " + objArray[2].respect());
    }

}

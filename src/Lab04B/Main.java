package Lab04B;

public class Main {
    public static void main(String args[]) {
        Instructor[] objArray = new Instructor[3];
        objArray[0] = new Faculty(500, 10);
        objArray[1] = new Lecturer(200, 45);
        objArray[2] = new Grad(50, 22);

        for(int days=1; days<=10;days++){
            int mail = (days*10)+5;
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
    }
}

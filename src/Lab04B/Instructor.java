package Lab04B;

import java.util.Random;

abstract class Instructor {
    private int age;
    private int unreadEmail;
    private int eccentricities;

    public Instructor(int unreadEmail, int age){
        this.unreadEmail = unreadEmail;
        this.age = age;
        this.eccentricities = 0;
    }

    public int getAge() {
        return age;
    }
    public int getEccentricities() {
        return eccentricities;
    }
    public int getUnreadEmail() {
        return unreadEmail;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setEccentricities(int eccentricities) {
        this.eccentricities = eccentricities;
    }
    public void setUnreadEmail(int unreadEmail) {
        this.unreadEmail = unreadEmail;
    }

    public abstract void cope();

    public int stress(){
        int stress = this.unreadEmail;

        if(stress >1000)
            return -1;
        else
            return stress;
    }
    public int respect(){
        int respect = getAge() - getEccentricities();
        if(respect < 0)
            return 0;
        else
            return respect;
    }
    public void reduceMail(int readMail){
        while (this.unreadEmail>0)
        this.unreadEmail -= this.unreadEmail*readMail;
    }

    public void addToEccentricities(int ecc){
        while(this.eccentricities>0)
        this.eccentricities += ecc;
    }

    public void getMail(int newMail){
        this.unreadEmail += newMail;
        Random r = new Random();
        double random = Math.random();
        int eccRandom = r.nextInt(2);
        if(random < 0.2){
            if(eccRandom == 1)
                this.eccentricities += 2;
            else
                this.eccentricities -= 2;
        }

        if(stress() > respect())
            cope();
    }
}
class Grad extends Instructor{

    public Grad(int unreadEmail, int age) {
        super(unreadEmail, age);
    }

    @Override
    public void cope() {
        Random r1 = new Random();
        int eccRandom = r1.nextInt(2);
        if(eccRandom == 1)
            addToEccentricities(3);
        else
            addToEccentricities(-3);
    }
    public int stress(){
        int stress = getUnreadEmail();

        if(stress >1500)
            return -1;
        else
            return stress;
    }
}
class Lecturer extends Instructor{

    public Lecturer(int unreadEmail, int age) {
        super(unreadEmail, age);
    }

    @Override
    public void cope() {
        int mail = (int) (0.6*getUnreadEmail());
        reduceMail(mail);
    }
}
class Faculty extends Instructor{

    public Faculty(int unreadEmail, int age) {
        super(unreadEmail, age);
    }

    @Override
    public void cope() {
        addToEccentricities(30);
    }
    public int respect(){
        int respect = getAge() + getEccentricities();
        return respect;
    }
}



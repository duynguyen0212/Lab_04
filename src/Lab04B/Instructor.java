/*
    Name: Ngoc Duy Nguyen
    Date: 2/12/2022
    Description: Inheritance and interfaces
*/
package Lab04B;

import java.util.Random;

/**
 * Abstract Instructor represent 3 Instructor and how they deal with unread email and stress
 */
abstract class Instructor {
    private int age;
    private int unreadEmail;
    private int eccentricities;

    /**
     * Creates an Instructor contain unread email, age and eccentricities
     */
    public Instructor(int unreadEmail, int age) {
        this.unreadEmail = unreadEmail;
        this.age = age;
        this.eccentricities = 0;
    }

    /**
     * Gets age of Instructor.
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets eccentricities of Instructor.
     *
     * @return eccentricities
     */
    public int getEccentricities() {
        return eccentricities;
    }

    /**
     * Gets unread emails of Instructor.
     *
     * @return unread email
     */
    public int getUnreadEmail() {
        return unreadEmail;
    }

    /**
     * Sets Instructor's age
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets Instructor's eccentricities
     *
     * @param eccentricities
     */
    public void setEccentricities(int eccentricities) {
        this.eccentricities = eccentricities;
    }

    /**
     * Sets Instructor's age
     *
     * @param unreadEmail
     */
    public void setUnreadEmail(int unreadEmail) {
        this.unreadEmail = unreadEmail;
    }

    /**
     * Anything that inherits from Instructor will implement this method
     */
    public abstract void cope();

    /**
     * Stress is equal to unread email.
     *
     * @return stress, return -1 if stress reach over 1000
     */
    public int stress() {
        int stress = this.unreadEmail;

        if (stress > 1000) {
            return -1;
        } else {
            return stress;
        }
    }

    /**
     * Respect is equal to the instructors age minus the
     * eccentricities (age – eccentricities).
     *
     * @return respect. Return 0 if respect < 0
     */
    public int respect() {
        int respect = getAge() - getEccentricities();
        if (respect < 0) {
            return 0;
        } else {
            return respect;
        }
    }

    /**
     * Reduce mail. Set unread email = 0 if unread email < 0
     *
     * @param readMail unread email subtract readMail and will set unread email
     *                 to 0 if unread email < 0
     */
    public void reduceMail(int readMail) {
        if (this.unreadEmail > 0) {
            this.unreadEmail -= readMail;
        } else {
            setUnreadEmail(0);
        }
    }

    /**
     * Add an int ecc to eccentricities
     *
     * @param ecc The ecc will be added to eccentricities
     */
    public void addToEccentricities(int ecc) {
        if (this.eccentricities > 0) {
            this.eccentricities += ecc;
        }
    }

    /**
     * Add new mail into unread mail and have 20% chance to add or subtract eccentricities by 2\
     * if stress > respect, cope will be executed by inherited class
     *
     * @param newMail New email will be added to unread email
     */
    public void getMail(int newMail) {
        this.unreadEmail += newMail;
        Random r = new Random();
        double random = Math.random();
        int eccRandom = r.nextInt(2);
        if (random < 0.2) {
            if (eccRandom == 1) {
                this.eccentricities += 2;
            } else {
                this.eccentricities -= 2;
            }
        }

        if (stress() > respect()) {
            cope();
        }
    }

    /**
     * toString method
     *
     * @return String
     */
    @Override
    public String toString() {
        return "- Age: " + this.getAge()
                + "\n- Unread Email: " + this.getUnreadEmail()
                + "\n- Eccentricities: " + this.getEccentricities()
                + "\n- Stress: " + this.stress()
                + "\n- Respect: " + this.respect();
    }
}

/**
 * Grad inherit from Instructor
 */
class Grad extends Instructor {
    public Grad(int unreadEmail, int age) {
        super(unreadEmail, age);
    }

    @Override
    public void cope() {
        this.setUnreadEmail(0);
        Random r1 = new Random();
        int eccRandom = r1.nextInt(2);
        if (eccRandom == 1) {
            addToEccentricities(3);
        } else {
            addToEccentricities(-3);
        }
    }

    public int stress() {
        int stress = getUnreadEmail();

        if (stress > 1500) {
            return -1;
        } else {
            return stress;
        }
    }
}

class Lecturer extends Instructor {
    public Lecturer(int unreadEmail, int age) {
        super(unreadEmail, age);
    }

    @Override
    public void cope() {
        int deleteMail = (int) (0.6 * getUnreadEmail());
        reduceMail(deleteMail);
    }
}

class Faculty extends Instructor {
    public Faculty(int unreadEmail, int age) {
        super(unreadEmail, age);
    }

    @Override
    public void cope() {
        addToEccentricities(30);
    }

    public int respect() {
        return getAge() + getEccentricities();
    }
}



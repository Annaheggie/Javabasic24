package javabasicanna.homeworks.lecture3;

public class ChineseDynasties {
    public static void main(String[] args) {
        int liWarrior = 860; // amount of li warrior
        int liArcher = 860; // amount of li archer
        int liRider = 860; // amount of li rider

        int mingWarrior = (int) (liWarrior * 1.5);
        int mingArcher = (int) (liArcher * 1.5);
        int mingRider = (int) (liRider * 1.5);

        int liTotalAttack = liWarrior * 13 + liArcher * 24 + liRider * 46;
        int mingTotalAttack = mingWarrior * 9 + mingArcher * 35 + mingRider * 12;

        System.out.println("Li Dynasty Total Attack: " + liTotalAttack);
        System.out.println("Ming Dynasty Total Attack: " + mingTotalAttack);
    }
}
package javabasicanna.homeworks.lecture11;


public class SmartphonesMain {
    public static void main(String[] args) {
        // Creating instances of Androids
        Androids androidfirstdevice = new Androids();
        Androids androidseconddevice = new Androids();
        Androids androidthirddevice = new Androids();

        // Creating instances of iPhones
        iPhones iPhonefirstdevice = new iPhones();
        iPhones iPhoneseconddevice = new iPhones();
        iPhones iPhonethirddevice = new iPhones();

        // Using the methods of Androids and iPhones
        androidfirstdevice.call();
        androidseconddevice.sms();
        androidthirddevice.internet();
        androidfirstdevice.runLinuxCommands();

        iPhonefirstdevice.call();
        iPhoneseconddevice.sms();
        iPhonethirddevice.internet();
        iPhonefirstdevice.faceTime();
    }
}

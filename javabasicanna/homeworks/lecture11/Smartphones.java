package javabasicanna.homeworks.lecture11;

public interface Smartphones {
    void call();
    void sms();
    void internet();
}

// Interface for Android OS
interface LinuxOS {
    void runLinuxCommands();
}

// Interface for iOS
interface iOS {
    void faceTime();
}

// Android class implementing Smartphones and LinuxOS
class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Android calling...");
    }

    @Override
    public void sms() {
        System.out.println("Android sending SMS...");
    }

    @Override
    public void internet() {
        System.out.println("Android browsing the internet...");
    }

    @Override
    public void runLinuxCommands() {
        System.out.println("Running Linux commands on Android...");
    }
}

// iPhone class implementing Smartphones and iOS
class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("iPhone calling...");
    }

    @Override
    public void sms() {
        System.out.println("iPhone sending SMS...");
    }

    @Override
    public void internet() {
        System.out.println("iPhone browsing the internet...");
    }

    @Override
    public void faceTime() {
        System.out.println("Using FaceTime on iPhone...");
    }
}

// Main class


package com.example.quizapp;

public class QuestionAnswer {

    public static String question[] ={
            "Android is -",
            "Under which of the following Android is licensed?",
            "Which of the following virtual machine is used by the Android operating system?",
            "How can we stop the services in android?"
    };

    public static String choices[][] = {
            {"an operating system","a web browser","a web server","None of the above"},
            {"OSS","Sourceforge","Apache/MIT","None of the above"},
            {"JVM","Dalvik virtual machine","Simple virtual machine","None of the above"},
            {"By using the stopSelf() and stopService() method","By using the finish() method","By using system.exit() method","None of the above"}
    };

    public static String correctAnswers[] = {
            "an operating system",
            "Apache/MIT",
            "Dalvik virtual machine",
            "By using the stopSelf() and stopService() method"
    };

}

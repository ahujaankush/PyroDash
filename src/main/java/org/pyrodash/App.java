package org.pyrodash;

import javax.swing.*;

public class App {

    // Constants which serve a documenting purpose
    public static final String APPLICATION_VERSION = "0.1ALPHA";
    public static final String APPLICATION_AUTHOR = "Ankush Ahuja";
    public static final String APPLICATION_NAME = "PyroDash";
    public static final String APPLICATION_DESCRIPTION = "E";

    public static void main(String[] args) {
        System.out.println(APPLICATION_NAME+" - "+ APPLICATION_DESCRIPTION
        +"\nVERSION: "+APPLICATION_VERSION
        +"\nAUTHOR: "+APPLICATION_AUTHOR);
        System.out.println("APPLICATION ARGUMENTS: " + args.length);
    }
}
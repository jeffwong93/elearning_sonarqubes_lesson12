package com.sddevops.sonarqube_maven.eclipse;

import java.util.logging.Logger;
import java.util.logging.Level;

public class App {
    public static void main(String[] args) {
       Logger logger = Logger.getLogger(App.class.getName());
       logger.log(Level.INFO, "Hello World");
    }
}

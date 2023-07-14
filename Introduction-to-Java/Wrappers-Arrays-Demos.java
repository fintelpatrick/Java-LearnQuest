package com.learnquest.demos;

public class Primitives{

    private byte b = 127;
    private Byte b2 = 128;  //this will cause an Error as bytes cant exceed 127

    private short s = 128;
    private Short s2 = 32768; // Error because again its too large

    private int i = 10;
    private Integer j = 10;

    private long l = 1_000_000_000;
    private Long l2 = 10 * 1;

    private float e = 2.71828; // This causes an error since it needs to declared
    private Float pi = 3.14159f; // as such like in this line, with the f at the end

    private double double_e = 2.71828;
    private Double double_pi = 3.14159;

    private boolean flag = true;
    private boolean flag2 = false;

    private char eol = '\n';
    private Character ret = '/r';

    private Objeect o = new Object();
    private String str = "Hello World";
    private String[] pets = {"Mocha", "Kotick", "Wonderland", "Sky",
                             "Midnight"
                           }

}

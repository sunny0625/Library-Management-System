package model;

import controller.Operations;

public class DriverManager
{

    public static Functionality getFunctionality()
    {
        return new Operations();
    }
}

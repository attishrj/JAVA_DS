package com.abstractinfo.and.interfaceinfo;

public abstract class AbstractDemo {
	public int a;
	AbstractDemo(int c)
    {
        a = 10;
    }
 
    abstract public void set();
     
    abstract final public void get();

}

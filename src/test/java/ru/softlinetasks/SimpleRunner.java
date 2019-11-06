package ru.softlinetasks;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class SimpleRunner {
    public static void main(String[] args) {
        SimpleRunner sr = new SimpleRunner();

        sr.runTests();
    }

    private void runTests() {
        Class cl = null;
        try {
            cl = Class.forName("ru.softlinetasks.TestTasks");
            Constructor constr = cl.getConstructor();
            Object entity = constr.newInstance();
            Method[] methods = cl.getMethods();
            for (Method m : methods) {
                Test annotation = m.getAnnotation(Test.class);
                if (annotation != null){
                    m.invoke(entity);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

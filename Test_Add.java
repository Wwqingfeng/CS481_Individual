package test;

import org.junit.Test;

class Test_Add {

    SimpleJunit SJ;

    @Test
    public void testMethod(){

        boolean result = false;

        if (SJ.add(2,3) == 5){
            System.out.println("Test passed.");
        }else {
            System.out.println("Test not passed.");
        }

    }
}

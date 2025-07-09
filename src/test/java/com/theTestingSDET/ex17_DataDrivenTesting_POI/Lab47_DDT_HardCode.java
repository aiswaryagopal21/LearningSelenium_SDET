package com.theTestingSDET.ex17_DataDrivenTesting_POI;

import com.theTestingSDET.commonToAll;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab47_DDT_HardCode extends commonToAll {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String email, String Password){
        System.out.println(email+ " _ "+ Password);

    }
    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin@gmail.com","pass123"}
        };
    }
}

package com.theTestingSDET.ex17_DataDrivenTesting_POI;

import com.theTestingSDET.commonToAll;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab49_DDT_Testng_POI_REAL extends commonToAll {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String email, String Password){
        System.out.println(email+ " _ "+ Password);

    }
    @DataProvider
    public Object[][] getData(){
        //Read the excel file
        //convert the data R, C into the data[][]
        //return new Object[][];
        return null;

    }
}

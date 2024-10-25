package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */

    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * create a test for add city method
     */

    @Test
    public void addCityTest()
    {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);

    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Edmonoton", "AB");
        list.addCity(city);
        int listSize = list.getCount();
        list.deleteCity(city);
        assertEquals(list.getCount(), listSize - 1);
    }
    @Test
    public void hasCityTest()
    {
        list = MockCityList();
        City city = new City("Winnipeg", "MB");
        list.addCity(city);
        assertTrue(list.hasCity(city));

    }



}

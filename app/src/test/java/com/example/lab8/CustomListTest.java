package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
	private CustomList list;
	/*
	creates a mocklist for my citylist
	@ return
	 */

	public CustomList mockCityList() {
		list = new CustomList(null, new ArrayList<>());
		return list;
	}

	@Test
	public void addCityTest(){
		list = mockCityList();
		int listSize = list.getCount();
		list.addCity(new City("Estevan", "SK"));
		assertEquals(list.getCount(), listSize+1);
	}

	@Test
	public void deleteCityTest(){
//		list = mockCityList2();
//		int listSize = list.getCount();
//		list.deleteCity(city1);
//		assertEquals(list.getCount(), listSize-1);
		list = mockCityList();
		int listSize = list.getCount();
		City city1 = new City("Estevan", "SK");
		list.addCity(city1);
		list.deleteCity(city1);
		assertEquals(list.getCount(), 0);
	}
}

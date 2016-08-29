package com;

import java.util.*;

public class ChocolateExpert {
		public ArrayList<String> getBrands(String color){
			ArrayList brands = new ArrayList();
			if (color.equals("black")){
				brands.add("Babaevsky");
				brands.add("Spartak");
			}
			else if (color.equals("white")){
				brands.add("Russia");
			}
			else{
				brands.add("Milka");
			}
			return(brands);
		}
}

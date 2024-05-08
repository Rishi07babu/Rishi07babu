package Serialtion;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExecutionSerial {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		File f = new File(
				"C:\\Users\\Lenovo\\eclipse-workspace\\Day8Serialization\\src\\main\\resources\\Exp4Serial.json");

		ObjectMapper o = new ObjectMapper();

		ArrayList<Topping> t = new ArrayList<Topping>();

		Topping t1 = new Topping("5001", "none");
		Topping t2 = new Topping("5002", "Glazed");
		Topping t3 = new Topping("5003", "Sugar");
		Topping t4 = new Topping("5004", "Powder Sugar");
		Topping t5 = new Topping("5005", "Chocki");
		Topping t6 = new Topping("5006", "Choclate");
		Topping t7 = new Topping("5007", "Maple");

		t.add(t1);
		t.add(t2);
		t.add(t3);
		t.add(t4);
		t.add(t5);
		t.add(t6);
		t.add(t7);

		ArrayList<Batter> al = new ArrayList<Batter>();

		Batter b1 = new Batter("1001", "Regular");
		Batter b2 = new Batter("1002", "Chocolate");
		Batter b3 = new Batter("1003", "Blueberry");
		Batter b4 = new Batter("1004", "Devils Food");

		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);

		Batters b = new Batters(al);

		Root8 r = new Root8("0001", "donut", "cake", 0.55, b, t);
		o.writeValue(f, r);

	}

}

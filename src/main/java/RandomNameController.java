import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class RandomNameController {
	public static void main(String[] args) {
		VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
		staticFileLocation("/public");

		ArrayList<Person> classPeople = new ArrayList<>();
		Person person1 = new Person("Tara");
		Person person2 = new Person("Richard");
		Person person3 = new Person("Campbell");
		Person person4 = new Person("Greg");
		Person person5 = new Person("Pete");
		Person person6 = new Person("Cleyra");
		Person person7 = new Person("Stephan");
		Person person8 = new Person("Roddy");
		Person person9 = new Person("Adri");
		Person person10 = new Person("Derek");
		Person person11 = new Person("Jack");
		Person person12 = new Person("Angelina");
		Person person13 = new Person("Steven");
		Person person14 = new Person("Matt");
		Person person15 = new Person("Craig");
		Person person16 = new Person("Joe");
		Person person17 = new Person("Debi");
		Person person18 = new Person("Farheen");
		Person person19 = new Person("Harjit");
		classPeople.add(person1);
		classPeople.add(person2);
		classPeople.add(person3);
		classPeople.add(person4);
		classPeople.add(person5);
		classPeople.add(person6);
		classPeople.add(person7);
		classPeople.add(person8);
		classPeople.add(person9);
		classPeople.add(person10);
		classPeople.add(person11);
		classPeople.add(person12);
		classPeople.add(person13);
		classPeople.add(person14);
		classPeople.add(person15);
		classPeople.add(person16);
		classPeople.add(person17);
		classPeople.add(person18);
		classPeople.add(person19);


		get("/one", (req, res) -> {
			Random random = new Random();
			Person oneName = classPeople.get(random.nextInt(classPeople.size()));

			HashMap<String, Object> model = new HashMap<>();
			model.put("name", oneName);
			model.put("template", "persons.vtl");
			return new ModelAndView(model, "layout.vtl");
		}, velocityTemplateEngine);






	}
}

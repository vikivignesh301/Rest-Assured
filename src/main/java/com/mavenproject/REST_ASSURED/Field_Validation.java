package com.mavenproject.REST_ASSURED;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Field_Validation {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader file = new FileReader("C:\\Users\\VIGNESH S\\eclipse-workspace\\REST_ASSURED\\Json_File");

		JSONParser js = new JSONParser();

		Object parseFile = js.parse(file); // file is convert to object

		JSONObject jo = (JSONObject) parseFile; // object converted to jason object

		Object name = jo.get("name");

     	System.out.println(name);

		Object owner = jo.get("owner");

		System.out.println(owner);

		JSONArray ja = (JSONArray) owner;

		for (int i = 0; i < ja.size(); i++) {

			System.out.println(ja.get(i));

			Object ownerObject = ja.get(i);

			JSONObject id = (JSONObject) ownerObject;
			if (id.get("id") != null) {

				System.out.println(id.get("id"));

			}

		}

		Object skills = jo.get("skills");

//		System.out.println(object2);

		JSONArray json_Skill = (JSONArray) skills;

//		System.out.println(ja.get(0));

		for (int i = 0; i < json_Skill.size(); i++) {

//			System.out.println(json_Owner.get(i));

			Object skillsObject = json_Skill.get(i);

//			JSONObject skill = (JSONObject) skillsObject;
//			if (skill.get("skill") != null) {

			System.out.println(skillsObject);

//			}

		}

	}

}

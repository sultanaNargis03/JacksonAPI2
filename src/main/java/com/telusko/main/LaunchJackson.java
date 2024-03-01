package com.telusko.main;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.pojo.Implementers;

public class LaunchJackson 
{
	public static void main(String[] args) throws JsonProcessingException 
	{
		//create Objectmapper
		ObjectMapper mapper=new ObjectMapper();
	
		//Json to java
		try 
		{
			//Implementers implementer=mapper.readValue(new File("jsondata/sample.json"), Implementers.class);
			Implementers implementer=mapper.readValue(new File("jsondata/sample-complex.json"), Implementers.class);
		
			//printing data on console recieved from json to converted to java obj
			System.out.println("Implementer id : "+implementer.getId());
			System.out.println("Implementer name : "+implementer.getName());
			System.out.println("Implementer city : "+implementer.getCity());
			System.out.println("Implementer active : "+implementer.isActive());
			
			System.out.println("Implementers course details :"+implementer.getCourse());
			String[] hobbies=implementer.getHobbies();
			for(String hobby:hobbies)
			{
				System.out.print(hobby+" ");
			}
	
		} 
		catch (StreamReadException e) 
		{
			
			e.printStackTrace();
		} catch (DatabindException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}

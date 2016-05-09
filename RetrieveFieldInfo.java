package testGenerator;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;


public class RetrieveFieldInfo {

	/**
	 * Default constructor
	 */
	private String dpath;
	public RetrieveFieldInfo(String path) {
		dpath = path;
	}

//NEW
	/**
	 * Function to return all distinct values for a specified field. Used for populating drop-down boxes
	 * in GUI.
	 * @param tagname
	 * @return ordered Array with the requested field values
	 */
	public String[] returnFieldValues(String fieldName){
		ArrayList<String> fieldValueSet = new ArrayList<String>();
		String[] fieldArray = {""};
		try {
			DocumentBuilderFactory dBF = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dBF.newDocumentBuilder();
			Document database = docBuilder.parse(new File(dpath));
			
			NodeList fieldList = database.getElementsByTagName(fieldName);
			
			for(int i=0; i<fieldList.getLength(); i++) {
				String fieldValue = String.valueOf(fieldList.item(0).getNodeValue().trim());
				if (!fieldValueSet.contains(fieldValue)) {
					fieldValueSet.add(fieldValue.toString());
				}
			}
			
			fieldArray = fieldValueSet.toArray(new String[0]);
			quickSort(fieldArray, 0, fieldArray.length - 1);

		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch(SAXException se) {
			se.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return fieldArray;
	}

	/* Quicksort for returnFieldValues
	*/
	public void quickSort(String[] data, int start, int end) {
		int i = start, j = end;
		String pivot = data[(i + j)/2];
		String temp;

		while(i <= j) {
			while(data[i].compareTo(pivot) < 0) i++;
			while(data[j].compareTo(pivot) > 0) j--;
			if(i <= j) {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		if(start < j) quickSort(data, start, j);
		if(i < end) quickSort(data, i, end);
	}
	
}

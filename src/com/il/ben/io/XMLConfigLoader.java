package com.il.ben.io;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;

import com.il.ben.go.pirate.Configuration;

public class XMLConfigLoader {

	private DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	private DocumentBuilder xmlReader;
	private Element currentElement;
	
	public XMLConfigLoader() throws ParserConfigurationException {
		this.xmlReader = dbFactory.newDocumentBuilder();
	}

	public List<Configuration<?>> getConfigurations() {
		File dir = new File(IOConfig.XML_CONFIG_PATH);
		List<Configuration<?>> configs = new ArrayList<Configuration<?>>();
		
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (File file : files) {
				configs.add(this.getObject(file));
			}
		}
	}
	
	private Configuration<?> getObject(File file) {
		
	}
}

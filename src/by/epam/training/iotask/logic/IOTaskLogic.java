package by.epam.training.iotask.logic;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOTaskLogic {

	public String readFile(File file) {
		String s= "";
		try {
			FileReader fr = new FileReader(file);
			fr.read();
			int c;
            while((c=fr.read())!=-1){
                s = s +(char)c;
            } 
			fr.close();
		} catch (IOException e) {
			System.err.println(e);
		}
		return s;
	}
	
	public void writeKeyWords(File file, String s) {
		String p = "abstract|assert|boolean|break|byte|case|catch|char|class|const|continue|default|do|double|else|enum|extends|final|finally|float|for|goto|if|implements|import|instanceof|int|interface|long|native|new|package|private|protected|public|return|short|static|strictfp|super|switch|synchronized|this|throw|throws|transient|try|void|volatile|while|var|true|null|false";
		 Pattern pattern = Pattern.compile(p);
	        Matcher matcher = pattern.matcher(s);
	        String m = "";
	        List<String> list = new ArrayList<String>();
	        try {
				FileWriter fw = new FileWriter(file);
				while(matcher.find()) {
		        	m = matcher.group();
		        	fw.write(m + " ");
		        	list.add(m);
		        }
				int count = list.size();
				fw.write("Number of keywords is " + count);
				fw.close();
			} catch (IOException e) {
				System.err.println(e);
			}	        
	} 
	
}

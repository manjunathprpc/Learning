
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.htmlparser.jericho.Attribute;
import net.htmlparser.jericho.Attributes;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.StartTag;

public class JerichoHMTLParserUsage {

	static final List symbols = new ArrayList();
	static final String URL = "file:///E:\\Sandeep\\projects\\hcl-projects\\lisa\\lisa-hcl-test\\src\\main\\resources\\test.jsp";
	static String sendTo = "";

	public static void main(String[] args) throws Exception {
		Source source = new Source(new URL(URL));

		source.fullSequentialParse();

		List<StartTag> allStartTags = source.getAllStartTags();
		for (StartTag startTag : allStartTags) {
			Attributes attributes = startTag.getAttributes();
			if (attributes != null) {
				String tab ="\n\t";
				boolean flag = false;
				for (Iterator<Attribute> i = startTag.getAttributes().iterator(); i.hasNext();) {
					Attribute attribute = i.next();
					String attrName = attribute.getKey();
					//log(startTag.getName()+" : "+ tab+ attrName);
					if(flag== false)
						tab=  tab + tab;
					flag = true;
					if (attrName.equals("property")){
						log(startTag.toString() + "--"+ attribute.getValue());
					}
				}
			}

		}

	}


	private static void log(final String str) {
		System.out.println(str);
	}

}

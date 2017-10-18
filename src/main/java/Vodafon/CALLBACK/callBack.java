package Vodafon.CALLBACK;

import java.net.URL;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class callBack {
	
	private String corrID;
	private String file_path;
	

	public callBack setOrder(String randomCorrID, String file_path){
		this.corrID =randomCorrID;
		this.file_path=file_path;
		return this;

		
	}
	
	public String done(){
		String callBackMessage1="";
		
		 readXMLFile file=  new readXMLFile();
		 URL inputStreamUrl = ClassLoader.getSystemResource(file_path);
         
		 if(file.setDocument(inputStreamUrl.getFile())){
			    Document document = file.getDocument();       
		         Element classElement = document.getRootElement();
		         
		         List<Node> nodes = document.selectNodes("/soapenv:Envelope //*[contains(text(),'753951') ]" );
		         for(int i=0;i<nodes.size();i++){
		        	 nodes.get(i).setText(corrID);
		         }
		        
		         callBackMessage1=document.asXML().toString();
			 
		 }
     
		 System.out.println(callBackMessage1);
		return callBackMessage1;
	}

	public void callBack1(String corrID) {
		callBack request = new callBack();
		String url = "https://localhost:9002/vodafonegenericintegration/vetting";
		RestAssured.config = RestAssured
				.config()
				.sslConfig(new SSLConfig()
						.x509HostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER));
		try {
			RequestSpecification requestSpec = given()
					.with()
					.header("SOAPAction", "authenticate")
					.contentType("text/xml; charset=UTF-8;")
					.body(request.setOrder(corrID, "CallBackCreditVetting.xml").done());
			requestSpec.auth().basic("hybrisuser", "hybrisuser");
			requestSpec.post(url).then().statusCode(200);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
				

}

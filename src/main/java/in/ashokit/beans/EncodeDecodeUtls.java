package in.ashokit.beans;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodeDecodeUtls 
{
	public String encode(String text)
	{
		Encoder encoder = Base64.getEncoder();
		String encodedString =encoder.encodeToString(text.getBytes());
		return encodedString;
		
	}
	
	public String decode(String encodedString1)
	{
		Decoder decoder = Base64.getDecoder();
		 byte[] decode =decoder.decode(encodedString1);
		return new String(decode);
	}
	
	public static void main(String[] args) 
	{
		EncodeDecodeUtls edutls = new EncodeDecodeUtls();
		String encodedValue = edutls.encode("KaranKumar123");
		System.out.println("Encoded Vlaue is : : "+encodedValue);
		
		String decodedValue = edutls.decode(encodedValue);
		System.out.println("Decoded Vlaue is : : "+decodedValue);
		
		
	}

}

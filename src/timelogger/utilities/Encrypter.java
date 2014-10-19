package timelogger.utilities;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Encrypter {
	
	private String password;		//inserted into the login field
	private String pwencrypted = new String();		//output of the class.
	//the two following parameter should be take out from a configuration file
	private String charset = new String();			//charset used to convert from string to binary
	private String alghorithm = new String();		//Alghorithm used for encryption
	//the encryption machine
	private MessageDigest md;
	private byte[] inputbytes;
	private byte[] mdbytes;
	
	
	public Encrypter()
	{
		this.charset = "UTF-8";
		this.alghorithm = "MD5";
		try {
			this.md=MessageDigest.getInstance(alghorithm);
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Errore: algoritmo di criptazione insesistente");
			e.printStackTrace();
		}
		
	}
	
	
	public Encrypter(String charset, String alghorithm)
	{
		this.charset = charset;
		this.alghorithm = alghorithm;
		try {
			this.md=MessageDigest.getInstance(alghorithm);
		} catch (NoSuchAlgorithmException e) 
		{
			System.out.println("Errore: algoritmo di criptazione insesistente");
			e.printStackTrace();
		}
	}
	
	
	public String encrypt(String pw) 
	{
		
		this.password=pw;
		
		try {
			inputbytes = password.getBytes(charset);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Errore: encoding dei caratteri insesistente");
			e.printStackTrace();
		}
		this.md.reset();
		md.update(inputbytes);
		mdbytes = md.digest();
		return this.getHexOutput();
	}
	
	
	//the next method generate a string in Hexadecimal
	//of the encrypted password
	public String getHexOutput() {
		this.pwencrypted="";
		for (int i = 0; i<mdbytes.length; i++)
			pwencrypted+=Integer.toString( ( mdbytes[i] & 0xff ) + 0x100, 16).substring( 1 );
	    return pwencrypted;
	}
	//remember: to confront string use method aString.confirm(anotherString);

}

	
	
	
	



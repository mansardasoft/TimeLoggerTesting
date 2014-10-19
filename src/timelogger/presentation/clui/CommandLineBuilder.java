package timelogger.presentation.clui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandLineBuilder {

	private static CommandLineBuilder instance;
	
	private Terminal terminal=new Terminal();
	
	/**
	 * 
	 * @return 
	 */
	public static void buildTerminal() {
		if(instance==null)
			instance=new CommandLineBuilder();
		instance.getTerminal().setVisible(true);
	}

	/**
	 * 
	 * @return 
	 */
	public void buildConfirmCommandPopup() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public void buildConfirmedCommandPopup() {
		throw new UnsupportedOperationException();
	}
	
	public void print(String s)
	{
		this.terminal.addLog(this.getFormattedMessage(s));
	}
	
	public String getFormattedMessage(String s)
	{
		String toPrint=new String();
		toPrint+="Timelogger :O  "+s;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        dateFormat.format(date);
		toPrint+="\n... "+date.toString()+"\n";
		return toPrint;
	}

	public static CommandLineBuilder getInstance() {
		return instance;
	}

	public static void setInstance(CommandLineBuilder instance) {
		CommandLineBuilder.instance = instance;
	}

	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
}

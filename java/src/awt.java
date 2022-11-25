import java.awt.*;










public class awt extends Frame {
	
	Button btn;
	public awt(){
		super("jona");
		setSize(1000,600);
		setLayout(null);
		btn=new Button("clickme");
		btn.setBounds(75, 75, 200, 50);
		add(btn);
		setVisible(true);
		
	}
    public static void main(String[] args) {
    	awt a=new awt();
    
	
	}

}

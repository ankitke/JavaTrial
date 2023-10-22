import javax.swing.JOptionPane;
class Table
{
	public static void main(String arg[])
	{
		String s2="";
		String s1=JOptionPane.showInputDialog("Enter no = ");
		int n=Integer.parseInt(s1);
		for(int i=1;i<=10;i=i+1)
		{
			
			s2=s2+"\n"+n+"x"+i+"="+n*i;
		}
		JOptionPane.showMessageDialog(null,s2);
	}
}
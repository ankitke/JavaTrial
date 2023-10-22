import javax.swing.JOptionPane;
class Table2
{
	public static void main(String arg[])
	{
		String s,r1="",r2="";
		int r=0;
		s=JOptionPane.showInputDialog("Enter no = ");
		int a=Integer.parseInt(s);
		for(int i=1;i<=10;i=i+1)
		{
			
			r1=r1+"\n"+(i*a);
			r=r+i*a;
			
		}
		r2=r2+r;
		JOptionPane.showMessageDialog(null,r1+"\nTotal is = "+r2);
		
		
	}
}
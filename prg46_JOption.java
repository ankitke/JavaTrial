import javax.swing.JOptionPane;
class Input
{
	public static void main(String ar[])
	{
		int n[],r=0,k=0;
		String r1="";
		String r2="";

		String n1=JOptionPane.showInputDialog("Enter length = ");
		int v=Integer.parseInt(n1);
		n=new int[v];

		for(int i=0;i<v;i=i+1)
		{
			n[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter no = "));
		}

		for(int j=0;j<v;j=j+1)
		{
			r2=r2+" \n "+n[j];
			
		}
		JOptionPane.showMessageDialog(null,r2);	
		
	}
}
		
		
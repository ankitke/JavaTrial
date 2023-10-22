import javax.swing.JOptionPane;
class MyCl
{
	public static void main(String arg[])
	{
		String n,d=" ";
		int n1,i=0,j=0;
		n=JOptionPane.showInputDialog("Enter Array length");
		n1=Integer.parseInt(n);
		
		int arr[]=new int[n1];
		for(i=0; i<n1; i=i+1)
		{
			String s=JOptionPane.showInputDialog("Enter no");
			arr[i]=Integer.parseInt(s);
		}
		for(j=0; j<n1;j=j+1)
		{
			d=d+arr[j];
		}
		JOptionPane.showMessageDialog(null,"Your Entered no is"+" "+d);
		int index=-1, v=0;
		String x=JOptionPane.showInputDialog("Enter no for print index");
		int x1=Integer.parseInt(x);
		for(int k=0; k<arr.length; k=k+1)
		{
			if(arr[k]==x1)
			{
				index=k;
				v=arr[k];
			}
		}
		JOptionPane.showMessageDialog(null,"Your Index is = "+index);
		JOptionPane.showMessageDialog(null,"Your value is = "+v);
	}
}
			
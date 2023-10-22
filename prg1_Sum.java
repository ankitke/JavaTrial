import javax.swing.JOptionPane;
class MyCl
{
	public static void main(String []arg)
	{
		int a,b,r;
		String s1,s2;
		s1=JOptionPane.showInputDialog("Enter No");
		s2=JOptionPane.showInputDialog("Enter No");
		
		a=Integer.parseInt(s1);
		b=Integer.parseInt(s2);
		r=a+b;
		JOptionPane.showMessageDialog(null,"Sum of "+a+"and "+b+"is: "+r);
		//System.out.println("Sum of "+a+"and "+b+"is: "+r);
		System.out.println("Hello");
		
	}
}
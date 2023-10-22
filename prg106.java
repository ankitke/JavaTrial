class MyCl
{
	static void reverseList(ArrayList<Integer> list)
	{
		int i=0, j=list.length.size()-1;
		while(i<j)
		{
			Integer temp = Integer.valueOf(list.get(i));
			list.set(i, list.get(j));
			list.set(j, temp);
			i++;
			j++;
		}
	}
	public static void main(String arg[])
	{
		ArrayList<Integer> list= new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(3);
		list.add(5);
		list.add(22);
		list.add(10);
		System.out.println("Original List" +list);
		reverseList(list);
		System.out.println("Reverse List" +list);
	}
}
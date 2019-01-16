public class sjf
{
	private int[] p;
	private int tq;
	private int index;
	private int start;
	
	public sjf(int index, int start)
	{
		index--;
		p = new int[index+1];
		ArrayDefaultData();
		setindex(index);
		setstart(start);
	}
	
	public void ArrayDefaultData()
	{
		for( int i = 0 ; i <= getindex()-2 ; i++ )
		{
			setp(i,0);
		}
	}
	
	public int WaitingTimeAvg()
	{
		int sum = getstart();
		for( int i = 1 ; i <= getindex()-1 ; i++ )
		{
			sum += sum + getp(i);
		}
		return sum / getindex();
	}
	
	public void Sort()
	{
		int tmp;
		for(int i = getindex()-1 ; i >= 0 ; i--)
		{
			for(int j=0 ; j <= i ; j++)
			{
				if(getp(j) > getp(j+1))
				{
					tmp = getp(j);
					setp(j, getp(j+1));
					setp(j+1, tmp);
				}
			}
		}
	}
	
	public void setstart(int start)
	{
		this.start = start;
	}
	public int getstart()
	{
		return start;
	}
	public void setp(int index, int p)
	{
		this.p[index] = p;
	}
	public int getp(int index)
	{
		return p[index];
	}
	public void setindex(int index)
	{
		this.index = index;
	}
	public int getindex()
	{
		return index;
	}
}
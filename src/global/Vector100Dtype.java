package global;


//Modified By JInxuan Wu & Zhuwei 7:44:21 PM Feb 24, 2014
//end Modified
public class Vector100Dtype
{
	private int [] vector;
	
	public Vector100Dtype(int [] srcArray)
	{
		System.arraycopy(srcArray, 0, vector, 0, 100);
	}
	
	public void setVector100D(int [] srcArray)
	{
		System.arraycopy(srcArray, 0, vector, 0, 100);
	}
	
	public int []getVector100D()
	{
		return vector;
	}
}

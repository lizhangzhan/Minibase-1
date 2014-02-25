package global;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;


//Modified By JInxuan Wu & Zhuwei 7:44:21 PM Feb 24, 2014
//end Modified
public class Vector100Dtype
{
	private int [] vector;
	
	public Vector100Dtype()
	{
		for(int i=0;i<100;i++)
		{
			vector[i] = 0;
		}
	}
	public Vector100Dtype(int [] srcArray)
	{
		System.arraycopy(srcArray, 0, vector, 0, 100);
	}
	
	public Vector100Dtype(byte[] srcArray)
	{
		IntBuffer inBuf = ByteBuffer.wrap(srcArray).asIntBuffer();
		inBuf.get(vector);
	}
	
	public void setVector100D(int [] srcArray)
	{
		System.arraycopy(srcArray, 0, vector, 0, 100);
	}
	
	public int []getVector100D()
	{
		return vector;
	}
	public byte[] getByteVector100D()
	{
		ByteBuffer byteBuffer = ByteBuffer.allocate(400);
		IntBuffer intBuffer = byteBuffer.asIntBuffer();
		intBuffer.put(vector);
		return byteBuffer.array();
		
	}
}

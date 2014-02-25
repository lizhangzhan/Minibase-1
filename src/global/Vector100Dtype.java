package global;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;


//Modified By JInxuan Wu & Zhuwei 7:44:21 PM Feb 24, 2014
//end Modified
public class Vector100Dtype
{
	private int [] vector = new int[100];
	
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
	public static int getDistance(Vector100Dtype v1, Vector100Dtype v2)
	{
		int d1 [] = v1.getVector100D();
		int d2 [] = v2.getVector100D();
		double s = 0;
		int distance = 0;
		for(int i = 0;i< 100;i++){
			s += Math.pow(d1[i]-d2[i],2);
		}
		distance = (int)Math.sqrt(s);
		return distance;
	}
}

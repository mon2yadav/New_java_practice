package string_explanation;

public class String_buffer_builder_performance {

	public static void getdata()
	{
		StringBuilder sb=new StringBuilder("testdemo");
		long starttime=System.currentTimeMillis();
		for(int i=0; i<=1000000; i++)
		{
			sb.append("java");
		}
		long endtime=System.currentTimeMillis();
		System.out.println(" Time taken by builder "+(endtime-starttime)+" ms");
		StringBuffer sf=new StringBuffer("");
		 starttime=System.currentTimeMillis();
		for(int i=0; i<=1000000; i++)
		{
			sf.append("java");
		}
		endtime=System.currentTimeMillis();
		System.out.println(" Time taken by buffer "+(endtime-starttime)+" ms");
	}
	
	public static void main(String[] args) {
		getdata();
	}
}

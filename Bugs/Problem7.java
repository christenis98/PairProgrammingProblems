package codes;

public class Problem7 {

	public static void main(String[] args) {
		
		
		@Override
		public void putToCache(PutRecordsRequest putRecordsRequest)
		{
		  .... 
		  if (dataTmpFile == null || !dataTmpFile.exists())
		  {
		    try
		    {
		      dataTmpFile.createNewFile();  // Al hacer dataTmpFile == null en vez de != null , al probar este metodo, dara NullPointerException.
		    }
		    catch (IOException e)
		    {
		      LOGGER.error("Failed to create cache tmp file, return.", e);
		      return;
		    }
		  }
		  ....
		}
	}

}

package com.koushik.Assignment26;

public class TestPersistance 
{
	public static void main(String[] args)
	{
		Persistance p = new FilePersistance();
		Persistance p2 = new DataPersistance();
		p.persist();
		p2.persist();
		
		
	}

}

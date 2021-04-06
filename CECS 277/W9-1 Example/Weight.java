public class Weight 
{
	void WeightCheck(int weight) throws OverWeight   
	{ 
		if (weight > 150)
		{ 
			throw new OverWeight(); 
		}
	}
}

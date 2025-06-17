package basics;

public class SpecailCharacterOrNot {
	public static void main(String [] args)
	{
				char value = 'a';
				if(value>='a' && value<='z' || value>='A' && value<='Z')
					System.out.println("it is not a special character");
				else
					System.out.println("it is a special charcter");
				String man = (value>='a' && value<='z' || value>='A' && value<='Z') ? "it is not a specail charcter":"it is a specail charcter";
				System.out.println(man);
				
			}

		}

	


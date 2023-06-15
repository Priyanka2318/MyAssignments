package week3.day2;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count =0;
		String[] split = text.split(" ");

		for(int i=0;i<split.length;i++) 
		{
			for(int j=i+1;j<split.length;j++) 
			{
				if(split[i].equalsIgnoreCase(split[j])) 
				{
					split[j]="a";
					count++;
				}
			}
		}
			if(count>0) {
				for(int k=0;k<split.length;k++) {
					System.out.print(split[k]+ " ");
				}
		}
	}

}


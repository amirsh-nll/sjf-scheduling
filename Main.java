import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter NumberNo : ");
		int index = Integer.parseInt(scan.next());
		System.out.print("Please Enter StartTime : ");
		int start = Integer.parseInt(scan.next());
		sjf p = new sjf(index+1, start);
		
		for ( int i = 0 ; i <= index-1 ; i++ )
		{
			System.out.print("Please ProgramBursting_ " + i + " : ");
			p.setp(i, Integer.parseInt(scan.next()));
		}
		
		p.Sort();
		
		System.out.println(p.WaitingTimeAvg());
	}
}
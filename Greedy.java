import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Greedy {

	public static void main(String args[]) {
		Interval[] in=new Interval[6];
		
		 in[0]=new Interval(1,2);
		 in[1]=new Interval(3,4);
		 in[2]=new Interval(0,6);
		 in[3]=new Interval(5,7);
		 in[4]=new Interval(8,9);
		 in[5]=new Interval(5,9);
		
		 meetingschedule(in);
		 
		
	}

	private static void meetingschedule(Interval[] in) {
		// TODO Auto-generated method stub
		
		Arrays.sort(in, new Comparator<Interval>() {
			public int compare(Interval i1,Interval i2) {
				if(i1.ftime<i2.ftime) {
				return i1.ftime;	
				}
				return i2.ftime;
			}
		});
		int count=1;
		Queue<Integer> q=new LinkedList<>();
		q.add(in[0].ftime);
		for(int i=1;i<in.length;i++) {
			int x=q.peek();
			if(in[i].stime>=x) {
				q.add(in[i].ftime);
				q.poll();
				count++;
			}
		}
		
		System.out.println(count);
	}
}


class Interval{
	int stime,ftime;

	public Interval(int stime, int ftime) {
		super();
		this.stime = stime;
		this.ftime = ftime;
	}
	
	
}
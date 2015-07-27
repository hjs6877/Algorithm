package kr.ac.korea.topcoder.easy;

/**
 * 75.04 points obtained
 * 
 * 1. 각 도시의 좌표간 거리가 가장 짧은 station을 구한다.(도시 대 도시로 터널을 연결했을때, 가장 짧은 거리)
 * 2. 2개의 터널로 연결되는 터널간 거리의 합이 가장 짧은 경우의 거리를 구한다.
 * @author hjs6877
 *
 */
public class ATaleOfThreeCities {
	public double connect(int[] ax, int[] ay, int[] bx, int[] by, int[] cx, int[] cy){
		
		double abMin = this.min(ax, ay, bx, by);
		double acMin = this.min(ax, ay, cx, cy);
		double bcMin = this.min(bx, by, cx, cy);
		
		
		double v1 = abMin + acMin;
		double v2 = abMin + bcMin;
		double v3 = acMin + bcMin;
		
		double finalMin = v1 < v2 ? (v1 < v3 ? v1 : v3) : (v2 < v3 ? v2 : v3);
		return finalMin;
	}
	
	private double min(int[] ax, int[] ay, int[] bx, int[] by){
		double abMin = 0L;
		for(int i=0; i < ax.length; i++){
			for(int j=0; j < bx.length; j++){
				int a = Math.abs(ax[i]-bx[j]);
				int b = Math.abs(ay[i]-by[j]);
				
				/**
				 * x가 같을경우 y값의 차, y가 같을 경우 x값의 차가 distance가 되고,
				 * x,y 가 모두 다를 경우, x,y에 대한 대각선의 길이가 distance가 된다.
				 */
				double dist = ax[i] == bx[j] ? Math.abs(ay[i]-by[j]) : (ay[i] == by[j] ? Math.abs(ax[i]-bx[j]) : Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))); 
					
				
				if((i==0) && (j==0)){
					abMin = dist;
				}else{
					if(dist < abMin){
						abMin = dist;
					}
				}
			}
		}
		return abMin;
	}
}

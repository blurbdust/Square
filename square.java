package magicsquare;

public class square {
	public static void main (String[] args){
		long limit = (long) (9.223372036854775807 * Math.pow(10, 18));
		long a, b, c, d, e, f, g, h, i, sum, a2, b2, c2, d2, e2, f2, g2, h2, i2;
		for (a = 0; a<limit; a++){
			for (b = 0; b<limit;b++){
				for (c=0;c<limit;c++){
					for (d=0;d<limit;d++){
						for (e=0;e<limit;e++){
							for (f=0;f<limit;f++){
								for (g=0;g<limit;g++){
									for (h=0;h<limit;h++){
										for (i=0;i<limit;i++){
											a2 = (long) (Math.pow(a, 2));
											b2 = (long) (Math.pow(b, 2));
											c2 = (long) (Math.pow(c, 2));
											d2 = (long) (Math.pow(d, 2));
											e2 = (long) (Math.pow(e, 2));
											f2 = (long) (Math.pow(f, 2));
											g2 = (long) (Math.pow(g, 2));
											h2 = (long) (Math.pow(h, 2));
											i2 = (long) (Math.pow(i, 2));
											sum = a2 + b2 + c2;
											if ((!checkEquals(a2,b2,c2,d2,e2,f2,g2,h2,i2)) && (d2 + e2 + f2) == sum && 
													(g2 + h2 + i2) == sum && 
															(a2 + d2 + g2) == sum &&
																	(b2 + e2 + h2) == sum && 
																		(c2 + f2 + i2) == sum &&
																			(a2 + e2 + i2) == sum &&
																				(g2 + e2 + c2) == sum){
																					System.out.println("Winner: " + a2 + ", " + b2 + ", " + c2 + ", " + d2 + ", " + e2 + ", " + f2 + ", " + g2 + ", " + h2 + ", " + i2);
																					break;
																					
											}
											else {
												System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + g + ", " + h + ", " + i);
											}
										}
									}
								}
							}
						}
					}
				}
			}	
		}
		
		//outside for loops
		
	}
	public static boolean checkEquals(long a2, long b2, long c2, long d2, long e2, long f2, long g2, long h2, long i2){
		if (((a2 == b2) || (a2 == c2) || (a2 == d2) || (a2 == e2) || (f2 == g2) || (a2 == h2) || (a2 == i2)) &&
				(b2 == c2) || (b2 == d2) || (b2 == e2) || (b2 == f2) || (b2 == g2) || (b2 == h2) || (b2 == i2) &&
					(c2 == d2) || (c2 == e2) || (c2 == f2) || (c2 == g2) || (c2 == h2) || (c2 == i2) &&
						(d2 == e2) || (d2 == f2) || (d2 == g2) || (d2 == h2) || (d2 == i2) &&
							(e2 == f2) || (e2 == g2) || (e2 == h2) || (e2 == i2) &&
								(f2 == g2) || (f2 == h2) || (f2 == i2) &&
									(g2 == h2) || (g2 == i2) &&
										(h2 == i2)){
											return true;
		}
		else {
			//wow really?
			return false;
		}
	}
}

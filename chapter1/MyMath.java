package chapter1;

public class MyMath {

public int add2(int a, int b) {
	return a+b;
}
public double max (double a, double b) {
	double result;
	if (a>=b) {
		result = a;
	} else
	{result = b;
	}
	return result;
}

public double sqrt (double x) {	
	double low= 0;
	double mid = 0;
	double high = x;
	while (high - low > 1e-12) {
		mid = 0.5 * (low + high);
		if (mid * mid > x) {
			high = mid;
		} else {low = mid;}
	} return mid;
}

public double factorial (int n) {
	double fct = 1;
	for (int i=2; i<=n; i++) {
		fct = fct * i;
	}
	return fct;
}
}


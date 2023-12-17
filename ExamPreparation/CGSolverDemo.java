package ExamPreparation;

public class CGSolverDemo {
public static void main (String [] args) {
		
Matrix M = new Matrix (6,6 , 3.4430, -0.3963,  2.5012,  0.9525,  0.6084, -1.2728, 
						-0.3963,  0.6015, -0.4108, -0.1359, -0.0295,  0.2630,
						2.5012, -0.4108,  2.5927,  0.7072,  0.5587, -1.0613,
						0.9525, -0.1359,  0.7072,  1.1634,  0.1920, -0.4344,
						0.6084, -0.0295,  0.5587,  0.1920,  0.7636, -0.3261,
						-1.2728,  0.2630, -1.0613, -0.4344, -0.3261,  1.0869) ;

Vector b = new Vector (3.0685,  0.0484,  2.5783,  1.2865,  0.8671, -0.8230);
M.print("Matrica M");
b.print("b");
CGSolver A = new CGSolver(M);
Vector l = A.solveCG(b);
	}
}

#include <stdio.h> 
#include <math.h> 
#include <iostream> 

using namespace std;

double lambda = 1.0; 
double y = 0.0; 
FILE *fp1 = NULL;       // Data File  
FILE *fp2 = NULL;       // Plotting File    

// Finds the factorial of a given number  
int factorial(int n)
{ 
	return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
}

// Poisson PDF (Linear) Plot 
int poissonPDFLinear() 
{  
	fp1 = fopen ("Poisson PDF (Linear) Data.tmp", "w"); 
	fp2 = fopen ("Poisson PDF (Linear) Plot.plt", "w"); 

	// For Loop to print the Plotting Data into a .tmp File 
	for (int x = 0; x < 11; x++)
	{ 
		y = exp(- lambda) * pow(lambda, x) / factorial(x);  
		fprintf(fp1, "%i %f\n", x, y); 
	}

	// Prints the code into a .plt File    
	fprintf(fp2, "#!/usr/bin/gnuplot -persist           \
	\nset style circle radius 0.05                      \
	\nset style fill transparent solid 1.0 noborder     \
	\nset xtics 0, 1, 10                                \
	\nset title 'Poisson PDF (Linear) PLot'             \
	\nset xlabel 'Number of Occurrences'                \
	\nset ylabel 'Probability Density'                  \
	\nset grid                                          \
	\nplot 'Poisson PDF (Linear) Data.tmp' with circles lc rgb 'blue'"); 

	return 0; 
}

// Poisson PDF (Log) Plot 
int poissonPDFLog() 
{ 
	fp1 = fopen ("Poisson PDF (Log) Data.tmp", "w"); 
	fp2 = fopen ("Poisson PDF (Log) Plot.plt", "w");    

	// For Loop to print the Plotting Data into a .tmp File  
	for (int x = 0; x < 11; x++)
	{ 
		y = exp(- lambda + x * (log(lambda) / log(exp(1))) - (log(factorial(x)) / log(exp(1)))); 
		fprintf(fp1, "%i %e\n", x, y); 
	}

	// Prints the code into a .plt File     
	fprintf(fp2, "#!/usr/bin/gnuplot -persist                              \
	\nset style circle radius 0.05                                         \
	\nset style fill transparent solid 1.0 noborder                        \
	\nset logscale y                                                       \
	\nset xtics 0, 1, 10                                                   \
	\nset ytics (10e-8, 10e-7, 10e-6, 10e-5, 10e-4, 10e-3, 10e-2, 10e-1)   \
	\nset title 'Poisson PDF (Log) Plot'                                   \
	\nset xlabel 'Number of Occurrences'                                   \
	\nset ylabel 'Probability Density'                                     \
	\nset grid                                                             \
	\nplot 'Poisson PDF (Log) Data.tmp' with circles lc rgb 'blue'"); 

	return 0; 
}

// Poisson CDF (Linear) Plot 
int poissonCDFLinear() 
{ 
	fp1 = fopen ("Poisson CDF (Linear) Data.tmp", "w"); 
	fp2 = fopen ("Poisson CDF (Linear) Plot.plt", "w");   
	
	// Setting initial points to plot the Step Function correctly 
	fprintf(fp1, "%i %f\n", - 1, 0.0);
	fprintf(fp1, "%i %f\n", 0, 0.0);

	// For Loop to print the Plotting Data into a .tmp File  
	for (int x = 0; x < 11; x++)
	{ 
		y += exp(- lambda) * pow(lambda, x) / factorial(x);  
		fprintf(fp1, "%i %f\n", x, y); 
	}

	// Prints the code into a .plt File    
	fprintf(fp2, "#!/usr/bin/gnuplot -persist    \
	\nset xtics 0, 1, 10                         \
	\nset ytics 0.0, 0.1, 1.0                    \
	\nset title 'Poisson CDF (Linear) Plot'      \
	\nset xlabel 'Number of Occurrences'         \
	\nset ylabel 'Probability'                   \
	\nset grid                                   \
	\nplot 'Poisson CDF (Linear) Data.tmp' with steps");  

	return 0;   
}

// Poisson CDF (Log) Plot 
int poissonCDFLog() 
{ 
	fp1 = fopen ("Poisson CDF (Log) Data.tmp", "w"); 
	fp2 = fopen ("Poisson CDF (Log) Plot.plt", "w");   

	// Setting initial points to plot the Step Function correctly 
	fprintf(fp1, "%i %f\n", - 1, 0.0);
	fprintf(fp1, "%i %f\n", 0, 0.0);

	// For Loop to print the Plotting Data into a .tmp File  
	for (int x = 0; x < 11; x++)
	{ 
		y += exp(- lambda + x * (log(lambda) / log(exp(1))) - (log(factorial(x)) / log(exp(1)))); 
		fprintf(fp1, "%i %e\n", x, y - 1); 
	}

	// Prints the code into a .plt File     
	fprintf(fp2, "#!/usr/bin/gnuplot -persist    \
	\nset logscale y                             \
	\nset xtics 0, 1, 10                         \
	\nset ytics 0.0, 0.1, 1.0                    \
	\nset title 'Poisson CDF (Log) Plot'         \
	\nset xlabel 'Number of Occurrences'         \
	\nset ylabel 'Probability'                   \
	\nset grid                                   \
	\nplot 'Poisson CDF (Log) Data.tmp' with steps");           

	return 0; 
}

// Main Method   
int main() 
{
	poissonPDFLinear(); 
	poissonPDFLog(); 
	poissonCDFLinear(); 
	poissonCDFLog(); 
}


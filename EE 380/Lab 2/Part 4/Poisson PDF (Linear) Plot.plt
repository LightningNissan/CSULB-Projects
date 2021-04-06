#!/usr/bin/gnuplot -persist           	
set style circle radius 0.05                      	
set style fill transparent solid 1.0 noborder     	
set xtics 0, 1, 10                                	
set title 'Poisson PDF (Linear) PLot'             	
set xlabel 'Number of Occurrences'                	
set ylabel 'Probability Density'                  	
set grid                                          	
plot 'Poisson PDF (Linear) Data.tmp' with circles lc rgb 'blue'
#!/usr/bin/gnuplot -persist                              	
set style circle radius 0.05                                         	
set style fill transparent solid 1.0 noborder                        	
set logscale y                                                       	
set xtics 0, 1, 10                                                   	
set ytics (10e-8, 10e-7, 10e-6, 10e-5, 10e-4, 10e-3, 10e-2, 10e-1)   	
set title 'Poisson PDF (Log) Plot'                                   	
set xlabel 'Number of Occurrences'                                   	
set ylabel 'Probability Density'                                     	
set grid                                                             	
plot 'Poisson PDF (Log) Data.tmp' with circles lc rgb 'blue'
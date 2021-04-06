#!/usr/bin/gnuplot -persist    	
set logscale y                             	
set xtics 0, 1, 10                         	
set ytics 0.0, 0.1, 1.0                    	
set title 'Poisson CDF (Log) Plot'         	
set xlabel 'Number of Occurrences'         	
set ylabel 'Probability'                   	
set grid                                   	
plot 'Poisson CDF (Log) Data.tmp' with steps
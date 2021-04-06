lambda = 1.0;   
x = (0 : 1 : 10); 
y1 = poisspdf(x, lambda);  
y2 = poisscdf(x, lambda); 

% Poisson PDF (Linear) Plot  
figure (1) 
scatter(x, y1)  
xticks(x); 
grid on 
axis padded 
title("Poisson PDF (Linear) Plot")
xlabel("Number of Occurrences") 
ylabel("Probability Density") 

% Poisson PDF (Log) Plot  
figure (2) 
scatter(x, y1)
set(gca, "yscale", "log");  
xticks(x);
yticks([10.^-7 10.^-6 10.^-5 10.^-4 10.^-3 10.^-2 10.^-1 10.^0]); 
grid on 
axis padded 
title("Poisson PDF (Log) Plot")
xlabel("Number of Occurrences") 
ylabel("Probability Density") 

% Poisson CDF (Linear) Plot 
figure (3) 
stairs(x, y2)  
xticks(x); 
grid on 
axis padded 
title("Poisson CDF (Linear) Plot")
xlabel("Number of Occurrences") 
ylabel("Probability")    

% Poisson CDF (Log) Plot   
figure (4) 
stairs(x, y2)
set(gca, "yscale", "log");  
xticks(x);
grid on  
axis padded   
title("Poisson CDF (Log) Plot")
xlabel("Number of Occurrences") 
ylabel("Probability")     










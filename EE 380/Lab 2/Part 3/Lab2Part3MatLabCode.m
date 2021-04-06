n = 100;    
p = 0.01;  
lambda = 1.0;   
x = (0 : 1 : 10);   
y1 = binopdf(x, n, p); 
y2 = binocdf(x, n, p); 
y3 = poisspdf(x, lambda);  
y4 = poisscdf(x, lambda); 

% Binomial PDF Plot    
figure(1)  
scatter(x, y1); 
xticks(x);
grid on 
axis padded 
title("Binomial PDF Plot")
xlabel("Number of Trials") 
ylabel("Probability Density")

% Binomial CDF Plot    
figure(2) 
stairs(x, y2); 
xticks(x); 
grid on 
axis padded 
title("Binomial CDF Plot")
xlabel("Number of Trials") 
ylabel("Probability")

% Poisson PDF Plot    
figure (3) 
scatter(x, y3); 
xticks(x);
grid on 
axis padded 
title("Poisson PDF Plot")
xlabel("Number of Occurences") 
ylabel("Probability Density") 

% Poisson CDF Plot    
figure (4) 
stairs(x, y4);  
xticks(x)
grid on 
axis padded 
title("Poisson CDF Plot")
xlabel("Number of Occurrences") 
ylabel("Probability")  

% Poisson + Binomial PDF Plot    
figure(5)
scatter(x, y1) 
hold on 
scatter(x, y3) 
xticks(x);
grid on 
axis padded 
title("Poisson + Binomial PDF Plot")
xlabel("Number of Trials / Occurrences") 
ylabel("Probability Density")
legend("Binomial PDF", "Poisson PDF")

% Poisson + Binomial CDF Plot    
figure(6)
stairs(x, y2) 
hold on 
stairs(x, y4)  
xticks(x);
grid on 
axis padded 
title("Poisson + Binomial CDF Plot")
xlabel("Number of Trials / Occurrences") 
ylabel("Probability")
legend("Binomial CDF", "Poisson CDF", "Location", "southeast") 
 
 

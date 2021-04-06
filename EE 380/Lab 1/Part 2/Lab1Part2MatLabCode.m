n = 100;    
p = 0.5;  
mean = 50;  
sd = 5; 
all_x_values = (0 : 100); 
x_axis = (35 : 65); 

disp("Binomial PDF")
disp(binopdf(all_x_values, n, p))  
disp("Normal PDF") 
disp(normpdf(all_x_values, mean, sd))  

scatter(x_axis, binopdf(x_axis, n, p));  
hold on 
plot(x_axis, normpdf(x_axis, mean, sd));      

title("Normal Distribution + Binomial Distribution Plot of Coin Flips")
xlabel("Number of Coin Flips") 
ylabel("Probability Density") 

yticks(0 : 0.02 : 0.1);  
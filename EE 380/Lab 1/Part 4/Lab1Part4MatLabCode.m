n = 100;    
p = 0.5;  
mean = 50;  
sd = 5; 
all_x_values = (0 : 100); 
x_axis = (35 : 65); 

disp("Binomial CDF")
disp(binocdf(all_x_values, n, p))  
disp("Normal CDF") 
disp(normcdf(all_x_values, mean, sd)) 

stairs(x_axis, binocdf(x_axis, n, p)); 
hold on 
plot(x_axis, normcdf(x_axis, mean, sd));    

title("Normal Distribution + Binomial Distribution Plot of Coin Flips")
xlabel("Number of Coin Flips") 
ylabel("Probability")     
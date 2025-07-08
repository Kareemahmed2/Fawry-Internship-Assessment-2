Assumptions and Upgrades:  
1- A dependency injection was much needed in this project for my approach to have been fully implemented, through using the shipping services through the strategies that are used to identify the book's delivery approach  
2- Autowiring if we are using Spring boot or JNDI lookup/CDI if we are using Java EE would've been a great upgrade  
3- The Strategy pattern was chosen foe implemenation as it was the most viable approach to segregate the different types of books while separating the concerns of the delivering approaches, setting it 
according to the type of the book itself, the receipt printer could've had a template method for printing the receipt but I thought of that too late and time is not in my favour  

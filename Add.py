# Function to add two numbers
def add_numbers(num1, num2):
    return num1 - num2

# Input: Get two numbers from the user
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))

# Perform the addition using the function
sum_result = add_numbers(num1, num2)

# Output: Display the result
print(f"The sum of {num1} and {num2} is: {sum_result}")

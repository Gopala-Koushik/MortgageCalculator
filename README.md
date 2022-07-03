## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## Aim 
    To create a Mortgage calculator which takes principle amount, interest rate, repayment period in years and number of installments in a year to calculate the monthly installments, Total interest paid and payment schedule using abstraction and encapsulation concepts of object oriented programming.

## Mortgage Calculator
    Mortgage calculators are used by consumers to determine monthly repayments, and by mortgage providers to determine the financial suitability of a loan applicant.

## Monthly installment 
    The monthly installment(c) depends on the principle amount(p), interest rate(r) and number of installments(N);
    Hence,
            c = [p*r*(1+r)^N] / [(1+r)^N - 1]

## Total Interest Paid
    The total interest to be paid(I) depends on the principle amount(p), monthly installment(c), number of installment(N);
    Hence,
            I = c*N - P

## Payment Schedule
    The balance principle amount left is calculated by subtracting the amount of mortgage paid till the current month from the total mortgage amount to be paid.
    Hence,
            balance = [p*(1+r)^N] / [(1+r)^N - 1] - [p*(1+r)^n] / [(1+r)^n - 1]    Where, n = number of installments paid
                                                                                          N = number of total installments

## Code
    Console.java class is used to take print prompt message and is programmed to run until the user enter a valid input.

    Calculator.java class has the implementation of mortgage calculator and all the methods are abstracted to reduce the coupling points in other class. Getter functions are implemented to get the results.

    MortgageReport.java class prints all calculated results from calculator.java class like monthly installments, Total interest paid and payment schedule on the console.

    App.java class has the main function which can be executed.
﻿# WorkshopOne_FinancialCalculators

Home Screen:
![Homescreen](https://github.com/alyu15/WorkshopOne_FinancialCalculators/assets/166542449/c4ee5782-cf17-453a-b938-3b3691eb8f08)

Mortgage Calculator:
![Mortgage](https://github.com/alyu15/WorkshopOne_FinancialCalculators/assets/166542449/6539f8a2-056a-482d-ae52-b3f7594fa2d7)

Future Value Calculator:
![DailyCompoundInterest](https://github.com/alyu15/WorkshopOne_FinancialCalculators/assets/166542449/8b4f97fb-9302-4a56-84d6-901abd54587e)

Present Value Calculator:
![PresentValue](https://github.com/alyu15/WorkshopOne_FinancialCalculators/assets/166542449/0bdb2148-86eb-4d75-9ae0-a25a2d459e43)

Error Message:
![Error](https://github.com/alyu15/WorkshopOne_FinancialCalculators/assets/166542449/4f1351b5-f272-45bb-bda8-5475e9006b47)

Interesting Piece of Code:

while (true) {
            System.out.println("Please select which calculator you would like to use:");
            System.out.println("Mortgage, Daily Compound Interest, or Present Value");
            String calculator = scanner.nextLine();

            if (calculator.equals("Mortgage")) {
                mortgageCalculator(scanner);
                break;
            } else if (calculator.equals("Daily Compound Interest")) {
                compoundCalculator(scanner);
                break;
            } else if (calculator.equals("Present Value")) {
                pvCalculator(scanner);
                break;
            } else {
                System.out.printf("%s is not recognized.\n",
                        calculator);
            }
        }
        
I found this piece of code interesting because it took me so long to try and figure out how to loop the user back in case they entered in something that was not one of the three choices. And when I finally did figure it out, I realized all I needed to do was add in a "while" and "break" conditional.

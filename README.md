# ATMInterface Project

## Project Overview
The **ATMInterface** is a Java-based application that simulates the core functionalities of an Automated Teller Machine (ATM). It allows users to securely manage their bank accounts by performing operations like deposits, withdrawals, fund transfers, and transaction history review. Designed using Object-Oriented Programming (OOP) principles, the project is modular, scalable, and easy to maintain.

## Features
- **User Authentication**:  
  Secure login using a unique **User ID** and **PIN**.  
- **Account Management**:  
  Supports multiple accounts per user with balance summaries.  
- **Transaction Handling**:  
  Includes deposits, withdrawals, and fund transfers between accounts with optional memos for added context.  
- **Transaction History**:  
  Displays detailed records of transactions, including type, amount, and notes.  
- **Error Handling**:  
  Provides clear feedback for invalid operations such as incorrect credentials or insufficient balances.

## How It Works
1. **Login**: Users authenticate with their credentials.
2. **Menu Navigation**: After login, users access features like viewing transaction history, depositing or withdrawing funds, and transferring money between accounts.
3. **Transaction Management**: Validates inputs, updates account balances, and logs transactions.
4. **Transaction History**: Allows users to review past activities for any account.

## Project Structure
The project is divided into the following classes:
- **ATM**: Handles the user interface and menu navigation.
- **Bank**: Manages user accounts, authentication, and transactions.
- **User**: Represents a bank customer with associated accounts.
- **Account**: Represents individual bank accounts with balances and transaction histories.
- **Transaction**: Represents individual transactions with details like type, amount, and memo.

## Technologies Used
- **Java**: Core programming language.
- **UUID**: Generates unique IDs for users and accounts.
- **Collections (ArrayList)**: Handles accounts and transactions dynamically.

## How to Run
1. Clone this repository:  
   ```bash
   git clone <repository-url>
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
3. Compile and run the `ATM.java` file.
4. Follow the on-screen instructions to explore the ATM system.
   
## Future Enhancements
- Integration with a database for persistent data storage.
- Graphical User Interface (GUI) for improved user experience.
- Support for additional banking operations, such as bill payments.

## License
This project is licensed under the MIT License. See the [LICENSE] file for more details.

.
   

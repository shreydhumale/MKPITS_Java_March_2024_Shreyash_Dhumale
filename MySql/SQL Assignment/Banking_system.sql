CREATE DATABASE BankingSystem;
USE BankingSystem;

CREATE TABLE SavingsAccounts (
    account_id INT PRIMARY KEY,
    account_type VARCHAR(20),
    balance DECIMAL(12, 2),
    customer_id INT
   
);

CREATE TABLE CurrentAccounts (
    account_id INT PRIMARY KEY,
    account_type VARCHAR(20),
    balance DECIMAL(12, 2),
    customer_id INT
    
);

CREATE TABLE Transactions (
    transaction_id INT PRIMARY KEY,
    transaction_type VARCHAR(20),
    amount DECIMAL(12, 2),
    transaction_date DATE,
    account_id INT
   
);

INSERT INTO CurrentAccounts (account_id, account_type, balance, customer_id)
VALUES
    (3, 'Current', 2000.00, 1),
    (4, 'Current', 3000.00, 2),
	(1, 'Current', 3000.00, 5),
    (5, 'Current', 1500.00, 3);

INSERT INTO Transactions (transaction_id, transaction_type, amount, transaction_date, account_id)
VALUES
    (1, 'Deposit', 500.00, '2023-01-01', 1),
    (2, 'Withdrawal', 200.00, '2023-01-05', 1),
    (3, 'Deposit', 1000.00, '2023-01-10', 2),
    (4, 'Transfer', 300.00, '2023-01-15', 2),
    (5, 'Withdrawal', 100.00, '2023-01-20', 3);
    
    select * from Transactions;
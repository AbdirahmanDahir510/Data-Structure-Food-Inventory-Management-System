# Food Inventory Management System

## Overview
The **Food Inventory Management System** is a Java-based application that efficiently tracks food items in inventory. The project is structured using **Object-Oriented Programming (OOP)** principles and leverages **Arrays** as the primary data structure for managing inventory data.

## Features
- Add, update, and delete food items from inventory
- Search for items by name or category
- Display inventory details in a structured format
- Implement error handling for invalid inputs

## Object-Oriented Programming (OOP) Concepts Used
### Encapsulation
- The system groups related data and methods into **classes**, restricting direct access to inventory attributes while providing controlled access through getter and setter methods.

### Inheritance
- The project follows an **inheritance hierarchy**, where a base `FoodItem` class is extended by specialized subclasses like `PerishableFood` and `NonPerishableFood`.

### Polymorphism
- Method **overriding** is used to provide different behaviors for `displayDetails()` in different food item classes.
- Method **overloading** allows different ways to add food items to inventory.

### Abstraction
- Abstract classes and interfaces are used to define common behavior while enforcing implementation in child classes.

## Data Structure Used
### Arrays
- The inventory is managed using **Arrays**, providing a simple and efficient way to store and retrieve food items.
- Searching and sorting operations are implemented to enhance data management.

## Installation
### Prerequisites
- Java Development Kit (JDK) 8+
- Git
- A Java IDE Eclipse

### Setup Steps
1. Clone the repository:
   ```sh
   git clone https://github.com/AbdirahmanDahir510/Data-Structure-Food-Inventory-Management-System.git
   ```
2. Navigate to the project directory:
   ```sh
   cd Data-Structure-Food-Inventory-Management-System
   ```
3. Compile and run the program:
   ```sh
   javac Main.java
   java Main
   ```

## How to Use
- Run the program and follow the prompts to manage food inventory.
- Use menu options to add, update, search, and display items.


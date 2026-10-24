# SDP Assignment: Strategy Design Pattern

## 1. Introduction

The purpose of this assignment is to implement the Strategy behavioral design pattern using Java.

The project demonstrates different ways of preparing cheremsha (wild garlic). The Strategy pattern allows the program to select and change the cooking algorithm at runtime without modifying the context class.

## 2. Project Description

The application supports three cooking methods:

- **FreshCheremshaStrategy** — prepares fresh cheremsha.
- **BoiledCheremshaStrategy** — prepares boiled cheremsha.
- **FriedCheremshaStrategy** — prepares fried cheremsha.

Each strategy implements the common `CookingStrategy` interface.

## 3. Project Structure

- `CookingStrategy.java` — defines the common `cook()` method.
- `FreshCheremshaStrategy.java` — implements the fresh preparation algorithm.
- `BoiledCheremshaStrategy.java` — implements the boiling algorithm.
- `FriedCheremshaStrategy.java` — implements the frying algorithm.
- `CheremshaCooker.java` — acts as the context and delegates cooking to the selected strategy.
- `Main.java` — demonstrates the use of the strategies and runtime switching.

## 4. Strategy Pattern Implementation

### Strategy Interface

The `CookingStrategy` interface declares the `cook()` method. All concrete strategies implement this interface.

### Concrete Strategies

Each concrete strategy contains its own cooking algorithm. The strategies are independent of each other and can be used interchangeably.

### Context

The `CheremshaCooker` class stores a reference to a `CookingStrategy` object. It provides the `setStrategy()` method to change the current strategy at runtime.

The context calls `strategy.cook()` without knowing the implementation details of the selected algorithm.

### Client

The `Main` class creates a `CheremshaCooker`, selects the fresh preparation strategy, and then switches to the boiled and fried strategies.

This demonstrates that the algorithm can be changed dynamically during program execution.

## 5. Clean Code Principles

### 1. Meaningful Names

Class and method names clearly describe their responsibilities. For example, `FriedCheremshaStrategy` identifies the frying algorithm.

### 2. Single Responsibility Principle

Each concrete strategy is responsible for only one cooking method. The context is responsible for delegating the cooking operation.

### 3. Polymorphism

All strategies implement the same interface. Java polymorphism allows the program to call `cook()` without checking the concrete strategy type.

### 4. Loose Coupling

The `CheremshaCooker` class depends on the `CookingStrategy` interface rather than concrete implementations. This reduces dependencies between classes.

### 5. Open/Closed Principle

A new cooking strategy can be added by implementing `CookingStrategy`. Existing strategy classes and the context do not need to be modified.

### 6. Encapsulation

Each strategy keeps its cooking algorithm inside its own class. The context does not need to know the internal steps of the algorithm.

## 6. Testing

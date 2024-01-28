# Book Management System

A simple Java application for managing a collection of books.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Usage](#usage)
- [Code Explanation](#code-explanation)
- [How to Contribute](#how-to-contribute)

## Introduction

This Java application provides a text-based user interface for managing a collection of books. Users can perform various actions, such as adding books, displaying books, updating book information, deleting books, and searching for books. It's a basic tool to organize and manage a library or book inventory.

## Features

- Add multiple books at once, including book name, author, and price.
- Display a list of all books in the collection.
- Update existing book information, including the ability to change the name, author, or price.
- Delete books from the collection.
- Search for books by name.
- User-friendly text-based menu interface.

## Usage

To use the Book Management System, follow these steps:

1. Clone the repository to your local machine:
https://github.com/fenazi22/BookShopBasic.git


2. Compile and run the Java program:

- cd book-management-system
- javac Main.java
- java Main
  
3. Follow the on-screen menu to interact with the program and manage your book collection.

## Code Explanation

The code is organized as follows:

- `Main.java`: The main program file containing the Java code.
- Three arrays are used to store book names, authors, and prices.
- The program presents a menu to the user with options for adding, displaying, updating, deleting, and searching for books.
- User input is obtained using the Scanner class.
- The program maintains an index to keep track of the last added book.

## How to Contribute

If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your changes: `git checkout -b feature/new-feature`.
3. Make your changes and commit them: `git commit -m 'Add a new feature'`.
4. Push your changes to your fork: `git push origin feature/new-feature`.
5. Create a pull request to merge your changes into the main repository.

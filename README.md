# Inventory Management System

## Project Overview

A console-based inventory management system developed in Java to help small businesses manage their product stock efficiently. The system provides core inventory operations like adding products, tracking stock levels, generating reports, and managing product data.

## Features

- **Product Management**: Add, view, update, and delete products
- **Stock Tracking**: Real-time quantity updates and low stock alerts
- **Search Functionality**: Search products by unique ID
- **Report Generation**: Inventory statistics and value calculations
- **Data Analysis**: Identify most expensive products and low stock items

## Technologies/Tools Used

- Java (JDK 8 or higher)
- ArrayList for data storage
- Scanner for console input
- Object-Oriented Programming concepts

## Installation & Setup

1. **Prerequisites**: Ensure Java JDK is installed on your system
```bash
   java -version
```

2. **Clone the repository**:
```bash
   git clone <your-repo-url>
   cd inventory-management-system
```

3. **Compile the project**:
```bash
   javac *.java
```

4. **Run the application**:
```bash
   java Main
```

## How to Use

1. Launch the application
2. Select options from the menu (1-9)
3. Follow on-screen prompts to:
   - Add new products
   - View inventory
   - Update stock quantities
   - Delete products
   - Search for specific items
   - Check low stock alerts
   - Generate reports

## Project Structure
```
inventory-management-system/
├── src/
│   ├── Product.java       # Product entity class
│   ├── Inventory.java     # Core inventory operations
│   ├── Report.java        # Reporting and analytics
│   └── Main.java          # Entry point with menu
├── docs/
│   ├── statement.md       # Problem statement
│   └── diagrams/          # UML diagrams
├── README.md
└── .gitignore
```

## Testing Instructions

1. **Add Product Test**: Add 3-5 sample products
2. **Update Test**: Modify quantities of existing products
3. **Delete Test**: Remove a product and verify
4. **Search Test**: Search by valid and invalid IDs
5. **Report Test**: Generate reports with multiple products
6. **Low Stock Test**: Create products with qty < 5 and verify alerts

## Screenshots

### Main Menu
```
===== INVENTORY MANAGEMENT SYSTEM =====

--- MENU ---
1. Add Product
2. View All Products
3. Update Quantity
4. Delete Product
5. Search Product
6. Low Stock Alert
7. Generate Report
8. Show Expensive Products
9. Exit
```

### Sample Report Output
```
========== INVENTORY REPORT ==========
Total Products: 5
Total Inventory Value: $2450.0
Total Items in Stock: 87
Low Stock Products: 2
======================================
```

## Contributors

[Mokshit pawar] - [24BSA10021]

## License

This project is developed as part of academic coursework at VIT.

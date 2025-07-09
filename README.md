# 📚 Bookstore System

## Table Of Content
- [Overview](#overview)
- [Features](#features)
- [The Sample Data stored](#the-sample-data-stored)
- [How to Use](#how-to-use)
- [Example Output](#example-output)





## Overview

Quantum Bookstore is an online platform that allows you to manage and purchase books of different types:

1. **Paper Books** – Physical books with stock available for purchase and shipment.
2. **EBooks** – Digital books that can be downloaded and delivered via email.
3. **Demo Books** – Books available for showcase but not for sale.

## Features

- **Add Books**: Add books with attributes like ISBN, title, price, publication year, and author.
- **Remove Outdated Books**: Remove books that are older than 10 years from the inventory.
- **Buy Books**:
    - Purchase PaperBooks, which reduces stock and calculates shipping costs.
    - Send EBooks via email to customers.
    - Display a message for DemoBooks (they are not for sale).
- **Shipping and Email Services**:
    - Calculate shipping costs for PaperBooks based on weight.
    - Send EBooks to a provided email address.
## The Sample Data stored
### 📚 📦 Paper Books
   | ISBN  | Title           | Price | Year | Quantity | Shipping | Weight |
| ----- | --------------- | ----- | ---- | -------- | -------- | ------ |
| PB001 | Clean Code      | 350.0 | 2008 | 50       | ✅ Yes    | 3.0 kg |
| PB002 | Effective Java  | 420.5 | 2018 | 20       | ✅ Yes    | 0.5 kg |
| PB003 | Design Patterns | 150.0 | 1994 | 35       | ❌ No     | 0.0 kg |

### 📚 💻 E-Books
| ISBN | Title                      | Price | Year | File Type |
| ----- | -------------------------- | ----- | ---- | --------- |
| EB001 | Python Crash Course        | 200.0 | 2019 | PDF       |
| EB002 | The Pragmatic Programmer   | 55.5  | 1999 | EPUB      |
| EB003 | JavaScript: The Good Parts | 75.0  | 2008 | MOBI      |

### 📚 🎧 Demo Books
| Code  | Title                      | Price | Year |
| ----- | -------------------------- | ----- | ---- |
| DB001 | Python Crash Course        | 200.0 | 2005 |
| DB002 | The Pragmatic Programmer   | 55.5  | 1989 |
| DB003 | JavaScript: The Good Parts | 75.0  | 2011 |


--- 


## How to Use

1. **Add a Book**: Select the book type (PaperBook, EBook, or DemoBook) and input details like ISBN, title, price, and more.
    
2. **Remove Outdated Books**:
    - Remove books that are older than 10 years. These books will be automatically identified and removed from the inventory when selecting the "Remove Book" option.
        
3. **Buy a Book**:
    
    - Enter the ISBN of the book you want to buy.
    - Specify the quantity and provide an email (for EBooks).
    - PaperBooks will be shipped with a shipping cost calculated based on weight.
    - EBooks will be sent to the provided email.
        

## Example Output
### Start The Program
<img width="228" alt="Screenshot 2025-07-09 at 7 27 26 AM" src="https://github.com/user-attachments/assets/042a3831-d9cd-4669-926f-bc482a5437bc" />

### Validate Choose Number Exist In List
<img width="188" alt="Screenshot 2025-07-09 at 7 28 29 AM" src="https://github.com/user-attachments/assets/170242bc-6523-4ab9-91e2-2579483034f5" />

### Choose Correct Number(Specially The Number For Add Book)
<img width="209" alt="Screenshot 2025-07-09 at 7 30 11 AM" src="https://github.com/user-attachments/assets/23af25f2-cff9-4cd5-8e8d-647555da8927" />

→ There exists also validation when choosing the number in the list of books' types
### Fisrt Choose to add Paper Book then enter its information
<img width="318" alt="Screenshot 2025-07-09 at 7 35 58 AM" src="https://github.com/user-attachments/assets/a65b2723-3d79-49e1-85b8-9e0cce57e734" />

### Asking to add another book and make validation to enter only (yes | no) in any lettercase
<img width="318" alt="Screenshot 2025-07-09 at 7 37 29 AM" src="https://github.com/user-attachments/assets/1f93b541-eeb2-44cd-af89-d476623c65a6" />

### Enter Yes then choose another type (EBook) then enter its information
<img width="276" alt="Screenshot 2025-07-09 at 7 38 55 AM" src="https://github.com/user-attachments/assets/a5326ead-97d4-4f4d-8a3d-6c6fbbf87993" />

### Make the same thing then choose Demobook and also enter its information
<img width="276" alt="Screenshot 2025-07-09 at 7 40 05 AM" src="https://github.com/user-attachments/assets/f106e3d6-16f8-4b86-9c61-7edbb9cd27ba" />

### End The Add function then ask if want to close the system or do another function
<img width="289" alt="Screenshot 2025-07-09 at 7 41 55 AM" src="https://github.com/user-attachments/assets/a2692a64-dea3-4c09-b457-de9ee7754a1d" />

→ There exists also validation to enter only (yes | no) in any lettercase

### Choose another function (Remove books that are outdated, specifically those published more than 10 years before 2025)
<img width="602" alt="Screenshot 2025-07-09 at 7 44 27 AM" src="https://github.com/user-attachments/assets/981a4bb9-5683-49e2-807c-208591f8c08b" />

### End Remove function then go to another function(Buy Book) and validate the search for book by its ISBN
<img width="228" alt="Screenshot 2025-07-09 at 7 46 24 AM" src="https://github.com/user-attachments/assets/d972f769-e371-45f2-83bb-1fed7886634b" />

   #### Want to validate when choose book recently removed will say not found
   <img width="215" alt="Screenshot 2025-07-09 at 7 51 01 AM" src="https://github.com/user-attachments/assets/2b330cc7-c700-4fc3-9e2c-b426e6740d54" />

    

### Enter ISBN already exist (For Paper Book) then enter the required information for buy and check out
<img width="437" alt="Screenshot 2025-07-09 at 7 48 11 AM" src="https://github.com/user-attachments/assets/fb887cee-157a-404d-a7ea-18804ddcdc55" />

### asking for buy another book and choose to buy Ebook
<img width="690" alt="Screenshot 2025-07-09 at 7 49 04 AM" src="https://github.com/user-attachments/assets/b7b22dbf-a427-4407-b9ff-e4fad28c53ef" />


### make the last buy and choose to buy Demo Book that recently added
<img width="327" alt="Screenshot 2025-07-09 at 7 52 28 AM" src="https://github.com/user-attachments/assets/919ff395-d508-49e9-b3b4-e6777a9b61f1" />

### End The Buy Function and Close The Program
<img width="394" alt="Screenshot 2025-07-09 at 7 53 17 AM" src="https://github.com/user-attachments/assets/979c4ff9-dcb9-4eb8-bffc-f6bd15e9e61a" />








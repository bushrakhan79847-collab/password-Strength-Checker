# Password Strength Checker

## 1. Project Title & Goal
A Java console program that checks password strength using regex rules.

## 2. Setup Instructions
Requirements:
- Java 8 or above installed

Steps to run:

git clone <your-github-repo-link>  
cd PasswordStrengthTest/src  
javac Main.java  
java Main

## 3. The Logic (How I thought)
I used regex because it is the simplest way to validate patterns like numbers and special characters.

Conditions implemented:
- Password length must be at least 8 characters
- Must contain at least one number
- Must contain at least one special character

The hardest part was writing the correct regex for special characters. Initially the pattern was not working properly, but after testing I fixed it using:
.*[!@#$%^&*()].*

## 4. Output Screenshot
(Paste your console screenshot here directly)
![WhatsApp Image 2026-01-28 at 1 02 32 AM](https://github.com/user-attachments/assets/a28e77c6-08ff-4160-b68d-8408ef03357b)


## 5. Future Improvements
If I had 1 more days, I would:
- Add uppercase/lowercase validation
- Take password input from user
- Create a simple GUI version  


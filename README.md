# Password Strength Checker

## 1. Project Title & Goal

A Java console program that checks password strength using regex rules.

---

## 2. Setup Instructions

### Requirements

* Java 8 or above installed

### Steps to run

```bash
git clone https://github.com/bushrakhan79847-collab/password-Strength-Checker.git
cd password-Strength-Checker/src
javac Main.java
java Main
```

---

## 3. The Logic (How I thought)

I used **regular expressions (regex)** because it is the simplest and most reliable way to validate patterns like numbers and special characters inside a string.

### Conditions implemented:

* Password length must be **at least 8 characters**
* Must contain **at least one number**
* Must contain **at least one special character**

### Challenge faced:

The hardest part was writing the correct regex for special characters. Initially, the pattern was not working correctly for some inputs.

After testing different patterns, I fixed it using:

```
.*[!@#$%^&*()].*
```

This correctly detects the presence of special characters in the password.

---

## 4. Output Screenshot


![WhatsApp Image 2026-01-28 at 1 02 32 AM](https://github.com/user-attachments/assets/a28e77c6-08ff-4160-b68d-8408ef03357b)

<!-- Your screenshot should already appear here -->

---

## 5. Future Improvements

If I had 2 more days, I would:

* Add uppercase and lowercase letter validation
* Allow users to input passwords dynamically
* Create a simple GUI version of this tool

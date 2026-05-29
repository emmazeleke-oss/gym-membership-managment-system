# 🎉🏋️ Gym Membership System — Advanced Java OOP 🚀

> A colorful, object-oriented membership program demonstrating **Inheritance, Polymorphism, Overloading,** and **Encapsulation** in Java.

---

## 🌟 What This Program Does
This program lets a user choose a gym membership:

✅ **Basic Membership** (Option `1`)  
👑 **VIP Membership** (Option `2`)

It collects:
- 👤 Name
- 📞 Phone Number
- 🎂 Age
- 💳 Membership Choice

Then it prints the correct membership result **automatically** using runtime polymorphism.

---

## 🧠 Advanced OOP Concepts Used
### 🏗️ 1) Inheritance
`VIPMember` inherits from `Member`.

### 🔁 2) Polymorphism (Method Overriding)
`VIPMember` overrides `showPackage()` so the output changes based on the real object type.

### 📚 3) Encapsulation
- `name` is **private**
- Access is provided via `getName()`

### 🧩 4) Method Overloading
`Member` has two versions of `showPackage()`:
- `showPackage()`
- `showPackage(String message)`

---

## 🎮 How to Run It
### ▶️ Compile
```bash
java Main
--- Membership Result ---
Alice has VIP Membership
Thank you for joining the gym!
🎯 Key Classes
👤 Member
Stores member info
Prints Basic Membership message
👑 VIPMember
Extends Member
Prints VIP Membership message using override
⚡ Main
Takes user input
Chooses which object to create
Calls the correct membership method
🎨 Design Highlights (Advanced Notes)
🔒 Access Modifiers (Who can see what?)
name → private
phone → protected
age → public (works, but not best practice in real projects)
showPackage() → package-private (default)
🧠 Overloading vs Overriding
Overloading ✅ same method name, different parameters
Overriding ✅ same method signature, subclass changes behavior
✅ Improvements You Can Add (Optional)
If you want to level it up even more:

🌈 Add input validation (choice must be 1 or 2)
🔢 Add try/catch for nextInt() errors
🛡️ Make age private + add getter/setter
📌 Use an enum for membership types instead of integers
📌 Troubleshooting
⚠️ If you get InputMismatchException
You typed something non-numeric where a number was expected (age/choice).
Fix by adding input checks.

🧾 Author
1,biruktawit
2.betselot




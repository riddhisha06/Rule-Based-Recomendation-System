# 🎯 Rule-Based Recommendation System (Java)

A **rule-based recommendation system** built using **core Java** that suggests relevant courses or items based on **user interest** and **skill level**.

The system uses **deterministic IF–ELSE logic** and a large predefined rule set to generate recommendations in a transparent and explainable way.

---

## 📌 Project Overview

This project demonstrates how **rule-driven recommendation engines** operate in real-world systems.

The application accepts:
- 🎯 **Interest**
- 📊 **Skill Level**

And produces:
- ✅ **Recommendation**
- 💡 **Explanation for the recommendation**

---

## 🧠 Technical Highlights

- Core Java implementation
- Object-Oriented Design
- External rule configuration
- Deterministic and explainable logic
- Modular and extensible architecture

---

## 📚 Supported Domains

The current rule dataset supports **12 interest categories**:

- 💻 Programming  
- 🎬 Movies  
- 📖 Books  
- 🏋️ Fitness  
- ✈️ Travel  
- 🍔 Food  
- 🎵 Music  
- 💼 Career  
- 💰 Finance  
- 🎮 Gaming  
- 🌍 Language Learning  
- 🏠 Home Decor  

Each category includes recommendations for:
- 🟢 Beginner  
- 🟡 Intermediate  
- 🔴 Advanced  

📦 **Total Rules:** 500+

---

## 🗂️ Project Structure

```text
RecommendationSystem/
├── src/
│   ├── User.java
│   ├── Rule.java
│   ├── RecommendationEngine.java
│   └── Main.java
├── data/
│   └── rules.txt
└── README.md

```

## 📄 Rule Definition Format

Rules are in `rules.txt` using pipe-separated format:

```text
interest|level|recommendation|reason
```

Example:

```text
backend|beginner|Java + SQL Essentials|Ideal combination to start backend development.
```

## ▶️ How to Run

From project root:

```bash
javac -d out src/*.java
java -cp out Main
```

## 🔍 Sample interaction

```text
Choose an option:
1. Get recommendations
2. View example input values
0. Exit
Enter choice: 1

Enter interest (e.g., programming, backend, data-science): backend
Enter level (beginner/intermediate/advanced): beginner

Recommended items:
1. Java + SQL Essentials
   Reason: Ideal combination to start backend development.
```

## ⚠️ Known Limitations

- Recommendations are limited to predefined rules
- No automatic learning from user behavior
- Rule updates require manual changes

## 🚀 Planned Enhancements

- Graphical interface using JavaFX or Swing
- Rule storage using JSON or a relational database
- User history tracking
- Optional machine learning integration

## ⭐ Summary

This project provides a clear and maintainable implementation of a rule-based recommendation system using Java, with a focus on explainability, structure, and extensibility.

---

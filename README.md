# Rule-Based Recommendation System in Java

A simple, fresher-friendly Java project that recommends items using **IF-style rules** (no AI/ML), now with **500+ predefined rules** across both tech and non-tech domains.

## What this project does

The system takes:
- `interest`
- `level`

Then it returns:
- Recommended course/item
- Reason for recommendation

This is a basic version of recommendation logic used in many real systems.

## Why this project is good for beginners

- Uses core Java concepts (classes, objects, lists, file handling, conditions)
- Easy to explain in viva/interview
- No fake AI claims
- Easy to extend in future


## Supported domains

The current rules dataset includes 12 interests:
- programming
- movies
- books
- fitness
- travel
- food
- music
- career
- finance
- gaming
- language-learning
- home-decor

Each interest has recommendations for: `beginner`, `intermediate`, and `advanced`.

## Project structure

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

## How rules are stored

Rules are in `data/rules.txt` using pipe-separated format:

```text
interest|level|recommendation|reason
```

Example:

```text
backend|beginner|Java + SQL Essentials|Ideal combination to start backend development.
```

## How to run

From project root:

```bash
javac -d out src/*.java
java -cp out Main
```

## Sample interaction

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

## Limitations

- Works only for predefined rules
- Not adaptive to new behavior automatically
- Rules must be updated manually

## Future scope

- Add GUI (JavaFX/Swing)
- Store rules in JSON or database
- Add user history tracking
- Upgrade to ML-based recommendation later

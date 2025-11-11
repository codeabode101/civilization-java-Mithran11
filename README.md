🪨 5-Day Java Project: My First Civilization
Guide your small civilization through basic daily choices and watch it grow!
---
### Day 1: Starting Your Village
1.  Create `CivilizationGame.java`
2.  In the `main` method, ask the player: "What is your civilization's name?" using `Scanner`.
3.  Store the name.
4.  Create two whole number variables: `int food = 10;` and `int wood = 10;`
5.  Print a welcome message: "Welcome, [Civilization Name]! You start with 10 food and 10 wood."
    *   **Input/Output Example:**
        ```
        What is your civilization's name? Green Valley
        Welcome, Green Valley! You start with 10 food and 10 wood.
        ```
---
### Day 2: Making Basic Choices
1.  Print your current `food` and `wood` counts.
2.  Ask the player: "What do you want to do? (1) Gather Food or (2) Gather Wood" using `Scanner.nextInt()`.
3.  Use an `if-else if-else` structure to check their choice:
    *   If `1`: Add 5 to `food`. Print "You gathered 5 food."
    *   If `2`: Add 5 to `wood`. Print "You gathered 5 wood."
    *   Else: Print "Invalid choice. Nothing happened."
4.  Print your new `food` and `wood` counts.
    *   **Input/Output Example:**
        ```
        Food: 10, Wood: 10
        What do you want to do? (1) Gather Food or (2) Gather Wood
        1
        You gathered 5 food.
        Food: 15, Wood: 10
        ```
---
### Day 3: Building & Expanding
1.  Print current `food` and `wood`.
2.  Add a new whole number variable: `int population = 5;`
3.  Ask the player: "What next? (1) Gather Food, (2) Gather Wood, or (3) Build a Shelter?"
4.  Expand your `if-else if-else` structure:
    *   Choices `1` and `2` work like Day 2.
    *   If `3`:
        *   Check `if (wood >= 8)`:
            *   If true: Subtract 8 from `wood`. Add 1 to `population`. Print "A new shelter is built! Population grows by 1."
            *   Else: Print "Not enough wood to build a shelter."
5.  Print new `food`, `wood`, and `population` counts.
6.  **(Guided Creativity):** Add one new choice! Make it choice `4`. What else can your people do? Maybe "Explore Nearby" to gain 2 `food` and 2 `wood`, or "Rest" to simply gain 1 `food` if `food` is less than 10.
    *   **Input/Output Example (for building shelter):**
        ```
        Food: 15, Wood: 10, Population: 5
        What next? (1) Gather Food, (2) Gather Wood, or (3) Build a Shelter?
        3
        A new shelter is built! Population grows by 1.
        Food: 15, Wood: 2, Population: 6
        ```
---
### Day 4: Daily Events
1.  Print current `food`, `wood`, and `population`.
2.  Simulate a "Daily Event":
    *   Check `if (food < population)`:
        *   If true: Print "Not enough food! Your people are hungry." (Do not change population yet).
    *   Else: Print "Everyone is well-fed today."
3.  Present all choices from Day 3 (and your custom choice 4).
4.  Process the player's choice, updating `food`, `wood`, and `population`.
5.  Print the final `food`, `wood`, and `population` counts after the choice.
    *   **Input/Output Example (event before choice):**
        ```
        Food: 2, Wood: 5, Population: 6
        Not enough food! Your people are hungry.
        What next? (1) Gather Food, (2) Gather Wood, or (3) Build a Shelter? (4) [Your choice]
        1
        You gathered 5 food.
        Food: 7, Wood: 5, Population: 6
        ```
---
### Day 5: Facing Challenges
1.  Print current `food`, `wood`, and `population`.
2.  Repeat the "Daily Event" from Day 4.
3.  Present all existing choices (1, 2, 3, and your custom choice 4).
4.  Process the player's choice, updating resources and population.
5.  Print the final state.
6.  **(Open-ended Extension):** Add one new challenge or decision point for your civilization. For example, you could add an option to 'Defend Village' (choice 5) which requires `wood >= 10` to succeed (just print "Village defended!" or "Not enough wood to defend!"). Or add 'Expand Farm' (choice 6) which requires `food >= 5` but then gives 2 more `food` each time you pick 'Gather Food' in the future (no need to change gather food, just print a special message). Your new choice should lead to different simple outcomes based on your existing `food` or `wood` variables using `if/else`.
    *   **Input/Output Example (after adding a custom Day 5 choice):**
        ```
        Food: 10, Wood: 12, Population: 7
        Everyone is well-fed today.
        What next? (1) Gather Food, (2) Gather Wood, (3) Build a Shelter, (4) Explore Nearby, (5) Defend Village?
        5
        Village defended! You used 10 wood.
        Food: 10, Wood: 2, Population: 7
        ```

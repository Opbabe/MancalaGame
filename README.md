
# 🎮 Mancala Game

<div align="center">



[![Version](https://img.shields.io/badge/version-1.0.0-blue.svg?cacheSeconds=2592000)](https://img.shields.io/badge/version-1.0.0-blue.svg?cacheSeconds=2592000)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=java&logoColor=white)](https://www.java.com)
[![Swing](https://img.shields.io/badge/swing-%230175C2.svg?style=flat&logo=java&logoColor=white)](https://docs.oracle.com/javase/tutorial/uiswing/)

*A modern implementation of the classic Mancala board game with customizable styles and engaging gameplay.*

[Explore the docs »](https://github.com/Opbabe/MancalaGame.git)

[View Report Paper](https://docs.google.com/document/d/1Cq-ON8Ta9ps0CY_mOdyuCLSNpUV_9Hl6AhJOfYpYH_I/edit?usp=sharing) · [Report Bug](https://github.com/Opbabe/MancalaGame.git) · [Request Feature](https://github.com/Opbabe/MancalaGame.git)

</div>

---

## 🚀 Features

- 🎨 Customizable board styles (Classic and Modern)
- 🔄 Undo move functionality (up to 3 times per turn)
- 🔢 Adjustable number of starting stones
- 🖱️ Intuitive click-to-play interface
- 🏆 Automatic win detection and game-over handling

---

## 🕹️ Gameplay

<Callout type="info" emoji="ℹ️">
  Experience the ancient game of Mancala with a modern twist!
</Callout>

1. **Start Game**: Click "Start" to begin your Mancala adventure.
2. **Set Stones**: Choose 3 or 4 starting stones per pit.
3. **Make Moves**: Click on a pit to distribute stones.
4. **Undo Moves**: Made a mistake? Undo up to 3 moves per turn.
5. **Switch Styles**: Toggle between Classic and Modern board styles.

---

## 🎨 Screenshots


    *Classic Mancala board with traditional design*
  </Tab>
  <Tab>
<img width="935" alt="Screenshot 2024-12-28 at 11 06 25 PM" src="https://github.com/user-attachments/assets/5d7aee2c-12a3-4583-abec-3879e3a6ef10" />


    *Modern Mancala board with sleek, minimalist design*
  </Tab>
</Tabs>
<img width="943" alt="Screenshot 2024-12-28 at 11 05 41 PM" src="https://github.com/user-attachments/assets/c5585c61-9d58-45b5-a42b-7a26facaad78" />

---

## 🛠️ Tech Stack

- **Language**: Java ☕
- **GUI Framework**: Swing 🖼️
- **Design Patterns**: MVC, Strategy 🏗️
- **IDE**: IntelliJ IDEA 💻

---

## 📂 Project Structure and Component Interaction

```mermaid
graph TD
    A[MancalaCS151] --> B[MancalaModel]
    A --> C[MancalaGameboard]
    A --> D[ClassicStyle]
    A --> E[ModernStyle]
    A --> F[MancalaController]

    B -->|Game State| F
    B -->|Update| C
    C -->|User Input| F
    F -->|Game Logic| B
    F -->|UI Updates| C
    D -->|Render| C
    E -->|Render| C

    subgraph Model
    B[MancalaModel]
    end

    subgraph View
    C[MancalaGameboard]
    D[ClassicStyle]
    E[ModernStyle]
    end

    subgraph Controller
    F[MancalaController]
    end

    G[User] -->|Interacts| C
    F -->|Validates Moves| B
    B -->|Notifies| F
    F -->|Updates| C

    style A fill:#f9f,stroke:#333,stroke-width:4px
    style B fill:#bbf,stroke:#f66,stroke-width:2px
    style C fill:#bfb,stroke:#f66,stroke-width:2px
    style D fill:#bfb,stroke:#f66,stroke-width:2px
    style E fill:#bfb,stroke:#f66,stroke-width:2px
    style F fill:#fbb,stroke:#f66,stroke-width:2px
    style G fill:#ffe,stroke:#333,stroke-width:2px

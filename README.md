# Chat Application(Durdle)- Low-Level Design (Java)

This repository contains a **Chat Application** implemented in Java. The project demonstrates **low-level design (LLD)** principles and uses object-oriented programming (OOP) to create a secure, interactive chat system with user authentication and private chat rooms.

---

## 📖 Features

1. **Account Creation**:
   - Users can create an account by entering their name and password.
   - Password validation requires re-entering the password for confirmation.
   - A unique **secret code** (user ID) is generated for each user to enable private chats.

2. **Login System**:
   - Strong authentication ensures only valid users can log in.
   - Passwords are securely checked, and invalid attempts prompt retries.

3. **Private Chat**:
   - Users can chat privately with a friend by entering their **friend's secret code**.
   - Chats are accessible only when the correct secret code is provided.

4. **Message Persistence**:
   - Messages exchanged between two users are saved and can be retrieved by either party when they log in and access the chat room.

5. **Interactive User Interface**:
   - Console-based menu system with options to create an account, log in, and exit.
   - Error handling for invalid inputs ensures a seamless user experience.

---

## 🛠️ Tech Stack

- **Language**: Java  
- **Design Principles**:
  - Low Level System Design(LLD)
  - Object-Oriented Programming (OOP)
  - Single Responsibility Principle (SRP)
  - Separation of Concerns

---

### Key Components
1. **Main**: Manages user interface and coordinates system operations.
2. **User**: Represents a user with attributes like name, password, and secret code.
3. **Authentication**: Handles account creation, password confirmation, and secure login.
4. **ChatBox**: Manages chat sessions, stores messages, and allows message retrieval.

---

🖥️How It works

**Application Flow**
1. Create Account:
  - Enter your name and password
  - Re-enter your password for confrimation
  - Receive a unique secret code (user ID) for private chats.

2. Login:
  - Enter your name and password to log in.
  - Incorrect credentials prompt retries util valid details are entered.

3. Chat with a Friend:
  - After logging in, choose to chat with a friend.
  - Enter your friend's secret code to start a chat session.
  - Incorrect codes prompt retries until valid input is provided.
  - Exchage messages is the chat room. Type "exit 5" to leave the chat.

4. Private Message Hub:
  - A Private Message Hub(Chat Room) is created between two users when they log in and provide and each other's secret code.
  - This hub allows only the two users to exchange messages, ensuring complete privasyy and exclusivity.
  - Messages are persistent, enablig users to log in later, access the hub(Room) with the correct secret code, and seamlessly continue their conversation.

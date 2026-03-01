# 📇 Contact Management System (Full Stack)

A full-stack Contact Management System built using **Spring Boot**, **React**, and **H2 Database**.

This project demonstrates REST API development, frontend-backend integration, production build deployment, and full Git workflow.

---

## 🚀 Live Architecture

The application runs in two modes:

### 🧩 Development Mode
- Frontend → http://localhost:3000  
- Backend → http://localhost:8080  

### 🚀 Production Mode (Single Port)
- Frontend + Backend → http://localhost:8080  

In production mode, the React build is served directly by Spring Boot.

---

## 🛠 Tech Stack

### 🔹 Backend
- Java 17  
- Spring Boot  
- Spring Data JPA (Hibernate)  
- H2 Database  
- Maven  

### 🔹 Frontend
- React (Class Components)  
- Fetch API  
- Materialize CSS  

### 🔹 Tools
- Git & GitHub  
- VS Code  
- Postman  

---

## ✨ Features

- ✅ Add new contact  
- ✅ View all contacts  
- ✅ REST API integration  
- ✅ CORS configuration  
- ✅ Real-time UI updates  
- ✅ Production build integration  
- ✅ Single-port deployment  
- ✅ Full-stack architecture  

---

## 📂 Project Structure

```
crm/
├── src/ (Spring Boot Backend)
│   └── main/
│       └── resources/
│           └── static/ (React production build)
├── pom.xml
├── client/ (React Frontend Source Code)
│   ├── src/
│   ├── public/
│   └── package.json
└── README.md
```

---

## ⚙️ How To Run This Project

---

### 🔹 Option 1 — Development Mode

#### 1️⃣ Run Backend

```bash
mvn spring-boot:run
```

Backend runs on:

```
http://localhost:8080
```

#### 2️⃣ Run Frontend

```bash
cd client
npm install
npm start
```

Frontend runs on:

```
http://localhost:3000
```

---

### 🔹 Option 2 — Production Mode (Single Port)

#### 1️⃣ Build React App

```bash
cd client
npm run build
```

#### 2️⃣ Copy build files into:

```
src/main/resources/static/
```

#### 3️⃣ Run Spring Boot

```bash
mvn spring-boot:run
```

Now open:

```
http://localhost:8080
```

---

## 🔌 API Endpoints

### 📍 Get All Contacts

```
GET /api/contacts
```

### 📍 Create Contact

```
POST /api/contacts
```

### 📍 H2 Database Console

```
http://localhost:8080/h2-console
```

---

## 🧠 What I Learned

- REST API development using Spring Boot  
- Entity → Repository → Controller architecture  
- Spring Data REST configuration  
- Handling CORS issues  
- React state management  
- Production build deployment  
- Full-stack integration  
- Git workflow and project structuring  

---

## 📸 Screenshots

![DEMO](./docs/demo.png)

---

## 👨‍💻 Author

**Vivek Kushwaha**  
B.Tech CSE Student | Aspiring Full Stack Developer  

---

## ⭐ If you like this project, give it a star!

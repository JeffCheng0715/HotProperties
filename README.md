# 🏡 Hot Properties – Full-Stack Real Estate Web Application  
## 📖 Overview

Hot Properties is a full-stack real estate web application. The application simulates a real estate platform where Buyers can browse and save properties, Agents can manage property listings, and Admins can oversee users and system operations.

Built with **Spring Boot**, **Spring Security (JWT)**, **Spring Data JPA**, **Hibernate**, **Thymeleaf**, **MySQL** and cloud deployment on **AWS Elastic Beanstalk with MySQL RDS**.

🌐 **Website Link:** [http://hotproperties.us-east-2.elasticbeanstalk.com/](http://hotproperties.us-east-2.elasticbeanstalk.com/)
![Home Page](screenshots/home.png)  
---

## ✨ Features

### 🔑 Authentication & Roles
- Role-based access control with JWT Security (BUYER, AGENT, ADMIN).  
- Secure login and registration with BCrypt password hashing.  

### 🏠 Buyer Features
- Register and manage profile.  
- Browse properties with **filters & sorting** (zip code, sq. ft., price).  
- View property details with image gallery.  
- Save favorite listings for later.  
- Send and manage messages with agents.  

### 🧑‍💼 Agent Features
- Manage own property listings (add, edit, delete).  
- View and respond to buyer messages.  

### 👩‍💻 Admin Features
- Manage all users.  
- Create new agents.  

---

## 📸 Screenshots

### Authentication
Login Page:  
![Login Page](screenshots/login.png)  
Register Page:  
![Register Page](screenshots/register.png)  

### Buyer
Buyer's Dashboard:  
![Buyer Dashboard](screenshots/buyer_dashboard.png)  
Edit Profile:  
![Edit Profile](screenshots/edit_profile.png)  
Browse Properties:  
![Browse Properties](screenshots/browse_properties.png)  
Property Details:  
![Property Details](screenshots/property_details.png)  
Favorites:  
![Favorites](screenshots/favorite_properties.png)  
Messages:  
![Messages](screenshots/message.png)  

### Agent
Agent's Dashboard:  
![Agent Dashboard](screenshots/agent_dashboard.png)  
Manage Properties:  
![Manage Properties](screenshots/manage_properties.png)  
Add Property:  
![Add Property](screenshots/add_property.png)  
Edit Property:  
![Edit Property](screenshots/edit_property.png)  

### Admin
Admin's Dashboard:  
![Admin Dashboard](screenshots/admin_dashboard.png)  
Manage Users:  
![Manage Users](screenshots/manage_users.jpg)  
Create Agent:  
![Create Agent](screenshots/create_agent.png)  

---

## 🛠️ Tech Stack
- **Backend**: Spring Boot, Spring Security (JWT), Spring Data JPA, Hibernate  
- **Frontend**: Thymeleaf, HTML, CSS  
- **Database**: MySQL (RDS in AWS for deployment)  
- **Architecture**: Layered (Controller, Service, Repository, Security, Presentation)  
- **Deployment**: AWS Elastic Beanstalk with MySQL RDS  

---

## 🚀 Getting Started

### Prerequisites
- Java 17+  
- Maven  
- MySQL  

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/hot-properties.git
   cd hot-properties

2. Copy application-example.properties to application.properties and configure:
   ```properties
   spring.datasource.username=your_db_username
   spring.datasource.password=your_db_password
   jwt.secret=your_secret_key_here
   
3. Run the app:
   ```bash
   mvn spring-boot:run
   
4. Access at: [http://localhost:8080](http://localhost:8080)

---

## 📂 Group Repo: [https://github.com/pradnya-16/Hot-Properties-Project](https://github.com/pradnya-16/Hot-Properties-Project)

## 👤 My Contribution Summary
- Buyer features: **Browse Properties, Property Details, Filtering & Sorting**.  
- Buyer Dashboard & Profile templates.  
- Implemented **`PropertyService` / `BuyerService`**.  
- Global Exception Handling with `@ControllerAdvice`.  
- Entities: `Property`, `PropertyImage`, `Message`.  
- Initializers: `PropertyInitializer`, `UserInitializer`.  
- Templates: `browse_properties.html`, `property_details_view.html`, `profile.html`, `dashboard.html` (shared), `icon_only_header.html`.
- Deployment of the application on **AWS (Elastic Beanstalk + RDS)**.  

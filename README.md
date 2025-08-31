
# Doctor Consultation Service 

This is a microservice built using **Spring Boot** as part of the **Hospital Microservices Project**.  
It handles **doctor consultation details** and interacts with the **Patient Registration Service**.

---

##  Features
- Register doctor consultations
- Fetch patient details using REST client
- Store and retrieve consultation records
- Follows microservices architecture with separate services

---

##  Tech Stack
- Java 17 (or your version)
- Spring Boot
- Spring Data JPA
- REST API
- Maven
- MySQL / H2 (depending on your DB)

---

##  Project Structure
doctor-consultation-service/
├── src/main/java/com/myapp/springcloud/
│ ├── Controller/ # REST Controllers
│ ├── dto/ # Data Transfer Objects
│ ├── entity/ # Entities
│ ├── repo/ # Repository Layer
│ ├── service/ # Service Layer
│ └── restclient/ # REST client to call Patient Service
├── src/main/resources/
│ └── application.properties
└── pom.xml


---

##  How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/dharani9966/doctor-consultation-service.git

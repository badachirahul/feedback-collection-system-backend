# Feedback Collection System - Backend (Spring Boot)

This is the backend for the Feedback Collection System. It’s built using Spring Boot and uses a MySQL database.

## Prerequisites
- Java 17 or above
- Maven
- MySQL installed locally

## Getting Started

1. Clone the repository:
   - git clone https://github.com/badachirahul/feedback-collection-system-backend.git
   - cd feedback-collection-system-backend


2. Set up your MySQL database:
   - Create a database (example: `feedback_collection`)
   - Note down your username, password, and port

3. Update the database credentials in `src/main/resources/application.properties`:
   - spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   - spring.datasource.username=your_username
   - spring.datasource.password=your_password
   - spring.jpa.hibernate.ddl-auto=update
   - server.port=8085

4. Run the application:
   - The backend should start on: `http://localhost:8085`

## API Endpoints

| Method | Endpoint              | Description           |
|--------|-----------------------|-----------------------|
| POST   | `/api/feedbacks`      | Add new feedback      |
| GET    | `/api/admin/feedbacks`      | Get all feedbacks     |
| PUT    | `/api/feedbacks/{id}` | Update feedback by ID    |

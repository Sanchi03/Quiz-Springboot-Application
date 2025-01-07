This is a monolithic Spring Boot application for managing quizzes. It uses Spring Data JPA for database interaction and PostgreSQL for data storage. The application is divided into two major components: Question and Quiz.

Features:

1. Question Management:

Add Question: Create a new question and store it in the database.

Delete Question: Remove a specific question by its ID.

View All Questions: Retrieve a list of all questions.

View Questions by Category: Filter questions by category, such as Java or Python.

2. Quiz Management:

Create Quiz: Create a new quiz using selected questions.

Get Quiz by ID: Retrieve the details of a specific quiz using its ID.

Submit Quiz: Submit a completed quiz for evaluation.

Project Structure:

1. Packages:

controller: Contains REST controllers for handling API requests.

service: Contains service classes for business logic.

repository: Contains repository interfaces for database operations.

2. Database:

The application uses PostgreSQL for data persistence.

Data is managed using Spring Data JPA.

APIs:

1. Question APIs:

Add Question: POST /question/add

Delete Question: DELETE /question/deleteById/4

View All Questions: GET /question/allQuestions

View Questions by Category: GET /question/category/Java or Python 

2. Quiz APIs:

Create Quiz: POST /quiz/create?category=Java&numQ=5&title=JQuiz

Get Quiz by ID: GET /quiz/getQuiz/1

Submit Quiz: POST /quiz/sumbitQuiz/1

Technologies Used:

Java: Programming language.

Spring Boot: Framework for building the application.

Spring Data JPA: For database interactions.

PostgreSQL: Database for storing application data.

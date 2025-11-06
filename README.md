 Experiment 3.2 – Spring & Hibernate Java Application


This project demonstrates how to build Java applications using **Spring Framework** and **Hibernate ORM** for:
- Dependency Injection (DI)
- CRUD Operations
- Transaction Management *(optional extension)*

It’s divided into three parts — **A** and **B** are implemented here.

---

## ⚙️ Part A: Spring Dependency Injection (Java-Based Configuration)

**Objective:**  
To demonstrate how Spring performs Dependency Injection using annotations and Java-based configuration instead of XML.

**Key Concepts:**
- `@Configuration` and `@Bean` annotations  
- Constructor-based dependency injection  
- `AnnotationConfigApplicationContext` for context initialization  

**Classes:**


---

🗃️ **Part B: Hibernate CRUD Operations**  
The objective of Part B is to perform database operations using **Hibernate ORM** — a powerful framework that maps Java classes to relational database tables using annotations. It demonstrates how to perform **Create, Read, Update, and Delete (CRUD)** operations on a `Student` entity stored in a MySQL database. Key concepts include Hibernate annotations such as `@Entity`, `@Table`, `@Id`, and `@Column` for ORM mapping, and the use of `SessionFactory` and `Session` for interacting with the database. The project includes a `Student` entity class mapped to a `students` table, a `StudentDAO` class that provides methods for adding, retrieving, updating, and deleting student records, and a `MainApp` class that demonstrates the complete CRUD flow. The configuration file `hibernate.cfg.xml` is used to set up MySQL connection details, Hibernate dialect, and mapping information. When executed, the Hibernate console logs show SQL operations corresponding to insert, select, update, and delete queries.  
**Example Console Output:**  


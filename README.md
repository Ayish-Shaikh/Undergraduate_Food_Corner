# Bangaliana - Cloud Food Corner

A modern web application for ordering authentic Bengali cuisine online. Built with Spring Boot MVC, this project demonstrates enterprise-level web development with form validation, database persistence, and responsive UI design.

**Live Demo:** [Coming Soon]  
**GitHub:** https://github.com/Ayish-Shaikh/Undergraduate_Food_Corner

---

## Table of Contents

- [Overview](#overview)
- [Tech Stack](#tech-stack)
- [Features](#features)
- [Project Structure](#project-structure)
- [Setup & Installation](#setup--installation)
- [Configuration](#configuration)
- [Database](#database)
- [API Endpoints](#api-endpoints)
- [Usage](#usage)
- [Testing](#testing)
- [Future Enhancements](#future-enhancements)
- [License](#license)
- [Author](#author)

---

## Overview

Bangaliana is a food ordering application specializing in traditional Bengali dishes. Users can browse curated menus organized by category (Main Course, Street Food, Sweets, Beverages), validate orders through form submission, and track their delivery details with real-time feedback.

**Built following:** Spring in Action (Craig Walls) - Chapter 3: Working with Data

---

## Tech Stack

### Backend
- **Framework:** Spring Boot 4.0.5
- **Language:** Java 25
- **Build Tool:** Maven 3.x
- **ORM:** Spring Data JPA with Hibernate
- **Database:** H2 (In-Memory for Development)
- **Validation:** Jakarta Bean Validation API (Hibernate Validator)

### Frontend
- **Template Engine:** Thymeleaf
- **Styling:** Custom CSS with theme switching (Light/Dark mode)
- **Scripting:** Vanilla JavaScript

### Testing
- **Framework:** JUnit 5
- **Mocking:** Mockito
- **Test Dependencies:** Spring Boot Test, Thymeleaf Testing

### Dependencies

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webmvc</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf-test</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webmvc-test</artifactId>
</dependency>
```

---

## Features

✅ **Menu Browsing**
- Categories: Main Course, Street Food, Sweets, Beverages
- Dynamic filtering by category
- Item details: name, description, price, image

✅ **Form Validation**
- Customer name validation
- Delivery address validation
- Phone number format validation (10 digits)
- Real-time error display in UI

✅ **Data Persistence**
- JPA Entity mapping for Category, MenuItem, Order
- Automatic table creation via Hibernate
- H2 in-memory database for development

✅ **Responsive Design**
- Mobile-first approach
- Theme toggle (Light/Dark mode)
- Smooth transitions & animations
- Accessible navigation

✅ **MVC Architecture**
- Separation of concerns (Controller → Service → Repository)
- Dependency injection via Spring
- Annotation-based request mapping

---

## Project Structure

```
cloud-food-corner/
├── src/
│   ├── main/
│   │   ├── java/com/undergraduate/cloud_food_corner/
│   │   │   ├── controller/
│   │   │   │   ├── HomeController.java
│   │   │   │   ├── MenuController.java
│   │   │   │   └── OrderController.java
│   │   │   ├── model/
│   │   │   │   ├── Category.java (Entity with nested enum)
│   │   │   │   ├── MenuItem.java (Entity)
│   │   │   │   └── Order.java (Entity with validation)
│   │   │   ├── repository/
│   │   │   │   ├── CategoryRepository.java (JpaRepository)
│   │   │   │   ├── MenuItemRepository.java (JpaRepository)
│   │   │   │   └── OrderRepository.java (JpaRepository)
│   │   │   ├── service/
│   │   │   │   └── MenuService.java (Business logic)
│   │   │   └── CloudFoodCornerApplication.java (Main class)
│   │   ├── resources/
│   │   │   ├── templates/
│   │   │   │   ├── home.html
│   │   │   │   ├── menu.html
│   │   │   │   └── orderForm.html
│   │   │   ├── static/
│   │   │   │   └── images/ (food item images)
│   │   │   ├── application.properties
│   │   │   └── data.sql (initial data)
│   └── test/
│       └── java/com/undergraduate/cloud_food_corner/
│           ├── CloudFoodCornerApplicationTests.java
│           ├── HomeControllerTest.java
│           └── MenuControllerTest.java
├── pom.xml
├── README.md
└── .gitignore
```

---

## Setup & Installation

### Prerequisites
- Java 25 or higher
- Maven 3.6+
- Git

### Clone Repository
```bash
git clone https://github.com/Ayish-Shaikh/Undergraduate_Food_Corner.git
cd cloud-food-corner
```

### Build Project
```bash
mvn clean install
```

### Run Application
```bash
mvn spring-boot:run
```

Application starts at: `http://localhost:1010`

### IDE Setup (IntelliJ IDEA)
1. Open project in IntelliJ
2. Right-click project → Maven → Reload Projects
3. Run → Edit Configurations → Add Spring Boot Application
4. Set Main class: `com.undergraduate.cloud_food_corner.CloudFoodCornerApplication`
5. Click Run

---

## Configuration

### application.properties

```properties
# Server
spring.application.name=cloud-food-corner
server.port=1010

# Database (H2 In-Memory)
spring.datasource.url=jdbc:h2:mem:cloudfooddb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# JPA/Hibernate
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect

# H2 Console (development only)
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Data initialization
spring.sql.init.mode=always
```

### H2 Database Console
Access: `http://localhost:1010/h2-console`
- JDBC URL: `jdbc:h2:mem:cloudfooddb`
- Username: `sa`
- Password: (leave blank)

---

## Database

### Entity Relationships

```
Category (1) ──────── (M) MenuItem
   ↓
Enum: CategoryType
  - MAIN_COURSE
  - STREET_FOOD
  - SWEETS
  - BEVERAGES

Order (1) ──────── (M) MenuItem
```

### Database Schema

**CATEGORY Table**
| Column | Type | Constraint |
|--------|------|-----------|
| id | BIGINT | PRIMARY KEY, AUTO_INCREMENT |
| name | VARCHAR(255) | NOT NULL |
| type | VARCHAR(50) | ENUM, NOT NULL |

**MENU_ITEM Table**
| Column | Type | Constraint |
|--------|------|-----------|
| id | BIGINT | PRIMARY KEY, AUTO_INCREMENT |
| name | VARCHAR(255) | NOT NULL |
| description | VARCHAR(500) | |
| price | DOUBLE | NOT NULL |
| category_id | BIGINT | FOREIGN KEY → CATEGORY |
| image_url | VARCHAR(500) | |

**ORDERS Table**
| Column | Type | Constraint |
|--------|------|-----------|
| id | BIGINT | PRIMARY KEY, AUTO_INCREMENT |
| customer_name | VARCHAR(255) | NOT NULL, @NotBlank |
| delivery_address | VARCHAR(500) | NOT NULL, @NotBlank |
| phone | VARCHAR(10) | NOT NULL, @Pattern |
| items | | MANY-TO-MANY |

---

## API Endpoints

### Web Routes (MVC)

| Method | Endpoint | Controller | Purpose |
|--------|----------|-----------|---------|
| GET | `/` | HomeController | Home page |
| GET | `/menu` | MenuController | Browse all menu items |
| GET | `/order/current` | OrderController | Order form page |
| POST | `/order` | OrderController | Submit order |

### Data Flow

```
GET /menu
  ↓
MenuController.showMenu()
  ↓
MenuService.getAllItems()
MenuService.getByCategory(CategoryType)
  ↓
MenuItemRepository.findAll()
  ↓
Model → menu.html (Thymeleaf)
  ↓
User sees categorized menu items
```

---

## Usage

### Browse Menu
1. Navigate to `http://localhost:1010/menu`
2. View items organized by category
3. Click category pills to jump to section
4. Theme toggle (🌙/☀️) to switch Dark/Light mode

### Place Order
1. Click "Place Order" → `/order/current`
2. Fill form:
    - Customer Name (required, not blank)
    - Delivery Address (required, not blank)
    - Phone Number (required, 10 digits)
3. Submit form
4. Validation feedback shows inline errors if invalid
5. On success → Redirect to home

### Validation Rules
- **Customer Name:** Non-blank
- **Delivery Address:** Non-blank
- **Phone:** Exactly 10 digits (regex: `^[0-9]{10}$`)

---

## Testing

### Run Tests
```bash
mvn test
```

### Test Classes
- `CloudFoodCornerApplicationTests` - Application context load test
- `HomeControllerTest` - Home page endpoint test
- `MenuControllerTest` - Menu controller with @MockitoBean

### Example Test
```java
@SpringBootTest
public class MenuControllerTest {
    @MockitoBean
    MenuService menuService;
    
    @Autowired
    MockMvc mockMvc;
    
    @Test
    public void testMenuPageLoads() throws Exception {
        mockMvc.perform(get("/menu"))
            .andExpect(status().isOk());
    }
}
```

---

## Future Enhancements

🔜 **Cart Management**
- Add to cart functionality
- Cart summary & checkout

🔜 **Payment Integration**
- Stripe/Razorpay payment gateway
- Order confirmation email

🔜 **User Authentication**
- Spring Security registration/login
- Order history tracking

🔜 **Admin Dashboard**
- Menu management CRUD
- Order tracking & fulfillment

🔜 **Real Database**
- MySQL/PostgreSQL for production
- Data migration from H2

🔜 **REST API**
- @RestController endpoints
- JSON request/response

---

## Build & Deployment

### Build WAR for Production
```bash
mvn clean package -DskipTests
```

### Deploy to App Server
```bash
java -jar target/cloud-food-corner-0.0.1-SNAPSHOT.jar
```

### Docker (Future)
```dockerfile
FROM openjdk:25-slim
COPY target/cloud-food-corner-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
```

---

## Troubleshooting

### Port Already in Use
```bash
# Change port in application.properties
server.port=8080
```

### Database Table Not Found
```properties
# Ensure ddl-auto is set to create/update
spring.jpa.hibernate.ddl-auto=create
```

### Images Not Loading
1. Place images in `src/main/resources/static/images/`
2. Reference in MenuItem: `/images/imagename.png`
3. Build & restart application

### Validation Not Working
Ensure `spring-boot-starter-validation` in pom.xml and use `@Valid` + `BindingResult` in controller

---

## Learning Resources

- **Spring in Action** by Craig Walls (Ch. 1-3)
- [Spring Boot Docs](https://spring.io/projects/spring-boot)
- [Thymeleaf Docs](https://www.thymeleaf.org)
- [Jakarta Bean Validation](https://jakarta.ee/specifications/bean-validation/)

---

## License

This project is licensed under the **MIT License** - see below for details.

### MIT License

```
MIT License

Copyright (c) 2026 Ayish Shaikh

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

---

## Author

**Ayish Shaikh**
- GitHub: [@Ayish-Shaikh](https://github.com/Ayish-Shaikh)
- Project: [Undergraduate Food Corner](https://github.com/Ayish-Shaikh/Undergraduate_Food_Corner)

---

## Contributing

Contributions welcome! Please:
1. Fork repository
2. Create feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit changes (`git commit -m 'Add AmazingFeature'`)
4. Push to branch (`git push origin feature/AmazingFeature`)
5. Open Pull Request

---

## Support

For issues & questions:
- Open GitHub Issue
- Check existing documentation
- Review application.properties configuration

---

**Last Updated:** May 2026  
**Version:** 0.0.1-SNAPSHOT

---

### Quick Start Checklist

- [ ] Clone repo
- [ ] Run `mvn clean install`
- [ ] Start app: `mvn spring-boot:run`
- [ ] Visit `http://localhost:1010`
- [ ] Browse menu at `/menu`
- [ ] Place order at `/order/current`
- [ ] Check H2 console at `/h2-console`
- [ ] Run tests: `mvn test`

Enjoy ordering Bengali cuisine! 🍛

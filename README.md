# AutoLoc

AutoLoc is a car-rental management REST API built with Spring Boot. It provides CRUD operations for vehicles, customers, reservations, contracts, payments, agencies, employees, insurance, equipment, and maintenance records.

The repository also includes a Postman workspace for testing the vehicle endpoints.

## Tech stack

- Java 17
- Spring Boot
- Spring Web MVC
- Spring Data JPA and Hibernate
- MySQL
- Springdoc OpenAPI / Swagger UI
- Maven

## Project structure

```text
.
├── AutoLoc-main/
│   ├── AutoLoc-main/       # Spring Boot application
│   └── postman/            # Postman requests and workspace globals
└── README.md
```

## Prerequisites

Install the following before running the API:

- JDK 17 or later
- MySQL 8 or later, or XAMPP with MySQL enabled
- Git

Maven is not required because the project includes the Maven Wrapper.

## Database configuration

The application connects to a local MySQL database using these defaults:

| Setting | Value |
| --- | --- |
| Database | `autoloc_db_dev` |
| Host | `localhost:3306` |
| Username | `root` |
| Password | empty |

The database is created automatically when it does not exist. To use different credentials, update:

```text
AutoLoc-main/AutoLoc-main/src/main/resources/application.properties
```

For a shared or production environment, prefer environment-specific configuration instead of committing credentials.

## Run the application

From the Spring Boot project directory:

```powershell
cd AutoLoc-main\AutoLoc-main
.\mvnw.cmd spring-boot:run
```

The API starts at:

```text
http://localhost:8081
```

Build and test the project with:

```powershell
.\mvnw.cmd clean test
```

## API documentation

Once the application is running, open Swagger UI at:

```text
http://localhost:8081/swagger-ui/index.html
```

## API endpoints

Each resource supports the same CRUD pattern:

| Resource | Base path |
| --- | --- |
| Vehicles | `/vehicules` |
| Agencies | `/agences` |
| Customers | `/clients` |
| Contracts | `/contrats` |
| Employees | `/employes` |
| Equipment | `/equipements` |
| Maintenance | `/maintenances` |
| Payments | `/paiements` |
| Reservations | `/reservations` |
| Insurance | `/assurances` |

For a resource named `resource`, the available routes are:

| Method | Route | Purpose |
| --- | --- | --- |
| `GET` | `/resource` | List all records |
| `GET` | `/resource/getById/{id}` | Get one record |
| `POST` | `/resource/ajouter<Resource>` | Create a record |
| `DELETE` | `/resource/delete<Resource>/{id}` | Delete a record |

For example, vehicle requests use:

```text
GET    http://localhost:8081/vehicules
GET    http://localhost:8081/vehicules/getById/1
POST   http://localhost:8081/vehicules/ajouterVehicule
DELETE http://localhost:8081/vehicules/deleteVehicule/1
```

Create requests accept JSON in the request body. The exact fields depend on the corresponding model.

## Postman collection

Vehicle request definitions are available in:

```text
AutoLoc-main/postman/collections/AutoLoc - Vehicules API/
```

The collection includes requests for:

- Adding a vehicle
- Listing all vehicles
- Retrieving a vehicle by ID
- Deleting a vehicle

Import the request files into Postman, start the API, and use `http://localhost:8081` as the base URL.

## Development notes

- JPA schema updates are enabled with `spring.jpa.hibernate.ddl-auto=update`.
- SQL logging is enabled for local development.
- The application package is `tn.esprit.autoloc`.

## License

No license has been specified for this project yet.
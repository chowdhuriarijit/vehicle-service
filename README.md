
## Endpoints

### Get Vehicle by Registration Number

**GET** `/api/v1/vehicle/{registrationNumber}`

- **Path Parameter**: `registrationNumber` (String) - The registration number of the vehicle.
- **Response**:
  - `200 OK`: Returns the vehicle details.
  - `404 Not Found`: If the vehicle is not found.

Example Response:
```json
{
  "registrationNumber": "TEST123",
  "make": "Toyota",
  "model": "Corolla",
  "color": "Blue",
  "year": 2020,
  "fuelType": "Petrol",
  "enginePower": 132
}

## Setup, Build, Run, and Test

### 1. Prerequisites
- Java 17 or higher
- Maven 3.8+
- Docker (optional, for containerization)

### 2. Clone the Repository
```bash
git clone https://github.com/chowdhuriarijit/vehicle-service.git
cd insurance-service
```

### 3. Build the Project
```bash
mvn clean install
```

### 4. Run the Application
```bash
mvn spring-boot:run
```

### 5. Access the Application locally
- The application will run on `http://localhost:8081` in local enviroment.

### 6. Run Unit Tests
```bash
mvn test
```

---

## Note
For **demo purposes**, the API is made public and showed localhost as example. In real project, it should be **protected** or **secured** using authentication and authorization mechanisms.
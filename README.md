
# Vehicle Service

## Note
The `vehicle-service` is a Java-based Spring Boot application that provides an API to retrieve vehicle details based on the vehicle registration number. Currently, I have only implemented the GET method to retrieve vehicle data; the PUT, DELETE, and POST (add) methods have not been added. Additionally, the API is currently public for demonstration purposes. However, in a real-world scenario, it should be secured—this can be achieved by implementing OAuth 2.0, using a service key for service-to-service communication, or other appropriate authentication mechanisms.For demonstration purposes, the service uses hardcoded mock data instead of a real database. In a actual project, this should be replaced with a proper database and repository layer to handle persistent data storage and retrieval.

## Features
- Retrieve vehicle details for a vehicle registration number.

### Clone the Repository
```bash
git clone https://github.com/chowdhuriarijit/vehicle-service.git
cd vehicle-service
```

### Build the Project
```bash
mvn clean install
```

### Run the Application
```bash
mvn spring-boot:run
```

### 5. Access the Application locally
- The application will run on `http://localhost:8081` in local enviroment.

## API Endpoints
### Get Vehicle Details
- **URL**: `/api/v1/vehicle/{registrationNumber}`
- **Method**: `GET`
- **Response Code**: 200
- **Response**:
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
  ```

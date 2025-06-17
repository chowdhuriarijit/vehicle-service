
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
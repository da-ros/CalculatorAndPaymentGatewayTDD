# Java TDD Project: Calculator and Payment Gateway

This project demonstrates the application of Test Driven Development (TDD) to implement a Calculator and a Payment Gateway in the same Java project.

## Project Structure

The project is divided into two main components:

1. **Calculator**
2. **Payment Gateway**

Each component has its corresponding test cases to ensure the functionality follows TDD principles.

### Calculator

The Calculator component provides basic arithmetic operations.

#### Files:
- `Calculator.java`: Contains the implementation of the Calculator.
- `CalculatorTest.java`: Contains test cases for the Calculator class.
- `CalculatorParametersTest.java` : Contains the parameterized test cases for the Calculator class.
- `ICalculator.java` : Contains the implementation of the Calculator for consume as a web service.
- `ICalculatorTest.java` : Contains the test cases for the ICalculator class.

### Payment Gateway

The Payment Gateway component simulates a basic payment processing system.

#### Files:
- `PaymentGateway.java`: Interface for the payment gateway.
- `PaymentProcessor.java`: Implements the payment gateway interface.
- `PaymentRequest.java`: Represents a payment request.
- `PaymentResponse.java`: Represents a payment response.
- `PaymentProcessorTest.java`: Contains test cases for the PaymentProcessor class.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Apache Maven (for build automation)

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/da-ros/CalculatorAndPaymentGatewayTDD.git
    cd CalculatorAndPaymentGatewayTDD
    ```

2. Build the project using Maven:
    ```bash
    mvn clean install
    ```

### Running Tests

To run the tests, use the following Maven command:
```bash
mvn test
```
This will execute all the test cases for both the Calculator and Payment Gateway components.

## TDD Approach

This project follows the Test Driven Development approach, where tests are written before the implementation code. The cycle involves:

    1. Writing a test case for a new feature or functionality.
    2. Running the test case to see it fail.
    3. Writing the minimum code required to pass the test.
    4. Refactoring the code while ensuring that all tests pass.

### Example

For the Calculator component, a test case might look like this:

```bash
@Test
public void testAddition() {
    Calculator calculator = new Calculator();
    assertEquals(5, calculator.add(2, 3));
}
```

For the Payment Gateway component, a test case might look like this:

```bash
@Test
public void testPaymentProcessing() {
    PaymentGateway gateway = Mockito.mock(PaymentGateway.class);
    PaymentProcessor processor = new PaymentProcessor(gateway);
    PaymentRequest request = new PaymentRequest(100.0);
    PaymentResponse response = gateway.requestPayment(request);
    assertEquals("OK", response.getStatus());
}
```

## Contributing

Contributions are welcome! Please follow these steps:

    1. Fork the repository.
    2. Create a new branch (git checkout -b feature-branch).
    3. Commit your changes (git commit -m 'Add some feature').
    4. Push to the branch (git push origin feature-branch).
    5. Open a pull request.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Acknowledgments

- Inspired by the principles of Test Driven Development.
- Thanks to all the contributors who have helped in improving this project.
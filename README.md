
---

# nowpayments-sdk-java

**nowpayments-sdk-java** is a Java SDK that provides a HTTP client layer for the [NOWPayments.io](https://nowpayments.io) crypto payment gateway.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Structure of the Project](#structure-of-the-project)
- [Contribution](#contribution)
- [License](#license)
- [Acknowledgments](#acknowledgments)

## Installation

### Prerequisites

- Java JDK version (e.g., JDK 17+)
- Any specific libraries or tools if needed

### Steps

1. Clone the repository:
```
git clone https://github.com/thejramon/nowpayments-sdk-java.git
```
2. Navigate to the project directory and install any dependencies (if applicable):
```
cd nowpayments-sdk-java
mvn install
```

## Usage

### Initialize the Client

```java
NowPayments client = new NowPayments();
```

### Make a Payment

Provide a brief example. E.g.:

```java
PaymentRequest request = new PaymentRequest(/* ... parameters ... */);
PaymentResponse response = client.createPayment(request);
```

... (Add more examples of typical usage patterns.)

## Structure of the Project

- **src/main/java**: Contains the main Java source files.
    - **me/thejramon/nowpayments/client**: HTTP client and related utilities.
    - **me/thejramon/nowpayments/model**: Data models for requests and responses.
    - ... (list other packages and their purposes)

- **src/test/java**: Unit tests for the SDK.

## Contribution


## License


## Acknowledgments

- [NOWPayments.io](https://nowpayments.io) for their crypto payment gateway service.


---


# Simple Token Consumer

Projeto que utiliza a dependência - [simple-token-generator](https://github.com/felipejsm/simple-token-generator/tree/maven-dependency)


## Tech Stack

**Server:** Spring Boot, Maven e Java 11.



## Run Locally

Clone the project

```bash
  git clone https://github.com/felipejsm/simple-token-consumer.git
```

Go to the project directory

```bash
  cd token-consumer
```

Install dependencies

```bash
  mvn clean install
```

Spin-up Redis(_standalone_)

```bash
  docker-compose up
```

Run it

```bash
  http://localhost:8080/v1/token
```

  
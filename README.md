# User System Backend 👨‍💻

Backend application for creating, displaying and storing users. The project is developed in Groovy/Spring Boot and the data is stored in a MariaDB database.

For the frontend part for this project, visit [this repository](https://github.com/AugustsKir/user-system-frontend).

## Installation

1. Create a docker container to start the MariaDB database.
```
docker run --name user-database -e MARIADB_USER=user -e MARIADB_PASSWORD=password -e MYSQL_ROOT_PASSWORD=rootpassword -e MARIADB_DATABASE=user-database -p 3306:3306 -d mariadb:latest
```
2. Clone the project to your local computer.

3. Open the terminal in the project folder and execute the following command to start the app. (Or start the app from your IDE)
```
./mvnw spring-boot:run
```

4. For further instructions in regards to the user UI, visit [this repository](https://github.com/AugustsKir/user-system-frontend).

## Endpoints

- /api/user [POST] - Saves the user to the database;
- /api/user/{id} [DELETE] - Deletes the selected user based on ID;
- /api/user/{id} [GET] - Finds and returns a user by ID;
- /api/user/all [GET] - Returns a list of all users;
- /api/user/update [POST] - Updates the given user. Body accepts a User object.

## JSON example for /api/user [POST]

```json
{
    "name": "Peter",
    "email": "example@gmail.com",
    "password": "12345678",
    "age": 21,
}

```

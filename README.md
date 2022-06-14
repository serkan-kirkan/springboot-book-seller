#Spring Boot Book Seller

### Sign-up

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
"name":"user",
"username":"user",
"password":"user"
}
```
### Sign-in
```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "username":"user",
    "password":"user"
}
```

### Make-admin

```
PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey1234!
```

### Save Book

```
POST /api/book HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbjEiLCJyb2xlcyI6IlJPTEVfQURNSU4iLCJ1c2VySWQiOjUsImV4cCI6MTY1NTMwNjg1N30.idB3gGYNmvS6dDxz7dzK09GvclnHZGRig2z0wxvInyxAT0I5ENiiKkXH4zqXVtxNI6iP8zX9HYJspZ3FCX7IPw
Content-Type: application/json
Content-Length: 120

{
    "title":"Test Book 2",
    "price":10,
    "description":"Test description 2",
    "author":"Test author 2"
}
```

### Delete Book

```
DELETE /api/book/2 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbjEiLCJyb2xlcyI6IlJPTEVfQURNSU4iLCJ1c2VySWQiOjUsImV4cCI6MTY1NTMwNjg1N30.idB3gGYNmvS6dDxz7dzK09GvclnHZGRig2z0wxvInyxAT0I5ENiiKkXH4zqXVtxNI6iP8zX9HYJspZ3FCX7IPw
}
```

### Get All Books

```
GET /api/book HTTP/1.1
Host: localhost:8080
}
```

### Save Purchases

```
POST /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyMSIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjo0LCJleHAiOjE2NTUzMDc0NDF9.TRdFsL7D7NUlkU-Ung4jSCdXWvBtMcPQTOt9cJvpTdfVVjmeIfw88d02fUR4lVUVyJAm53wQ-Qwghl4kVGOsZA
Content-Type: application/json
Content-Length: 56

{
    "userId":3,
    "bookId":1,
    "price":10

}
```

### Get User Purchases

```
GET /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MywiZXhwIjoxNjU1MzA5MTQxfQ.U77E_9sP8RCHSd7TLYyUwQgF79vKccI1lRsCQ-h9WnIM4St1cBP9L4gEq_Z-8HTF1GigWmK5VS4HMyLnxKFvdA/;
```

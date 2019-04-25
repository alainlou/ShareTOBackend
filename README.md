# ShareTOBackend
A Java Spring Boot backend service using Google's GeoCoding API to translate addresses into geographical coordinates. This is also a service layer to perform CRUD operations on a MongoDB cluster hosted on GCP.

(Frontend is [here](https://github.com/alainlou/ShareTOFrontend))

## API Spec
| HTTP Method | Path | Return Value |
| ----------- | ---- | ------------ |
| `GET` | /items | Gets all items in the database
| `GET` | /items/{title} | Gets all items that fuzzy-match to the path variable `title`
| `POST` | /items | Creates an item in the DB from a SimpleItem (no latlng) - taken from request body

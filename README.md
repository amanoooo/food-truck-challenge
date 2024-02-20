# food-truck-challenge

<font color="#dd0000">**document how to get started with your solution**</font>

```bash
docker run -p 8080:8080 amanohikaru/food-truck-challenge
```

## test

### easy list with filter
```bash
curl -X 'POST' \
  'http://localhost:8080/mobileFoodInfo/selectAll?current=1&size=2' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
    "applicant":"Ziaurehman Amini"
    }'
```
### get detail with id
```bash
curl -X 'GET' \
  'http://localhost:8080/mobileFoodInfo/selectOne?id=1' \
  -H 'accept: */*'
```

### insert new record
```bash
curl -X 'POST' \
  'http://localhost:8080/mobileFoodInfo/insert' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "locationid": -1,
  "applicant": "string",
  "facilityType": "string",
  "cnn": "string",
  "locationDescription": "string",
  "address": "string",
  "permit": "string",
  "status": "string",
  "foodItems": "string"
}'
```
### update by id
```bash
curl -X 'POST' \
  'http://localhost:8080/mobileFoodInfo/update' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 1,
  "locationid": 2
}'


```

## github link
https://github.com/amanoooo/food-truck-challenge

## h2 web ui

```bash
http://localhost:8080/h2-console
```

## api doc

```bash
http://localhost:8080/swagger-ui/index.html
```

## docker ops

```bash
docker build -t amanohikaru/food-truck-challenge .
docker push amanohikaru/food-truck-challenge
```
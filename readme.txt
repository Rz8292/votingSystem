# Vote System Application

This Spring Boot application implements a simple vote system where users can enter candidates, cast votes, count votes, list votes, and get the winner.

## Features

1. **Enter Candidate**
   - Endpoint: `http://localhost:8080/entercandidate`
   - Method: `GET`
   - Parameters: 
      - `name` (String) - The name of the candidate to be entered.
   - Description: Enters a new candidate with the specified name and initializes their vote count to 0.

2. **Cast Vote**
   - Endpoint: `http://localhost:8080/castvote`
   - Method: `GET`
   - Parameters:
      - `name` (String) - The name of the candidate to cast a vote for.
   - Description: Casts a vote for the specified candidate. The candidate must be valid; otherwise, the API returns -1.

3. **Count Vote**
   - Endpoint: `http://localhost:8080/countvote`
   - Method: `GET`
   - Parameters:
      - `name` (String) - The name of the candidate to count votes for.
   - Description: Returns the latest vote count for the specified candidate. The candidate must be valid; otherwise, the API returns -1.

4. **List Vote**
   - Endpoint: `http://localhost:8080/listvote`
   - Method: `GET`
   - Description: Returns a JSON representation of all candidates and their respective vote counts.

5. **Get Winner**
   - Endpoint: `http://localhost:8080/getwinner`
   - Method: `GET`
   - Description: Returns the name of the candidate who received the largest number of votes.

## Usage

1. **Enter Candidate Example:**
   ```http
   GET http://localhost:8080/entercandidate?name=ajay
